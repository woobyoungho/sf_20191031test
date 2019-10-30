package com.hk.test;

public class Card {
	private String shape; //{"diamond", "clover", "heart", "spade"};
	private String result; //{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	public Card(String shape, String result) {
		this.shape = shape;
		this.result = result;
	}
	
	public String getShape() {
		return shape;
	}
	
	public String getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s", shape, result);
	}
	
}
