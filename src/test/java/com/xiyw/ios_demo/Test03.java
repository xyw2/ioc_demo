package com.xiyw.ios_demo;

import java.util.ArrayList;
import java.util.List;

import com.xiyw.ios_demo.ioc03.BeanDefined;
import com.xiyw.ios_demo.ioc03.BeanFactory;
import com.xiyw.ios_demo.ioc03.IndexPage;

public class Test03 {

	/**
	 * 03版本，使用的BeanDefined和BeanFactory作为对象容器，需要对象时向容器索要，而不是主动创建，这就叫控制反转
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		//bean的注册
		BeanDefined indexPage = new BeanDefined();
		indexPage.setBeanId("indexPage");
		indexPage.setBeanClassPath("main.java.ioc03.IndexPage");
		
		BeanDefined site = new BeanDefined();
		site.setBeanId("site");
		site.setBeanClassPath("main.java.ioc03.Site");
		
		List<BeanDefined> beanDefinedList = new ArrayList<BeanDefined>();
		beanDefinedList.add(indexPage);
		beanDefinedList.add(site);
		
		//声明BeanFactory，类似于Spring中的ApplicationContext
		BeanFactory beanFactory = new BeanFactory();
		beanFactory.setBeanDefinedList(beanDefinedList);
		
		//需要时向bean容器索要对象
		IndexPage page =  (IndexPage)beanFactory.getBean("indexPage");
		System.out.println(page);
	}

}
