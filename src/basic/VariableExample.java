package basic;

// 변수 선언 및 사용
public class VariableExample {

	public static void main(String[] args) {
		int age;
		//변수선언(메모리 할당X)
		
		age = 10; //변수 초기화
		//변수에 값 저장(실제 메모리 할당 0)
		int x=10;
		
		int a=100, b=500, c=200, i=a;
		System.out.println(i);
	
		
		
		
		System.out.println(age);
		String message="김재훈 천재";
		
		System.out.println(message);
		
		int num;
//		System.out.println(num);
		//변수 초기화가 되지 않으면 사용할 수 없다.
		
		
		//상수 처리
		final double PI=3.141592;
//		pi=22;
		final int MAX_VALUE=100;
		//자바에서 식별자 언더바는 상수 외에는 거의 없다.
		
	}

}
