package com.programeticdispatcher.javaconf.simpleformcontroller.bo;

public class Contact {
  public Contact() {
	  System.out.println("inside Contact class constructor");
}
  private String name;
  private String mobile;
  private String addressLine1;
  private String addressLine2;
  private String city;
  private String state;
  private String country;
  private int zipcode;
  private String email;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}
public void setAddressLine2(String addressLine2) {
	this.addressLine2 = addressLine2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
