package ezen.array;

/**
 * @author 김재훈
 * @date 2023.1.2
 * 참조형 배열 선언, 생성, 사용 방법
 */

public class ArrayExample6 {

	public static void main(String[] args) {
		// 1차원 참조형 배열 선언
		String[] strings;
		//생성
		strings = new String[5];
//		strings[0] = new String("Java"); //명시적 생성
		strings[0] = "Java";
		strings[1] = "C";
		strings[2] = "C++";
		strings[3] = "C#";
		strings[4] = "Python";
		
//		System.out.println(strings[0]);
		for (int i = 0; i < strings.length; i++) {
//			String language = strings[i];
			System.out.println((strings[i]) + " ("+strings[i].length()+")");
		}
		
		// 배열 선언,생성, 초기화를 동시에
//		String[] teams = new String[] {new String("sk"), new String("lg"), new String("두산")};
//		String[] teams = {new String("sk"), new String("lg"), new String("두산")};
		String[] teams = {"sk", "lg", "두산"};
		for (int i = 0; i < teams.length; i++) {
			System.out.println(teams[i]);
		}
		
		//다차원 배열
		String[][] arrays = new String[3][5];
		arrays[0][0] = "java";
		//...
		arrays[2][4] = "html";
		
		for (int i = 0; i < arrays.length; i++) { // 3개 반복
			for (int j = 0; j < arrays[i].length; j++) { // 5개 반복
				System.out.println(arrays[i][j]);
			}
		}
		
		
		
		
		int num = 100;
		String strNum= String.valueOf(num);
		int count = strNum.length();
		System.out.println(count + "자리입니다.");
		
		
		

	}

}
