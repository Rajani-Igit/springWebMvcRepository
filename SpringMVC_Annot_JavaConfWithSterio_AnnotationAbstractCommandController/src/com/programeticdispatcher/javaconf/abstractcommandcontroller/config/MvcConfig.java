package com.programeticdispatcher.javaconf.abstractcommandcontroller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*This class is used to Configure Spring Mvc Components in Java Configuration Way*/
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.programeticdispatcher.javaconf.abstractcommandcontroller.controller"})
public class MvcConfig extends WebMvcConfigurerAdapter {
  
	public MvcConfig() {
     System.out.println("inside Mvc Config class constructor ");	  
    }
   
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("inside addViewControllers method ");
		registry.addViewController("/search.htm").setViewName("search-plans");
	}
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		System.out.println("inside configureViewResolvers method");
		registry.jsp("/WEB-INF/jsp/" , ".jsp");
	}
  
}
