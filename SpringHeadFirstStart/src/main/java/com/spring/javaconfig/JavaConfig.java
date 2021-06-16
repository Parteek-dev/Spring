package com.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**using this annotation @Configuration  because we are not using XML configuration
 * used @ComponentScan(basePackages = "com.spring.javaconfig" ) because we are not defined in the XML
 * for packages scan
 * if you are using @Bean anno then no need to define @ComponentScan anno because we are using so, spring
 * container will scan for the component class but we are not using component
 * @author Parteek.Kumar
 *
 */

@SuppressWarnings("unused")
@Configuration
@ComponentScan(basePackages = "com.spring.javaconfig" )
public class JavaConfig {

	public JavaConfig() {
		
	}
	
	/**
	 * @Bean is an alternative of @component 
	 * @return
	 */
	

//	  @Bean public Addition getAdd() { return new Addition(); }
//	  
//	  @Bean public Subtract getSub() { return new Subtract(); }
//	  
//	  @Bean public Maths getMaths() { return new Maths(getAdd(), getSub()); }


}