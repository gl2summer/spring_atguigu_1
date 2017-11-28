package com.hao.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cycle {

	private String Brand;
	
	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Constructor...");
	}

	public String getBrand() {
		System.out.println("getBrand...");
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
		System.out.println("setBrand...");
	}

	
	public void init() {
		System.out.println("init.");
	}
	
	public void destory() {
		System.out.println("destroy.");
	}
	
	
	
	@Override
	public String toString() {
		return "Cycle [Brand=" + Brand + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans-cycle.xml");
		Cycle cycle = context.getBean("cycle", Cycle.class);
		System.out.println(cycle);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
