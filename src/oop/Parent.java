package oop;

public class Parent {
	private String name;
	private int age;

	public Parent() {
		this(null, 0);
	}

	public Parent(String name, int age) { // 클래스 변수랑 같은 생성자는 필수로 하나 만들기.
		this.name = name;
		this.age = age;
	}

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
	
	

	

}
