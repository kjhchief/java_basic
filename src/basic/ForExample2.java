package basic;

public class ForExample2 {	

	public static void main(String[] args) {
		// 1~100까지 누적 합
		int result = 0;
		for (int i=1; i <= 100; i++) {
			result += i;
			
		}
		System.out.println(result);
		// 1~100까지 홀수, 짝수 출력
		int oddSum=0, evenSum = 0;
		for (int i=1; i<=100; i++) {
			if((i%2)==0) {
				evenSum += i;
				
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("홀수합 " + oddSum);
		System.out.println("짝수합 " + evenSum);
	}

}
