package com.xiyw.ioc_demo.ioc05;

public class BookDao implements IBookDao {

	public String addBook(String bookName) {
		return "booked " + bookName;
	}

}
