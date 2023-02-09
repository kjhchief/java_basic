package basic;

public class QuizA {

	static void question1() {
		// 중첩 for문을 이용하여 아래와 같이 출력하세요.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void question2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void question3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	static void question4() {
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
		question1();
		question2();
		question3();
		question4();
		System.out.println("프로그램 종료됨");
	}

}
