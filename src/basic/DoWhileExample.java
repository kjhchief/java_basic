package basic;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// 키보드로 부터 숫자 입력받아 반복하기
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.print("아무 숫자나 입력하세요: ");
			number = scanner.nextInt();
			System.out.println("당신의 입력 숫자: " + number);
		} while (number != 0);
		System.out.println("정답입니다.");
	}

}
