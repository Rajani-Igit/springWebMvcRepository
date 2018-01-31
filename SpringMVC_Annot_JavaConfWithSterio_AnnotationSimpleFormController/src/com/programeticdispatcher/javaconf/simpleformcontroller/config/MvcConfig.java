package com.programeticdispatcher.javaconf.simpleformcontroller.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages= {"com.programeticdispatcher.javaconf.simpleformcontroller.controller"})
 public class MvcConfig extends WebMvcConfigurerAdapter {
  public MvcConfig() {
	  System.out.println("inside MvcConfig class constructor");
}
  /*@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	  System.out.println("inside addViewControllers method");
	  registry.addViewController("/new-consigenment.htm").setViewName("new-consigenment");
	}*/
  @Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	  System.out.println("inside configureViewResolvers method");
	  registry.jsp("/WEB-INF/jsp/" ,".jsp");
	}
} 
