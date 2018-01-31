package com.programeticdispatcher.javaconf.simpleformcontroller.bo;

public class Consigenment {
	public Consigenment() {
		System.out.println("Consigenment Bo class constructor");
	}
	 private String sericeName;
	  private String courierType;
	  private double weight;
	  private float amount;
	  private int noOfDays;
	  private Contact fromContact;
	  private Contact toContact;
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
	public Contact getFromContact() {
		return fromContact;
	}
	public void setFromContact(Contact fromContact) {
		this.fromContact = fromContact;
	}
	public Contact getToContact() {
		return toContact;
	}
	public void setToContact(Contact toContact) {
		this.toContact = toContact;
	}
}
