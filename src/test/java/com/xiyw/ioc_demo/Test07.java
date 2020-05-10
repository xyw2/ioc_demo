package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiyw.ioc_demo.ioc07.Student;

public class Test07 {

	/**
	 * 07版本，通过注解标注了2个bean
	 * XML使用contexnt:component-scan扫描所在包
	 * teacher07在加载xml文件时被自动创建
	 * student07配置了lazy，不被使用时就不创建
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Teacher teacher07 = (Teacher)ac.getBean("teacher07");
		System.out.println("XML配置文件已加载完成，student07配置了lazy没有在启动时创建");
		Student student07 = (Student)ac.getBean("student07");
	}

}
