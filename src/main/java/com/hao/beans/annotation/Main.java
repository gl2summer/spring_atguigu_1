package com.hao.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		UserComponent userComponent = ctx.getBean("userComponent", UserComponent.class);
//		userComponent.test();
//		
		UserController uc = ctx.getBean("userController", UserController.class);
		uc.execute();
//		
//		UserService us = ctx.getBean("userService",	UserService.class);
//		us.add();
//		
//		UserRepository ur = ctx.getBean("userRepository", UserRepositoryImpl.class);
//		ur.save();
	}
}
