package com.hk.test;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		//콘솔로부터 1~12사이의 값을 입력받아서 결과를 출력하는 프로그램
		//3~5사이의 숫자면 '봄'
		//6~8사이의 숫자면 '여름'
		//9~11사이의 숫자면 '가을'
		//12, 1, 2 사이의 숫자면 '겨울'
		//이외의 숫자면 "잘못 입력"
		//switch로 해결
		
		System.out.print("1 ~ 12 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}
}
