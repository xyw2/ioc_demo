package com.xiyw.ioc_demo.ioc10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.xiyw.ioc_demo.ioc10")
public class ApplicationConfig {
	
	@Bean
	public User getUser(){
		return new User("ApplicationConfig.getUser");
	}

}
