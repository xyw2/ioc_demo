package com.xiyw.ios_demo.ioc03;

import java.util.List;

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
					return instance;
				}
			}
		}
		return null;
	}

}
