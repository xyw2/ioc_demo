package com.xiyw.ioc_demo.ioc06;

public class Teacher {

	private String name;

	private String sex;

	Teacher(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", sex=" + sex + "]";
	}

}
