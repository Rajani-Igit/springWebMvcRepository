package com.programeticdispatcher.javaconf.simpleformcontroller.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.programeticdispatcher.javaconf.simpleformcontroller.bo.Consigenment;
import com.programeticdispatcher.javaconf.simpleformcontroller.bo.ConsigenmentStatus;
import com.programeticdispatcher.javaconf.simpleformcontroller.bo.Contact;

@Repository
public class NewConsigenmentDao {
	private final String INS_CONTACT = "INSERT INTO contact(contact_name ,mobile ,flat ,colny ,city ,state ,country ,zipcode ,email) VALUES (? ,? ,? ,? ,? ,? ,? ,? ,?)";
	private final String INS_CONSIGENMENT = "INSERT INTO consigenment(serice_name ,courier_type , weight ,amount ,no_of_days ,from_contact ,to_contact) VALUES (? ,? ,? ,? ,? ,? ,?)"; 
    
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public NewConsigenmentDao() {
	System.out.println("inside NewConsigenmentDao class constructor");
  }

	public ConsigenmentStatus saveConsigenment(Consigenment consigenment){
		System.out.println("inside dao class save consigenment method");
		ConsigenmentStatus consigenmentStatus = null;
		int fromContact = saveContact(consigenment.getFromContact());
		int toContact = saveContact(consigenment.getToContact());
		int rowUpdated = jdbcTemplate.update(INS_CONSIGENMENT, new Object[] {consigenment.getSericeName() ,consigenment.getCourierType() ,consigenment.getWeight() ,consigenment.getAmount() ,consigenment.getNoOfDays() ,fromContact ,toContact});
		System.out.println("How Many Rows Updated "+rowUpdated);
		if(rowUpdated == 1) {
			consigenmentStatus = new ConsigenmentStatus();
			consigenmentStatus.setOrderId(123);
			consigenmentStatus.setTractId(UUID.randomUUID().toString());
			consigenmentStatus.setStatus(true);
			consigenmentStatus.setMobileNo(consigenment.getToContact().getMobile());
		}
		return consigenmentStatus;
	}
	
	public int saveContact(Contact contact) {
		System.out.println("inside contact method");
		GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
		int contactId = jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conncection) throws SQLException {
				System.out.println("inside createPreparedStatement method");
				PreparedStatement preparedStatement = conncection.prepareStatement(INS_CONTACT ,new String[] {"contact_id"});
				preparedStatement.setString(1, contact.getName());
				preparedStatement.setString(2, contact.getMobile());
				preparedStatement.setString(3, contact.getAddressLine1());
				preparedStatement.setString(4, contact.getAddressLine2());
				preparedStatement.setString(5, contact.getCity());
				preparedStatement.setString(6, contact.getState());
				preparedStatement.setString(7, contact.getCountry());
				preparedStatement.setInt(8, contact.getZipcode());
				preparedStatement.setString(9, contact.getEmail());
				return preparedStatement;
			}
		}, keyHolder);
		return contactId;
	}
}
