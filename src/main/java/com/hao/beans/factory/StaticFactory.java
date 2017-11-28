package com.hao.beans.factory;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
 * @author Mingbikes.GZ
 *
 */
public class StaticFactory {

	
	private static Map<String, Product> cars = new HashMap<String, Product>();

	static {
		cars.put("audi", new Product("audi", 300000));
		cars.put("bmw", new Product("bmw", 300000));
	}

	public static Product getProduct(String name) {
		return cars.get(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		Product product = ctx.getBean("prod1", Product.class);
		System.out.println(product);
	}

}
