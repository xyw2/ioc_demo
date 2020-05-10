package com.xiyw.ioc_demo;

import com.xiyw.ioc_demo.ioc05.BookService;
import com.xiyw.ioc_demo.ioc05.BookServiceImpl;

public class Test05 {

	/**
	 * 05版本，通过applicationContext.xml配置了bean，启动时自动装入容器
	 * 使用Spring的AppcationContext的getBean方法使用xml配置的beanId获取 
	 * getBean(String name)使用xml文件中配置bean时用的id
	 * getBean(Class<T> type)使用xml文件中配置bean时用的BookDao.class
	 * getBean(String name,Class<T> type)如果name或type不唯一，可以结合在一起来保证get的bean唯一
	 * bean的scope属性在没有配置的前提下，默认是获取的bean是单例
	 * singleton每个IOC作用域中的一个bean定义只有一个实例
	 * prototype每个IOC作用域中的一个bean定义有多个实例
	 * request每个IOC作用域中的一个bean定义只作用于HTTP request生命周期
	 * session每个IOC作用域中的一个bean定义只作用于HTTP session生命周期
	 * global session每个IOC作用域中的一个bean定义作用于全局的HTTP session生命周期
	 * appliction每个IOC作用域中的一个bean定义作用于整个servletContext生命周期
	 * 
	 */
	public static void main(String[] args) {
		BookService bookservice = new BookServiceImpl();
		bookservice.addBook("《Spring MVC权威指南 第一版》");
	}

}
