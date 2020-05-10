package com.xiyw.ioc_demo.ioc07;

import org.springframework.stereotype.Component;

@Component("teacher07")
public class Teacher {

	private String name;

	private String sex;

	Teacher() {
		System.out.println("teacher07被容器创建");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", sex=" + sex + "]";
	}

}
