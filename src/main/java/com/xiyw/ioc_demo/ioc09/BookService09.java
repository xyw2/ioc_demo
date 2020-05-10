package com.xiyw.ioc_demo.ioc09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService09 {

	@Autowired
	@Qualifier("BookDao09A")
	private IBookDao09 bookDao;
	
	BookService09(){
		System.out.println("BookService09被容器创建");
	}

	public IBookDao09 getBookDao() {
		return bookDao;
	}

	public void setBookDao(IBookDao09 bookDao) {
		this.bookDao = bookDao;
	}
	
}
