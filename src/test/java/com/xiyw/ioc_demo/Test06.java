package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiyw.ioc_demo.ioc06.Student;
import com.xiyw.ioc_demo.ioc06.Teacher;

public class Test06 {

	/**
	 * 06版本，通过applicationContext.xml配置了bean和属性
	 * Teacher通过构造方法配置属性,使用标签constructor-arg
	 * Student通过setter方法配置属性,使用标签property,当依赖其他bean时，属性值用ref
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher = (Teacher)ac.getBean("teacher");
		Student studentA = (Student)ac.getBean("studentA");
		Student studentB = (Student)ac.getBean("studentB");
		System.out.println(teacher);
		System.out.println(studentA);
		System.out.println(studentB);
		try {
			// 当Student在xml文件中定义过2次bean后，用Student.class来获取bean不唯一，所以报错
			Student studentC = (Student) ac.getBean(Student.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
