package com.hao.spel;

public class Customer {
	
	public static final double factor = 1001;
	
	private String name;
	private Vip vip;
	private Double amount;
	private String info;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vip getVip() {
		return vip;
	}

	public void setVip(Vip vip) {
		this.vip = vip;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", vip=" + vip + ", amount=" + amount + ", info=" + info + "]";
	}

}
