package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xiyw.ioc_demo.ioc10.ApplicationConfig;
import com.xiyw.ioc_demo.ioc10.User;

public class Test10 {

	/**
	 * 10版本，使用无XML配置方式，用注解@Configuration表示ApplicationConfig为配置类
	 * 由@ComponentScan指定扫描包
	 * 由@bean等价于XML中的bean标签，用于方法时表示把这个方法的返回类型作为bean，beanid是方法名
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println("------------");
		User getUser = (User) ac.getBean("getUser");
		User user = (User) ac.getBean("user");
		System.out.println(getUser == user);
	}

}
