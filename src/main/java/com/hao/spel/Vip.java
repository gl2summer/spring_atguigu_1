package com.hao.spel;


public class Vip {

	public static final Integer vipThreshold = 1;
	
	private String cardNo;
	private Integer stage;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getStage() {
		return stage;
	}

	public void setStage(Integer stage) {
		this.stage = stage;
	}

	@Override
	public String toString() {
		return "Vip [cardNo=" + cardNo + ", stage=" + stage + "]";
	}

}
