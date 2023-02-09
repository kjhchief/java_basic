package oop;

public class Child extends Parent {
//	String name;
//	int age;
	// 추가 필드

	private String schoolName;
	
	public Child() {
//		super(); 무조건 첫줄은 컴파일러가 자동으로 만듦.
	}


	public Child(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
//	public Child() {
//		this(null, 0, null);
//		
//	}
//	public Child(String name, int age, String schoolName) {
//		super(name, age);
//		this.schoolName = schoolName;
//	}

	// 메소드 추가
	public void song() {
		System.out.println("노래를 부릅니다~ 랄랄라~");
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
