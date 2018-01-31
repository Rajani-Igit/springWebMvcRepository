package com.programeticdispatcher.javaconf.simpleformcontroller.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.programeticdispatcher.javaconf.simpleformcontroller.config.MvcConfig;
import com.programeticdispatcher.javaconf.simpleformcontroller.config.RootConfig;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    
	public ApplicationInitializer() {
		System.out.println("inside ApplicationInitializer class constructor");
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfig classes method");
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses method");
		return new Class<?>[] {MvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings method");
		return new String[] {"*.htm"};
	}

}
