package com.xiyw.ioc_demo;

import com.xiyw.ioc_demo.ioc02.IndexPage;
import com.xiyw.ioc_demo.ioc02.Site;

public class Test02 {

	/**
	 * 相比01版本，Site里的indexPage成员是创建时以参数形式传递进去的，这是最基础的注入
	 */
	public static void main(String[] args){
		IndexPage indexPage = new IndexPage();
		Site site = new Site(indexPage);
		site.setIndex();
	}

}
