package oop;

public class ExtendsExample {

	public static void main(String[] args) {
		Parent parent = new Parent("홍길동", 50);
		System.out.println("부모이름: "+ parent.getName());
		System.out.println("부모나이: "+ parent.getAge());
		
//		Child child = new Child("홍아들", 15); 컴파일 에러. 왜? 생성자는 상속받지 못하니까!
		Child child = new Child("홍아들", 10, "이젠 대학교");
		
		System.out.println("아이이름: "+ child.getName());
		System.out.println("아이나이: "+ child.getAge());
		System.out.println("아이나이: "+ child.getSchoolName());
		child.song();
	}

}
