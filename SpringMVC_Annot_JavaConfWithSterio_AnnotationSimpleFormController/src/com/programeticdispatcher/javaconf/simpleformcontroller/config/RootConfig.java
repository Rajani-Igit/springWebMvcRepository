package com.programeticdispatcher.javaconf.simpleformcontroller.config;

import java.util.Locale;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.support.DefaultActiveProfilesResolver;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping;



@Configuration
@ComponentScan(basePackages= {"com.programeticdispatcher.javaconf.simpleformcontroller.service" ,"com.programeticdispatcher.javaconf.simpleformcontroller.dao","com.programeticdispatcher.javaconf.simpleformcontroller.validator"})
@PropertySource(value="classpath:db.properties")
public class RootConfig {
	@Autowired
	Environment env;
	
   public RootConfig() {
	  System.out.println("inside RootConfi class constructor");
   }
   
  @Bean(name = "dataSource")
  public DataSource dataSource() {
	  System.out.println("inside DriverManagerDataSource");
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName(env.getProperty("driverClassName"));
	  dataSource.setUrl(env.getProperty("driverUrl"));
	  dataSource.setUsername(env.getProperty("uname"));
	  dataSource.setPassword(env.getProperty("password"));
	  return dataSource;
  }
  
  @Bean(autowire=Autowire.BY_TYPE)
  public JdbcTemplate jdbcTemplate() {
	  System.out.println("inside JdbcTemplate");
	  JdbcTemplate jdbcTempalte = new JdbcTemplate();
	  return jdbcTempalte;
  }
  
  @Bean(name="messageSource")
  public ResourceBundleMessageSource messageSource() {
	  System.out.println("inside ResourceBundleMessageSource");
	  ResourceBundleMessageSource messageSource= new ResourceBundleMessageSource();
	  messageSource.setBasename("error-messages");
	  messageSource.setFallbackToSystemLocale(false);
	  return messageSource;
  }
  
  /*@Bean
  public SessionLocaleResolver localeResolver() {
	  SessionLocaleResolver sessionResolver = new SessionLocaleResolver();
	  sessionResolver.setDefaultLocale( Locale.ENGLISH);
	  return sessionResolver;
  }
  
  @Bean
  public LocaleChangeInterceptor localeChangeInterceptor() {
	  LocaleChangeInterceptor localeChange = new LocaleChangeInterceptor();
	  localeChange.setParamName("lang");
	  return localeChange;
  }
  
 @Bean(autowire=Autowire.BY_TYPE)
  public HandlerMapping handlerMapping() {
	  DefaultAnnotationHandlerMapping defaul = new DefaultAnnotationHandlerMapping();
	  return defaul;
  }*/
}
