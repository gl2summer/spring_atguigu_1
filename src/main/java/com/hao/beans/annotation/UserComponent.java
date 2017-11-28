package com.hao.beans.annotation;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class UserComponent {

	public void test() {
		System.out.println("UserComponent test...");
	}
}
