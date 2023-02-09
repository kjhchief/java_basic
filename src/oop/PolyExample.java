package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;

/**
 * 자바는 다형성을 지원하기 위해 클래스 자동 형변환을 지원한다.
 * @Author 김재훈
 * @Date 2023. 1. 5.
 */
public class PolyExample {

	public static void main(String[] args) {
		// 기본타입 자동형변환
		double weight = 70;
		
		
		System.out.println(weight);
		

		Shape shape = new Circle();
		shape.draw();
		//부모 자식간에는 데이터타입을 부모로 선언하면
		//모든 자식 객체를 할당할 수 있다.
		shape = new Circle();
		shape.draw();
		shape = new Lectangle();
		shape.draw();
//		다른 객체인데 어떻게 이게 가능한가? 
		
//		만약 자동 형변환이 없다면
//		Shape shape = new Shape();
//		Circle circle = new Circle();
//		Lectangle lectangle = new Lectangle();
		
		
		
		
		
		
	}

}
