package ezen.array;

/**
 * 다차원 배열 선언, 생성, 사용하기
 * 
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExample5 {

	public static void main(String[] args) {
//		int[][] array; //int[][]를 클래스로 생각하면 array가 참조변수가 됨.
//		array = new int[2][5];
//		array[0][0] = 88;
//		array[0][1] = 98;
//		array[0][2] = 75;
//		array[0][3] = 100;
//		array[0][4] = 100;
//		array[1][0] = 50;
//		array[1][1] = 60;
//		array[1][2] = 70;
//		array[1][3] = 80;
//		array[1][4] = 90;

//		int[][] array = new int[][] {
//									{88, 98, 75, 100, 100}, 
//									{50, 60, 70, 80, 90}
//									};

		int[][] array = { { 88, 98, 75, 100, 100 }, { 50, 60, 70, 80, 90 } };
		for (int i = 0; i < array.length; i++) {
			System.out.println((i + 1) + " 반 성적");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");

			}
			System.out.println();
		}

		// 반 학생수, 총점, 평균 문제
		// 1반
		int sum1 = 0;
		System.out.println("전체 학생수 : " + (int)(array[0].length + array[1].length));
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum1 += array[i][j];

			}
		}
		System.out.println("전체 총점 : " + sum1);
		System.out.println("전체 평균 : " + (double)sum1 / (int)(array[0].length + array[1].length)); // 그냥 +로 합하면 5+5해서 55로 문자열처럼 되었나? 어이없네.
		System.out.println("-------------------");

		
		//각반 총점, 평균, 학생수 for문으로 돌리기
		for (int a = 0; a < array.length; a++) {
			int sum2 = 0;
			System.out.println((a + 1) + "반 전체 학생수 : " + array[a].length);
			for (int i = 0; i < array[a].length; i++) {
				sum2 += array[a][i];

			}
			System.out.println((a + 1) + "반 총점 : " + sum2);
			System.out.println((a + 1) + "반 평균 : " + (double)sum2 / array[a].length);
		}

		// 1반 총점: ???점, 평균: ???점
		// 2반 총점: ???점, 평균: ???점
		System.out.println("-------------------");

	}

}