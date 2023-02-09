package oop;

class A{
	
}

class B{
	
}

public class Test { //클래스는 여러개지만 public으로 선언된 클래스가 파일 이름이 된다. 
	//그러나 현업에서는 한 파일에 한 클래스만 만들어야 함. 나중에 일할 때 찾기 어려움.
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		System.out.println("hi~~~");
	}
	
}
