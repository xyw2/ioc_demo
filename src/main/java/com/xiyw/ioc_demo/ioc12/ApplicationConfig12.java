package com.xiyw.ioc_demo.ioc12;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.xiyw.ioc_demo.ioc12")
@PropertySource("db.properties")
public class ApplicationConfig12 {
	
}
