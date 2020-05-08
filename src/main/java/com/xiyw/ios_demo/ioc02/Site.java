package com.xiyw.ios_demo.ioc02;

public class Site {

	private IndexPage indexPage;
	
	public Site(IndexPage indexPage){
		this.indexPage = indexPage;
	}
	
	public void setIndex(){
		System.out.println("Site setIndex method");
		String out = indexPage.getPageIndex(7);
		System.out.println(out);
	}

}
