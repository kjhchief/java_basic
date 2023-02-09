package oop;

public class StandardAPIExample {

	public static void main(String[] args) {
//		String message = "안녕하세요. 김재훈입니다."; 
//		이 문자열이 몇 개의 문자로 이루어졌는지 화면에 출력하시오.
		
		String message = new String("안녕하세요. 김재훈입니다.");
		int count = message.length(); //length라는 인스턴스 메소드가 미리 만들어져 있음.
		
		System.out.println("총 "+count+"개의 문자로 구성되었습니다");
		
		String ssn = new String("901002-1162111");
		char ch = ssn.charAt(7);
		System.out.println(ch);
		switch (ch) {
		case '1': System.out.println("2000년 이전 출생 남자"); break;
		case '2': System.out.println("2000년 이전 출생 여자"); break;
		case '3': System.out.println("2000년 이후 출생 남자"); break;
		case '4': System.out.println("2000년 이후 출생 여자"); break;
		default: System.out.println("외국인"); 
		}
		
		
		int number = 12345567;
		String numStr = String.valueOf(number); // 숫자를 문자열로 바꿔주는 valueOf
		int c = numStr.length();
		System.out.println(c);
		
		int n = -10;
		int result = Math.abs(n);
		
		System.out.println(result);
		
		double radian = 45.3;
		double re = 2 * Math.PI * 45.3; //원주율을 구함.
		System.out.println(re);
		
		
		
		

	}

}
