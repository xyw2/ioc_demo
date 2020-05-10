package com.xiyw.ioc_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {

	/**
	 * 11版本，用context:property-placeholder标签读取属性文件db.properties
	 * 用@value("${}")来获取属性文件的值，可用于数据库连接等实例在启动时的新建
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext11.xml");
	}

}
