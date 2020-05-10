package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xiyw.ioc_demo.ioc12.ApplicationConfig12;
import com.xiyw.ioc_demo.ioc12.DBUtils12;

public class Test12 {

	/**
	 * 12版本，不同于11版用xml的context:property-placeholder读取db.properties
	 * 12版用@PropertySource来读取该文件，这个注解作用于Spring配置类上(@Configuration)
	 * 用@value("${}")来获取属性文件的值，可用于数据库连接等实例在启动时的新建
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig12.class);
		DBUtils12 dBUtils12 = (DBUtils12)ac.getBean(DBUtils12.class);
		String password = dBUtils12.getPassword();
		System.out.println(password);
	}

}
