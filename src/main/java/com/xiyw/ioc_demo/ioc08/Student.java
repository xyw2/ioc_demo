package com.xiyw.ioc_demo.ioc08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Student08")
public class Student {

	private String name;

	private String sex;
	
	@Autowired
	private Teacher teacher;
	
	Student() {
		System.out.println("student08被容器创建");
	}

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
	
	public void learnChinese() {
		teacher.teach("Chinese");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", teacher=" + teacher + "]";
	}

}
