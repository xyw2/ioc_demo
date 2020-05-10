package com.xiyw.ioc_demo.ioc09;

import org.springframework.stereotype.Repository;

@Repository("BookDao09A")
public class BookDao09A implements IBookDao09 {

	BookDao09A(){
		System.out.println("BookDao09A被容器创建");
	}
}
