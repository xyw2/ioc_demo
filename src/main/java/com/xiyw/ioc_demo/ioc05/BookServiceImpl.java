package com.xiyw.ioc_demo.ioc05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServiceImpl implements BookService {
	
	private IBookDao bookDao;
	
	public BookServiceImpl(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		bookDao = (IBookDao)ac.getBean("bookDao");
	}

	public void addBook(String bookName) {
		System.out.println("BookService addBook");
		String str = bookDao.addBook(bookName);
		System.out.println(str);
	}

}
