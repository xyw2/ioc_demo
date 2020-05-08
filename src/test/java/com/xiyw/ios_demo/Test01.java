package com.xiyw.ios_demo;

import com.xiyw.ios_demo.ioc01.Site;

public class Test01 {

	/**
	 * Site new了对象IndexPage，Site自己掌握新建依赖对象的时机，Site和IndexPage是强耦合
	 * 只要创建Site，就会new出一个IndexPage
	 */
	public static void main(String[] args){
		Site site = new Site();
		site.setIndex();
	}

}
