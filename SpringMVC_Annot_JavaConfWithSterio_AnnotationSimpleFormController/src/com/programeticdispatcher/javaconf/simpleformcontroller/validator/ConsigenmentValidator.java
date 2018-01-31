package com.programeticdispatcher.javaconf.simpleformcontroller.validator;

import java.util.Locale;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.programeticdispatcher.javaconf.simpleformcontroller.command.NewConsigenmentForm;
@Component
public class ConsigenmentValidator implements Validator {
  public ConsigenmentValidator() {
	  System.out.println("validator class constructor");
  }

@Override
public boolean supports(Class<?> classType) {
	System.out.println("inside supports method of validator class");
	return classType.isAssignableFrom(NewConsigenmentForm.class);
}

@Override
public void validate(Object object, Errors errors) {
	System.out.println("inside validate method of validator class");
	NewConsigenmentForm newConsigenmentForm = (NewConsigenmentForm)object;
	System.out.println("current locale is "+Locale.getDefault());
	if(newConsigenmentForm.getFromName().equals("") || newConsigenmentForm.getFromName().length() == 0 ) {
		errors.rejectValue("fromName", "fromName.required");
	}
	if(newConsigenmentForm.getToName().equals("") || newConsigenmentForm.getToName().length() == 0) {
		errors.rejectValue("toName", "toName.required");
	}
	if(newConsigenmentForm.getFromMobile().equals("") || newConsigenmentForm.getFromMobile().length()==0 ) {
		errors.rejectValue("fromMobile", "fromMobile.required");
	}
	if(newConsigenmentForm.getFromZipcode() <=1000) {
		errors.rejectValue("fromZipcode", "fromZipcode.required");
	}
	if(newConsigenmentForm.getFromEmail().equalsIgnoreCase("") || newConsigenmentForm.getFromEmail().length()==0) {
		errors.rejectValue("fromEmail", "fromEmail.required");
	}
	if(newConsigenmentForm.getToMobile().equals("") || newConsigenmentForm.getToMobile().length()==0 ) {
		errors.rejectValue("toMobile", "toMobile.required");
	}
	if(newConsigenmentForm.getToZipcode() <=1000) {
		errors.rejectValue("toZipcode", "toZipcode.required");
	}
	if(newConsigenmentForm.getToEmail().equalsIgnoreCase("") || newConsigenmentForm.getToEmail().length()==0) {
		errors.rejectValue("toEmail", "toEmail.required");
	}	
}
}
