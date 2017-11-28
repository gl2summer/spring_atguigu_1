package com.hao.beans.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans-generic-di.xml");
	
	UserService service = context.getBean("userService", UserService.class);
	service.add();
}
}
