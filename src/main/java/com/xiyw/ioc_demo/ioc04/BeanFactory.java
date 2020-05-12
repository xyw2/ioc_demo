package com.xiyw.ioc_demo.ioc04;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanFactory {
	
	private List<BeanDefined> beanDefinedList;

	public List<BeanDefined> getBeanDefinedList() {
		return beanDefinedList;
	}



	public void setBeanDefinedList(List<BeanDefined> beanDefinedList) {
		this.beanDefinedList = beanDefinedList;
	}



	/**
	 * 根据BeanId获取Bean实例
	 * @param beanId
	 * @return
	 */
	public Object getBean(String beanId) throws Exception{
		if(null != beanId && !"".equals(beanId) && null != beanDefinedList){
			for(BeanDefined bean : beanDefinedList){
				if(beanId.equals(bean.getBeanId())){
					String classPath = bean.getBeanClassPath();
					Class classFile = Class.forName(classPath);
					Object instance = classFile.newInstance();
					Map<String,String> propertyMap = bean.getPropertyMap();
					if(propertyMap != null){
						setPorperty(instance, classFile, propertyMap);
					}
					return instance;
				}
			}
		}
		return null;
	}
	
	//实现对象属性配置（基础数据类型直接配置，对象依赖注入）
	private void setPorperty(Object instance,Class classFile, Map<String,String> propertyMap) throws Exception{
		Set<String> propertyNameSet = propertyMap.keySet();
		for(String propertyName : propertyNameSet){
			// 拼接出这个属性的set方法名
			char c = propertyName.toUpperCase().charAt(0);
			String setMethodName = "set" + c + propertyName.substring(1);
			// 获取这个属性
			Field property = classFile.getDeclaredField(propertyName);
			// 根据方法名和属性类型获取这个方法
			Method setMethod = instance.getClass().getDeclaredMethod(setMethodName, property.getType());
			try{
				setMethod.invoke(instance, propertyMap.get(propertyName));
			}catch(Exception e){
				// 属性为对象，要先从beanFactory里获取这个对象再注入
				setMethod.invoke(instance, getBean(propertyMap.get(propertyName)));
			}
		}
		
	}

}
