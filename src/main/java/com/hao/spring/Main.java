package com.hao.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {
	public static void main(String[] args) {

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		/**
		 * bean继承与依赖
		 */
//		Address address1 = ctx.getBean("address1", Address.class);
//		System.out.println(address1);
//		
//		Address address2 = ctx.getBean("address2", Address.class);
//		System.out.println(address2);
//		
//		Person person = ctx.getBean("person", Person.class);
//		System.out.println(person);
		
		
		
		/**
		 * bean作用域
		 */
//		System.out.println("======================");
//		Address address3_1 = ctx.getBean("address3", Address.class);
//		Address address3_2 = ctx.getBean("address3", Address.class);
//		System.out.println(address3_1==address3_2);
//		Address address4_1 = ctx.getBean("address4", Address.class);
//		Address address4_2 = ctx.getBean("address4", Address.class);
//		System.out.println(address4_1==address4_2);
		
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");
		/**
		 * bean使用外部属性文件
		 */
//		DriverManagerDataSource dataSource = ctx.getBean("dataSource", DriverManagerDataSource.class);
//		System.out.println(dataSource);

//		Address address1 = ctx.getBean("tomsAddress1", Address.class);
//		System.out.println(address1);
//		Address address2 = ctx.getBean("tomsAddress2", Address.class);
//		System.out.println(address2);
		
	}
}
