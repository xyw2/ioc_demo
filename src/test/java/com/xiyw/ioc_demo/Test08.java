package com.xiyw.ioc_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiyw.ioc_demo.ioc08.Student;
import com.xiyw.ioc_demo.ioc08.Teacher;

public class Test08 {

	/**
	 * 08版本，student通过注解autowired装配了teacher
	 * teacher使用了PostConstruct和PreDestroy
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext08.xml");
		Teacher teacher08 = (Teacher)ac.getBean(Teacher.class);
		Student student08 = (Student)ac.getBean(Student.class);
		student08.learnChinese();
	}

}
