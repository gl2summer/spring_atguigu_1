package com.hao.sometest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;


import com.mysql.cj.core.result.Field;

public class TestReflection {

	public void test() throws Exception {

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String className = (String) properties.get("class");
		String methodName = (String) properties.get("method");
		
		Class<?> cls = Class.forName(className);
		Method m = cls.getMethod(methodName,Integer.class,Integer.class);
		Constructor<?> c = cls.getConstructor();
//		Field field = cls.getField();
		
		//Object object = cls.newInstance();
		//int r = (Integer) m.invoke(object, 10, 1);
		//System.out.println("result: "+r);
		
		
		Opera opera = (Opera) cls.newInstance();
		int a = opera.add(10, 2);
		System.out.println("result: " +a);
		int s = opera.sub(10, 2);
		System.out.println("result: " +s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestReflection testReflection = new TestReflection();
		try {
			testReflection.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
