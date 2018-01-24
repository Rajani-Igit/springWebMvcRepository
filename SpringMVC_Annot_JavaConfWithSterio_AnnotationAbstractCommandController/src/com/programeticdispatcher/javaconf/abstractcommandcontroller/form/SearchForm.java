package com.programeticdispatcher.javaconf.abstractcommandcontroller.form;
/*This class is to bind the search-plans form to the attributes of this class
 * earlier it named as command but incase if annotations we have to name it as 
 * Form object
 * */
public class SearchForm {
	
	public SearchForm() {
	System.out.println("inside SearchForm class constructor");
	}
   private String planName;
   private String type;
   private String validity;
   @Override
public String toString() {
	return "SearchForm [planName=" + planName + ", type=" + type + ", validity=" + validity + ", amount=" + amount
			+ "]";
}
private int amount;
   
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
