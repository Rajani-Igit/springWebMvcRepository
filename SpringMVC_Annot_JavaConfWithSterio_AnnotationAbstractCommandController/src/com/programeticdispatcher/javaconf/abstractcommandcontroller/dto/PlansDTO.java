package com.programeticdispatcher.javaconf.abstractcommandcontroller.dto;

public class PlansDTO {
  public PlansDTO() {
	  System.out.println("inside PlansDTO class constructor");
  }
  private String planName;
  private int amount;
  private String validity;
  private boolean roaming;
  private float talktime;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public boolean isRoaming() {
		return roaming;
	}
	public void setRoaming(boolean roaming) {
		this.roaming = roaming;
	}
	public float getTalktime() {
		return talktime;
	}
	public void setTalktime(float talktime) {
		this.talktime = talktime;
	}
   
}
