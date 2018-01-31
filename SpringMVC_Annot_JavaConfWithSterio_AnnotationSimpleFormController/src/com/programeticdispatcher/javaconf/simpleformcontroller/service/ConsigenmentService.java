package com.programeticdispatcher.javaconf.simpleformcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programeticdispatcher.javaconf.simpleformcontroller.bo.Consigenment;
import com.programeticdispatcher.javaconf.simpleformcontroller.bo.ConsigenmentStatus;
import com.programeticdispatcher.javaconf.simpleformcontroller.bo.Contact;
import com.programeticdispatcher.javaconf.simpleformcontroller.command.NewConsigenmentForm;
import com.programeticdispatcher.javaconf.simpleformcontroller.dao.NewConsigenmentDao;
import com.programeticdispatcher.javaconf.simpleformcontroller.dto.ConsigenmentDTO;

@Service
@Transactional(readOnly=false)
public class ConsigenmentService {
	
	@Autowired
	NewConsigenmentDao newConsigenment;
	
    public ConsigenmentService() {
	  System.out.println("Consigenment service class constructor"); 
    }
    
    public ConsigenmentStatus addConsigenment(NewConsigenmentForm consigenmentForm){
	  System.out.println("inside addConsigenment method of service class");
	  Contact fromContact = null;
	  Contact toContact = null;
	  Consigenment consigenment = null;
	  ConsigenmentStatus consigenmentStatus =null;
	  ConsigenmentDTO consigenmentDTO = null;
	  fromContact = new Contact();
	  
	  //From Contact
	  fromContact.setName(consigenmentForm.getFromName());
	  fromContact.setAddressLine1(consigenmentForm.getFromAddressLine1());
	  fromContact.setAddressLine2(consigenmentForm.getFromAddressLine2());
	  fromContact.setCity(consigenmentForm.getFromCity());
	  fromContact.setState(consigenmentForm.getFromState());
	  fromContact.setCountry(consigenmentForm.getFromCountry());
	  fromContact.setZipcode(consigenmentForm.getFromZipcode());
	  fromContact.setMobile(consigenmentForm.getFromMobile());
	  fromContact.setEmail(consigenmentForm.getFromEmail());
	  
	  //To Contact
	  toContact = new Contact();
	  toContact.setName(consigenmentForm.getToName());
	  toContact.setAddressLine1(consigenmentForm.getToAddressLine1());
	  toContact.setAddressLine2(consigenmentForm.getToAddressLine2());
	  toContact.setCity(consigenmentForm.getToCity());
	  toContact.setState(consigenmentForm.getToState());
	  toContact.setCountry(consigenmentForm.getToCountry());
	  toContact.setZipcode(consigenmentForm.getToZipcode());
	  toContact.setMobile(consigenmentForm.getToMobile());
	  toContact.setEmail(consigenmentForm.getToEmail());
	  
	  //Consigenment Bo
	  consigenment = new Consigenment();
	  consigenment.setAmount(consigenmentForm.getAmount());
	  consigenment.setCourierType(consigenmentForm.getCourierType());
	  consigenment.setFromContact(fromContact);
	  consigenment.setToContact(toContact);
	  consigenment.setNoOfDays(consigenmentForm.getNoOfDays());
	  consigenment.setSericeName(consigenmentForm.getSericeName());
	  consigenment.setWeight(consigenmentForm.getWeight());
	  
	  //calling Dao class method
	   consigenmentStatus = newConsigenment.saveConsigenment(consigenment);
	   consigenmentDTO = new ConsigenmentDTO();
	   consigenmentDTO.setMobileNo(consigenmentStatus.getMobileNo());
	   consigenmentDTO.setOrderId(consigenmentStatus.getOrderId());
	   consigenmentDTO.setTractId(consigenmentStatus.getTractId());
	   consigenmentDTO.setStatus(consigenmentStatus.isStatus());
	  return consigenmentStatus;
  }
}
