package com.hao.spring;

import java.beans.Beans;
import java.beans.beancontext.BeanContextServiceAvailableEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beans3 {

	private String string;
	private Integer integer;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	@Override
	public String toString() {
		return "Beans3 [string=" + string + ", integer=" + integer + "]";
	}

	static public void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Beans3.xml");
		Beans3 beans3 = ctx.getBean("beans3", Beans3.class);
		System.out.println(beans3);
	}
}
