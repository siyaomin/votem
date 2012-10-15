package com.lou19.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lou19.votem.dao.UserDao;

public class ContextUtils implements ApplicationContextAware{
	public  static ApplicationContext getContext(){
		return context;
	}
	private static ApplicationContext context;
//	static{
//		context =new ClassPathXmlApplicationContext("spring_context.xml");
//	}
	public static void main(String[] args) {
		System.out.println(context.getBean(UserDao.class).single("id-user"));
	}
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context=applicationContext;
		
	}
}
