package com.hao.spring;

public class Car {
	private String name;
	private String cord;
	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCord() {
		return cord;
	}

	public void setCord(String cord) {
		this.cord = cord;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", cord=" + cord + ", price=" + price + "]";
	}

}
