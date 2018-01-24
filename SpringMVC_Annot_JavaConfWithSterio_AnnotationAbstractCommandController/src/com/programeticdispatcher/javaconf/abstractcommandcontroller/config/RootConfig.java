package com.programeticdispatcher.javaconf.abstractcommandcontroller.config;

import org.springframework.context.annotation.Configuration;

/*This class is used to configure Remaining Components apart from Spring Mvc in Java Configuration Way*/
@Configuration
public class RootConfig {
  public RootConfig() {
	System.out.println("inside RootConfig class constructor ");  
  }
}
