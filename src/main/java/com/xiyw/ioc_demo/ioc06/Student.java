package com.xiyw.ioc_demo.ioc06;

public class Student {

	private String name;

	private String sex;

	private Teacher teacher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", teacher=" + teacher + "]";
	}

}
