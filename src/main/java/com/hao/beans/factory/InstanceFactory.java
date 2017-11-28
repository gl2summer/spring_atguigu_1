package com.hao.beans.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceFactory {
	
	private static Map<String, Product> cars = null;

	public InstanceFactory() {
		cars = new HashMap<String, Product>();
		cars.put("audi", new Product("audi", 300000));
		cars.put("bmw", new Product("bmw", 300000));
	}

	public Product getProduct(String name) {
		return cars.get(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		Product product = ctx.getBean("prod2", Product.class);
		System.out.println(product);
	}

}
