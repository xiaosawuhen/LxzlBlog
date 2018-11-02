package com.lxzl.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanFactory implements BeanFactoryAware {

	private static BeanFactory beanFactory;
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		SpringBeanFactory.beanFactory = beanFactory;
	}
	
	public static Object getBean(String beanName) {  
        return beanFactory.getBean(beanName);
	}
	
	public static <T> T getBean(String beanName, Class<T> clazs) {  
        return clazs.cast(getBean(beanName));
	}

	public static <T> T getBean(Class<T> clazz) {
		return beanFactory.getBean(clazz);
	}
}
