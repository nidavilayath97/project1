package com.mycompany.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mycompany.app")
public class JavaConfig {


  /*@Bean 
  public Circle circle() {
	return new Circle();
  }*/
	
// this is to be used when @Component is not used 
	//this is used to create an object or bean in the beanfactory
	//
  
  
}