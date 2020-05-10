package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiyw.ioc_demo.ioc09.BookService09;
import com.xiyw.ioc_demo.ioc09.IBookDao09;

public class Test09 {

	/**
	 * 09版本，BookService09自动装配IBookDao09时，有2个bean BookDao09A和BookDao09B 都实现了该接口
	 * 报NoUniqueBeanDefinitionException
	 * 要在注解BookDao09A和BookDao09B时设置beanid，在自动装配时指定id
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext09.xml");
		BookService09 bookService09 = ac.getBean(BookService09.class);
		IBookDao09 bookDao = bookService09.getBookDao();
		System.out.println(bookDao);
	}

}
