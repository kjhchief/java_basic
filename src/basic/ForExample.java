package basic;

/**
 * @author i7A-56
 *
 */
public class ForExample {

	public static void main(String[] args) {
		// for문은 반복횟수를 설정할 수 있는 while의 확장
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " 자바 킹킹킹");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// System.out.println(i); 이러면 자바 변수는 블록 스코프이기에 에러 뜬다.

		for (int j = 0, k = 100; j <= 50 && k >= 50; j++, k--) {
			System.out.println(j + ", " + k);
		}

	}

}
