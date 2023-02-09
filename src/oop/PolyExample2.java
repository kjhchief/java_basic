package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;

/**
 * 자바는 다형성을 지원하기 위해 클래스 자동 형변환을 지원한다.
 * @Author 김재훈
 * @Date 2023. 1. 5.
 */
public class PolyExample2 {

	public static void main(String[] args) {
		Account account1 = new Account("1111", "김재후", 1111, 10000);
		Account account2 = new Account("1111", "김재후", 1111, 10000);
		
		System.out.println(account1.equals(account2));
		
		
		System.out.println(account1.equals("hello"));
		
		
		
		
		
		
	}

}
