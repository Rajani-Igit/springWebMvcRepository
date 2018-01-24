package com.programeticdispatcher.javaconf.abstractcommandcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.programeticdispatcher.javaconf.abstractcommandcontroller.dto.PlansDTO;
import com.programeticdispatcher.javaconf.abstractcommandcontroller.form.SearchForm;

/* This class acts as AbstractCommandController bcz
 * as per the Source and Target Charecterstics it will not 
 * have any form validation but it have form handing and displaying 
 * dynamic data with in another jsp
 * */

@Controller
public class SerachPlansController {
  public SerachPlansController() {
	  System.out.println("inside SearchPlansController class constructor");
}
  
  @RequestMapping("/search-plans.htm")
  public String dispalyPlansBasedOnSearch(@ModelAttribute SearchForm searchForm , Model model) {
	  System.out.println("inside dispalyPlansBasedOnSearch method od controller");
	  System.out.println("search form "+searchForm);
	  List<PlansDTO> plansList = null;
	  PlansDTO plansDTO = null;
	  plansList = new ArrayList<PlansDTO>();
	  for(int i=0;i<5;i++) {
		  plansDTO = new PlansDTO();
		  plansDTO.setPlanName("Plan -"+1);
		  plansDTO.setValidity("23 days");
		  plansDTO.setRoaming(false);
		  plansDTO.setTalktime(100.2f+i);
		  plansDTO.setAmount(78+i);
		  plansList.add(plansDTO);
	  }
	  model.addAttribute("plansList", plansList);
	  return "matching-plans";
  }
}
