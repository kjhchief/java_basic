package basic;

import java.util.Scanner;

public class ForExample3 {

	public static void main(String[] args) {
		// 중첩 for문
		for(int i=0; i<10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
			}
		}
		
		// 별표 정사각형
		for(int i=0; i<5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		// 입력한 구구단 출력
		
		Scanner scanner = new Scanner(System.in);
		int dan = 2;
		System.out.println("입력하셈 : ");
		dan = scanner.nextInt();
		
		for (int i =1; i<=9; i++) {
			System.out.print(dan+"x"+i+'='+(dan*i)+"\t");
			
		}
		
		//표 형태로 구구단 출력하기 (과제)
		for (int i = 2; i <= 9; i++) {
			for (int j =1; j<=9; j++) {
				System.out.print(i+"x"+j+'='+(i*j)+"\t");
				
			}
			System.out.println();
		}
		
	}

}
