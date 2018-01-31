package com.programeticdispatcher.javaconf.simpleformcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.programeticdispatcher.javaconf.simpleformcontroller.bo.ConsigenmentStatus;
import com.programeticdispatcher.javaconf.simpleformcontroller.command.NewConsigenmentForm;
import com.programeticdispatcher.javaconf.simpleformcontroller.service.ConsigenmentService;
import com.programeticdispatcher.javaconf.simpleformcontroller.validator.ConsigenmentValidator;

@Controller
@RequestMapping("/new-consigenment.htm")
public class NewConsigenmentController {
	
	@Autowired
	ConsigenmentService consigenmentService;
	@Autowired
	ConsigenmentValidator validator;
	public NewConsigenmentController() {
		System.out.println("inside NewConsigenmentController constructor");
	}
	
	//@GetMapping
	@RequestMapping(method=RequestMethod.GET)
  public String showConsigenment(Model model) {
	System.out.println("inside showConsigenement method");
	model.addAttribute("newConsigenmentForm", new NewConsigenmentForm());
	return "new-consigenment";
  }
	
	//@PostMapping
	@RequestMapping(method=RequestMethod.POST)
	public String createConsigenment(@ModelAttribute(name="newConsigenmentForm") NewConsigenmentForm newConsigenmentForm , Model model ,BindingResult errors) {
		System.out.println("inside createConsigenment method"+newConsigenmentForm);	
		if(newConsigenmentForm!=null) {
			validator.supports(NewConsigenmentForm.class);
			validator.validate(newConsigenmentForm, errors);
		}
		ConsigenmentStatus consigenmentStatus = null; 
		List<ConsigenmentStatus> listConsigenmentStatus = null;
		if(errors.hasErrors()) {
			model.addAttribute("errors", errors);
			return "new-consigenment";
		}
		listConsigenmentStatus = new ArrayList<ConsigenmentStatus>();
		//if there are no errors then forword to sucess page
		consigenmentStatus = consigenmentService.addConsigenment(newConsigenmentForm);
		listConsigenmentStatus.add(consigenmentStatus);
		model.addAttribute("listConsigenmentStatus", listConsigenmentStatus);
		return "consigenment-sucess";
	}
}
