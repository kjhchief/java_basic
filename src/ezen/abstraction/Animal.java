package ezen.abstraction;

/**
 * 추상 클래스
 * 자식 클래스들이 반드시 구현해야하는 기능을 위한 수직적 명세 역할
 * @Author 김재훈
 * @Date 2023. 1. 6.
 */
public abstract class Animal {
	//추상클래스는 생성이 안 되니까 생성자가 필요없다?
	
	protected String name;
	protected int age;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void walk() {
		System.out.println("겉습니다.");
	}
	
	
	//추상메소드 (수직적 규약)
	public abstract void cry(); 
	public abstract void eat();

}
