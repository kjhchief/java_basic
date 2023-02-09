package ezen.interfacee;

/**
 * 유닛이 사용하는 모든 무기들에 대한 표준 규약(명세)
 * 인터페이스 - 역할
 * 인터페이스는 100% 추상메소드만 구성된다.
 * @Author 김재훈
 * @Date 2023. 1. 6.
 */
public interface Weapon {
	/*public static final*/int WEIGHT = 1; 
	
	public /*abstract*/ void attack(); // 인터페이스는 추상클래스와 다르게 abstract 안 붙임. 왜냐면 그 자체로 추상이니까. 다~~~~~~추상
	

}
