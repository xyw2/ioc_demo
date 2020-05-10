package com.xiyw.ioc_demo;

import com.xiyw.ioc_demo.ioc01.Site;

public class Test01 {

	/**
	 * Site new了对象IndexPage，Site自己掌握新建对象的时机和依赖关系，2者的关系硬编码在代码里，是强耦合
	 */
	public static void main(String[] args){
		Site site = new Site();
		site.setIndex();
	}

}
