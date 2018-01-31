package com.programeticdispatcher.javaconf.simpleformcontroller.bo;

public class ConsigenmentStatus {
	public ConsigenmentStatus() {
		System.out.println("inside ConsigenmentStatus class constructor");
	}
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
  private int orderId;
  private boolean status;
  private String mobileNo;
  private String tractId;
}
