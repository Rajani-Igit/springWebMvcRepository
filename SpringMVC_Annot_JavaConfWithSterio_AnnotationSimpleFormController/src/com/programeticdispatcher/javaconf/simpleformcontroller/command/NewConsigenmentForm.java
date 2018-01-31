package com.programeticdispatcher.javaconf.simpleformcontroller.command;

public class NewConsigenmentForm {
	public NewConsigenmentForm() {
		System.out.println("consigenmentform class constructor ");
	}
  private String fromName;
  private String fromMobile;
  private String fromAddressLine1;
  private String fromAddressLine2;
  private String fromCity;
  private String fromState;
  private String fromCountry;
  private int fromZipcode;
  private String fromEmail;
  
  //To Details
  private String toName;
  private String toMobile;
  private String toAddressLine1;
  private String toAddressLine2;
  private String toCity;
  private String toState;
  private String toCountry;
  private int toZipcode;
  private String toEmail;
  
  //common details
  private String sericeName;
  private String courierType;
  private double weight;
  private float amount;
  private int noOfDays;
public String getFromName() {
	return fromName;
}
public void setFromName(String fromName) {
	this.fromName = fromName;
}
public String getFromMobile() {
	return fromMobile;
}
public void setFromMobile(String fromMobile) {
	this.fromMobile = fromMobile;
}
public String getFromAddressLine1() {
	return fromAddressLine1;
}
public void setFromAddressLine1(String fromAddressLine1) {
	this.fromAddressLine1 = fromAddressLine1;
}
public String getFromAddressLine2() {
	return fromAddressLine2;
}
public void setFromAddressLine2(String fromAddressLine2) {
	this.fromAddressLine2 = fromAddressLine2;
}
public String getFromCity() {
	return fromCity;
}
public void setFromCity(String fromCity) {
	this.fromCity = fromCity;
}
public String getFromState() {
	return fromState;
}
public void setFromState(String fromState) {
	this.fromState = fromState;
}
public String getFromCountry() {
	return fromCountry;
}
public void setFromCountry(String fromCountry) {
	this.fromCountry = fromCountry;
}
public int getFromZipcode() {
	return fromZipcode;
}
public void setFromZipcode(int fromZipcode) {
	this.fromZipcode = fromZipcode;
}
public String getFromEmail() {
	return fromEmail;
}
public void setFromEmail(String fromEmail) {
	this.fromEmail = fromEmail;
}
public String getToName() {
	return toName;
}
public void setToName(String toName) {
	this.toName = toName;
}
public String getToMobile() {
	return toMobile;
}
public void setToMobile(String toMobile) {
	this.toMobile = toMobile;
}
public String getToAddressLine1() {
	return toAddressLine1;
}
public void setToAddressLine1(String toAddressLine1) {
	this.toAddressLine1 = toAddressLine1;
}
public String getToAddressLine2() {
	return toAddressLine2;
}
public void setToAddressLine2(String toAddressLine2) {
	this.toAddressLine2 = toAddressLine2;
}
public String getToCity() {
	return toCity;
}
public void setToCity(String toCity) {
	this.toCity = toCity;
}
public String getToState() {
	return toState;
}
public void setToState(String toState) {
	this.toState = toState;
}
public String getToCountry() {
	return toCountry;
}
public void setToCountry(String toCountry) {
	this.toCountry = toCountry;
}
public int getToZipcode() {
	return toZipcode;
}
public void setToZipcode(int toZipcode) {
	this.toZipcode = toZipcode;
}
public String getToEmail() {
	return toEmail;
}
public void setToEmail(String toEmail) {
	this.toEmail = toEmail;
}
public String getSericeName() {
	return sericeName;
}
public void setSericeName(String sericeName) {
	this.sericeName = sericeName;
}
public String getCourierType() {
	return courierType;
}
public void setCourierType(String courierType) {
	this.courierType = courierType;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}
public int getNoOfDays() {
	return noOfDays;
}
public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}
}
