package com.hk.test;

public class CardMain {
	public static void main(String[] args) {
		/*
		Card[] card = new Card[52];
		
		String[] shape = {"SPADE", "HEART", "CLOVER", "DIAMOND"};
		String[] result = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
		
		int idx = 0;
		for(int i = 0; i < shape.length; i++) { //4
			for(int j = 0; j < result.length; j++) { //13
				Card c = new Card(shape[i], result[j]);
				card[idx++] = c;
			}
		}
		
		for(Card c : card) {
			System.out.println(c);
		}
		*/
		
		Card[] card = new Card[52];
		
		String[] shape = {"diamond", "clover", "heart", "spade"};
		String[] result = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		int idx = 0;
		for(int i = 0; i < shape.length; i++) {
			for(int j = 0; j < result.length; j++) {
				Card c = new Card(shape[i], result[j]);
				card[idx++] = c;
			}
		}
		
		for(Card c : card) {
			System.out.println(c);
		}
	}
}





















