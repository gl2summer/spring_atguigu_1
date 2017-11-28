package com.hao.sometest;

public class Class1 implements Opera{

	public Class1() {
		System.out.println("Class1 constructor...");
	}
	public Integer add(Integer a, Integer b) {
		System.out.println("Class1 add...");
		return a+b;
	}
	public Integer sub(Integer a, Integer b) {
		System.out.println("Class1 sub...");
		return a-b;
	}
}
