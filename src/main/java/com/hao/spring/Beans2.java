package com.hao.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Ref {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ref [name=" + name + "]";
	}

}

public class Beans2 {

	private String string;
	private Integer integer;
	private Ref ref;
	private Properties properties;

	private List<Integer> listInteger;
	private Map<String, Integer> mapInteger;

	public Beans2(String string, Integer integer) {
		super();
		this.string = string;
		this.integer = integer;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getMapInteger() {
		return mapInteger;
	}

	public void setMapInteger(Map<String, Integer> mapInteger) {
		this.mapInteger = mapInteger;
	}

	public List<Integer> getListInteger() {
		return listInteger;
	}

	public void setListInteger(List<Integer> listInteger) {
		this.listInteger = listInteger;
	}

	public Ref getRef() {
		return ref;
	}

	public void setRef(Ref ref) {
		this.ref = ref;
	}

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

	public String toString() {
		return "Beans2 [string=" + string + ", integer=" + integer + ", ref=" + ref + ", properties=" + properties
				+ ", listInteger=" + listInteger + ", mapInteger=" + mapInteger + "]";
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "beans2.xml", "beans.xml" });
		Beans2 beans2 = ctx.getBean("beans2", Beans2.class);
		System.out.println(beans2);
	}
}
