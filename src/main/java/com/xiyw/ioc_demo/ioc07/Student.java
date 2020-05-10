package com.xiyw.ioc_demo.ioc07;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("student07")
@Lazy
public class Student {

	private String name;

	private String sex;
	
	private Teacher teacher;
	
	Student() {
		System.out.println("student07被容器创建");
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", teacher=" + teacher + "]";
	}

}
