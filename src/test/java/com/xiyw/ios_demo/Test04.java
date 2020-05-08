package com.xiyw.ios_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiyw.ios_demo.ioc04.BeanDefined;
import com.xiyw.ios_demo.ioc04.BeanFactory;
import com.xiyw.ios_demo.ioc04.Site;

public class Test04 {

	/**
	 * 04版本，相比03版本，在获取需要的对象A时，把对象里的属性中的依赖对象B从容器里生出并注入到了A中，完成了依赖注入
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception{
		//bean的注册
		BeanDefined indexPage = new BeanDefined();
		indexPage.setBeanId("indexPage");
		indexPage.setBeanClassPath("main.java.ioc04.IndexPage");
		Map<String,String> indexPagePropertyMap = new HashMap<String,String>();
		indexPagePropertyMap.put("pageNum", "99");
		indexPage.setPropertyMap(indexPagePropertyMap);
		
		BeanDefined site = new BeanDefined();
		site.setBeanId("site");
		site.setBeanClassPath("main.java.ioc04.Site");
		
		Map<String,String> sitePropertyMap = new HashMap<String,String>();
		sitePropertyMap.put("homeUrl", "127.0.0.1/index.html");
		sitePropertyMap.put("url", "127.0.0.1");
		/**
		 *  如果属性是对象，把value设置为这个对象的beanId
		 *  factory判断这个属性为对象后，会生成对象实例并配置到这个属性上，就是依赖注入
		 */
		sitePropertyMap.put("indexPage", "indexPage");
		site.setPropertyMap(sitePropertyMap);
		
		List<BeanDefined> beanDefinedList = new ArrayList<BeanDefined>();
		beanDefinedList.add(indexPage);
		beanDefinedList.add(site);
		
		//声明BeanFactory，类似于Spring中的ApplicationContext
		BeanFactory beanFactory = new BeanFactory();
		beanFactory.setBeanDefinedList(beanDefinedList);
		
		//需要时向bean容器索要对象
		Site newSite =  (Site)beanFactory.getBean("site");
		System.out.println(newSite);
	}

}
