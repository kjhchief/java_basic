package basic;

public class WhileExample {

	public static void main(String[] args) {
		
//		System.out.println("Java King");
		
//		int index=1;
//		while(index <= 10) {
//			System.out.println(index);
//			index++;
//		}
		
		// 1~10까지 누적
		//답
		int i=0;
		int result = 0;
		while(i <= 100) {
			result +=i; // result = result + 1;
			i++;
		}
		System.out.println("누적합: " + result); //누적합
		
		//1~100까지 홀수 합
		i= 1;
		int oddSum = 0, evenSum = 0;
		
		while (i <= 100) {
			if( (i%2) == 0) {
				evenSum += i;
			}
			else {
				oddSum +=i;
			}
			i++;
		}
		System.out.println("홀수합: " + oddSum);
		System.out.println("짝수합: " + evenSum);
		System.out.println("누적합: " + (oddSum + evenSum));
		
		// 아스키 코드는 0~127
		// 아스키문자 출력
		
		int asciiCode = 0; //while 문은 왜 byte 쓰면 안 되지?
		while (asciiCode < 128) {
			System.out.println( asciiCode + " = " + (char)asciiCode);
			asciiCode++;
		}
		
		
		
		
		
		
		
		
		
	}

}
