package basic;

public class Quiz {

	static void question1() {
		// 중첩 for문을 이용해서 아래와 같이 출력하시오

//		 *
//		 **
//		 ***
//		 ****
//		 *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

	static void question2() {

//		 *****
//		 ****
//		 ***
//		 **
//		 *

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void question3() {

//		     *
//		    **
//		   ***
//		  ****
//		 *****

		for (int i = 1; i <= 5; i++) {
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void question4() {

//		 0
//		 12
//		 345
//		 6789

//		for (int i = 0; i <= 0; i++) {
//			System.out.print(i);
//			
//		}
//		System.out.println();
//		for (int i = 1; i <= 2; i++) {
//			System.out.print(i);
//			
//		}
//		System.out.println();
//		for (int i = 3; i <= 5; i++) {
//			System.out.print(i);
//			
//		}
//		System.out.println();
//		for (int i = 6; i <= 9; i++) {
//			System.out.print(i);
//			
//		}
//		System.out.println();
		
			int num = 0;
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(num++);
				}
				System.out.println();
			}

	}
	
		
	

	public static void main(String[] args) {
		System.out.println("프로그램 시작됨");
//		question1();
//		question2();
//		question3();
		question4();

		System.out.println("프로그램 종료됨");
	}

}
