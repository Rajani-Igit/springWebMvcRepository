package com.programeticdispatcher.javaconf.simpleformcontroller.dto;

public class ConsigenmentDTO {
  public ConsigenmentDTO() {
	  System.out.println("inside ConsigementDTO class constructor");
  }
  private int orderId;
  private boolean status;
  private String mobileNo;
  private String tractId;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getTractId() {
	return tractId;
}
public void setTractId(String tractId) {
	this.tractId = tractId;
}
}
