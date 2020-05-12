package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.xiyw.ioc_demo.ioc12.ApplicationConfig12;
import com.xiyw.ioc_demo.ioc12.DBUtils12;

public class Test12 {

	/**
	 * 12版本，不同于11版用xml的context:property-placeholder读取db.properties
	 * 12版用@PropertySource来读取该文件，这个注解作用于Spring配置类上(@Configuration)
	 * 不同于11版本，context:property-placeholder可以自动完成PropertySourcesPlaceholderConfigurer的bean注册
	 * 使用@PropertySource读取文件，PropertySourcesPlaceholderConfigurer这个bean要自己手动注册
	 * 用@value("${}")来获取属性文件的值，可用于数据库连接等实例在启动时的新建
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig12.class);
		Environment environment = ac.getEnvironment();
		System.out.println("environment.getProperty('db.driverClass')=" + environment.getProperty("db.driverClass"));
	}

}
