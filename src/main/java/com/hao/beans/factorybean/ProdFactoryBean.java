package com.hao.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProdFactoryBean implements FactoryBean<Product> {

	private String name;
	private Integer price;

	public Product getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Product(name, price);
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Product.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProdFactoryBean [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-FactoryBean.xml");
		Product product = ctx.getBean("car", Product.class);
		System.out.println(product);
	}
}
