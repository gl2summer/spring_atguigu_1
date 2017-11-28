package com.hao.sometest;

public class Class2 implements Opera{

	public Class2() {
		System.out.println("Class2 constructor...");
	}
	
	public Integer add(Integer a, Integer b) {
		System.out.println("Class2 add...");
		return a+b;
	}
	
	public Integer sub(Integer a, Integer b) {
		System.out.println("Class2 sub...");
		return a-b;
	}
}
