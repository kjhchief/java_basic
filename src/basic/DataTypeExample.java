package basic;

public class DataTypeExample {
	public static void main(String[] args) {
		//자바 기본(원시) 데이터 타입 (8개)
		//Pass by Value 
		long money = 10000000000L;
		//정수에 2,8,10,16진수 리터럴 가능
		int x = 0B101;
		int y = 010; //8진수
		int k = 0X3838BE; //16진수
		System.out.println(k);
		
		char e = 'A';
		char ee= 65;
		char eee=0x0041;
		System.out.println(e);
		System.out.println(ee);
		System.out.println(eee);
		
		//제어문자
		System.out.println("자바는 \n객체\t지향 언어입니다\r");
		//이스케이프 문자
		System.out.println("자바는 \"최고\"의 \\언어\\입니다.");
		
		//변수를 이용하여 나의 정보 저장 및 출력
		String name="김재훈";
		int age=33;
		double weight=57.7;
		char gender='남';
		System.out.println("\n이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		
	}

}
