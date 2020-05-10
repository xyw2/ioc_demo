package com.xiyw.ioc_demo;

import com.xiyw.ioc_demo.ioc05.BookService;
import com.xiyw.ioc_demo.ioc05.BookServiceImpl;

public class Test5 {

	/**
	 * 05版本，通过applicationContext.xml配置了bean，启动时自动装入容器
	 * 使用Spring的AppcationContext的getBean方法使用xml配置的beanId获取
	 */
	public static void main(String[] args){
		BookService bookservice = new BookServiceImpl();
		bookservice.addBook("《Spring MVC权威指南 第一版》");
	}

}
