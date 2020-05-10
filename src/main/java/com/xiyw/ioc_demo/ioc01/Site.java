package com.xiyw.ioc_demo.ioc01;

public class Site {

	private IndexPage indexPage = new IndexPage();
	
	public void setIndex(){
		System.out.println("Site setIndex method");
		String out = indexPage.getPageIndex(7);
		System.out.println(out);
	}
}
