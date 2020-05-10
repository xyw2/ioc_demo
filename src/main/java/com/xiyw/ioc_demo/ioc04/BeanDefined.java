package com.xiyw.ioc_demo.ioc04;

import java.util.HashMap;
import java.util.Map;

public class BeanDefined {
	
	//Bean Id
	private String beanId;
	
	//Bean类路径
	private String beanClassPath;
	
	//Bean属性集合
	private Map<String,String> propertyMap = new HashMap<String,String>();

	public Map<String, String> getPropertyMap() {
		return propertyMap;
	}

	public void setPropertyMap(Map<String, String> propertyMap) {
		this.propertyMap = propertyMap;
	}

	public String getBeanId() {
		return beanId;
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public String getBeanClassPath() {
		return beanClassPath;
	}

	public void setBeanClassPath(String beanClassPath) {
		this.beanClassPath = beanClassPath;
	}
	
}
