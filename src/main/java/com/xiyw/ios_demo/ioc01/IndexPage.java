package com.xiyw.ios_demo.ioc01;

public class IndexPage {
	
	public String getPageIndex(int num) {
		StringBuffer sb = new StringBuffer();
		sb.append("input num is:").append(String.valueOf(num));
		return sb.toString();
	}
}
