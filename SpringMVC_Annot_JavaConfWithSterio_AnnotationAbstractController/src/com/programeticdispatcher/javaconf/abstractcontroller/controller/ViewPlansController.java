package com.programeticdispatcher.javaconf.abstractcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.programeticdispatcher.javaconf.abstractcontroller.dto.PlansDTO;

//This class act as Controller

@Controller
public class ViewPlansController {
	/*you can place the return type as void or Model or Map or ModelMap also in such a case it will identify the
	 * Logical View Name by taking the help from RequestToViewName implimentation class i.e DefaultRequestToViewName class
	 * this will return the logical view name from requested url only means plans it will return in case 
	 * So you can return void also as return type that is the one more component comming from SpringMvc
	 * */
	@RequestMapping("/plans.htm")
   public String showPlans(Model model , @RequestParam("provider") String provider) {
	   System.out.println("inside showPlans method");
	   System.out.println("request Parameter is "+provider);
	   if(provider.equalsIgnoreCase("airtel")) {
		  System.out.println("inside airtel block");  
		   //call service and service will call dao so dynamic data you can get
		    //assume you have got this Plans DTO from Service Method
		    List<PlansDTO> list = null;
		    list = new ArrayList<PlansDTO>();
		    list.add(new PlansDTO("Airtel1", 110, 23, 90));
		    list.add(new PlansDTO("Airtel2", 220, 45, 195));
		    list.add(new PlansDTO("Airtel3", 330, 60, 300));
		    model.addAttribute("plansList",list);
	   }else if(provider.equalsIgnoreCase("vodafone")) {
		   System.out.println("inside vodafone block");
		   //call service and service will call dao so dynamic data you can get
		   //assume you have got this Plans DTO from Service Method
		    List<PlansDTO> list = null;
		    list = new ArrayList<PlansDTO>();
		    list.add(new PlansDTO("Vodafone1", 110, 23, 90));
		    list.add(new PlansDTO("Vodafone2", 220, 45, 195));
		    list.add(new PlansDTO("Vodafone3", 330, 60, 300));
		    model.addAttribute("plansList" ,list);
	   }else if(provider.equalsIgnoreCase("idea")) {
		   System.out.println("inside idea block");
		   //call service and service will call dao so dynamic data you can get
		   //assume you have got this Plans DTO from Service Method
		    List<PlansDTO> list = null;
		    list = new ArrayList<PlansDTO>();
		    list.add(new PlansDTO("Idea1", 110, 23, 90));
		    list.add(new PlansDTO("Idea2", 220, 45, 195));
		    list.add(new PlansDTO("Idea3", 330, 60, 300));
		    model.addAttribute("plansList" ,list);
	   }else {
		   System.out.println("inside jio block");
		   //call service and service will call dao so dynamic data you can get
		   //assume you have got this Plans DTO from Service Method
		    List<PlansDTO> list = null;
		    list = new ArrayList<PlansDTO>();
		    list.add(new PlansDTO("Jio1", 110, 23, 90));
		    list.add(new PlansDTO("Jio2", 220, 45, 195));
		    list.add(new PlansDTO("Jio3", 330, 60, 300));
		    model.addAttribute("plansList" ,list);
	   }
	   return "plans";
   }
}
