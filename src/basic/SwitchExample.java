package basic;

public class SwitchExample {

	public static void main(String[] args) {
		switch(100) {
			case 1 : System.out.println("1");
			break;
			case 2 : System.out.println("2");
			case 3 : System.out.println("3");
			case 19 : System.out.println("10");
			default : System.out.println("일치하는게 읍다");
			}
		
		int x=30, y=10;
		char operator = '/';
		switch (operator) {
			case '+': System.out.println("두 수의 합은: " + (x+y)); break;
			case '-': System.out.println("두 수의 차는: " + (x-y)); break;
			case '*': System.out.println("두 수의 곱은: " + (x*y)); break;
			case '/': System.out.println("두 수의 분은: " + (x/y)); break;
				
			default: System.out.println("지원하지 않는 연산자입니다.");
		}
		
		int score = 100;
		switch(score/10) {
			case 10 : 
			case 9 : System.out.println("수입니다"); break;
			case 8 : System.out.println("우입니다"); break;
			case 7 : System.out.println("미입니다"); break;
			case 6 : System.out.println("양입니다"); break;
			default :System.out.println("가입니다");
			
		
		}
		
		String fruit="사과";
		switch (fruit) {
			case "사과": System.out.println("Apple"); break;
			case "오렌지": System.out.println("Orange"); break;
				
		}
		
		
		

	}

}
