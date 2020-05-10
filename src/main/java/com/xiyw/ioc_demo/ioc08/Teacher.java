package com.xiyw.ioc_demo.ioc08;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("Teacher08")
public class Teacher {

	private String name;

	private String sex;

	Teacher() {
		System.out.println("teacher08被容器创建");
	}
	
	@PostConstruct
	private void init() {
		System.out.println("teacher08创建后的初始化方法");
	}
	
	@PreDestroy
	private void preDestroy() {
		System.out.println("teacher08销毁前的处理");
	}
	
	public void teach(String lesson){
		System.out.println("teacher is teach "+lesson);
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", sex=" + sex + "]";
	}

}
