package com.xiyw.ioc_demo.ioc05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServiceImpl implements BookService {

	private IBookDao bookDao;

	public BookServiceImpl() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IBookDao bookDao1 = (IBookDao) ac.getBean("bookDao");
		IBookDao bookDao2 = (IBookDao) ac.getBean(BookDao.class);
		IBookDao bookDao3 = (IBookDao) ac.getBean("bookDao", BookDao.class);
		System.out.println("bookDao1==bookDao2:" + (bookDao1 == bookDao2));
		System.out.println("bookDao2==bookDao3:" + (bookDao2 == bookDao3));
		bookDao = bookDao2;
	}

	public void addBook(String bookName) {
		System.out.println("BookService addBook");
		String str = bookDao.addBook(bookName);
		System.out.println(str);
	}

}
