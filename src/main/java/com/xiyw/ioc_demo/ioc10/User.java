package com.xiyw.ioc_demo.ioc10;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	public User(){
		System.out.println("this user is created by:self");
	}
	
	public User(String user){
		System.out.println("this user is created by:"+user);
	}

}
