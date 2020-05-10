package com.xiyw.ioc_demo.ioc09;

import org.springframework.stereotype.Repository;

@Repository("BookDao09B")
public class BookDao09B implements IBookDao09 {

	BookDao09B(){
		System.out.println("BookDao09B被容器创建");
	}
	
}
