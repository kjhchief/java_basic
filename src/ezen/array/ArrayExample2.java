package ezen.array;

/**
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExample2 {

	public static void main(String[] args) {
		int[] array = { 99, 78, 90, 100, 75 };

		// 배열 복사
		int[] array2 = new int[10];

		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "\t");
		}
		System.out.println();

		// mission2: 오름차순 정렬, 버블 정렬
		// 구현 //
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				int save;
				if (array[j] > array[j + 1]) {
					save = array[j];
					array[j] = array[j + 1];
					array[j + 1] = save;
				}
			}
		}
		//왜 중첩을 쓰지? 왜 for 하나로는 안 돌아가지? 왜 2개로 돌아가지? 먼저 숫자씩 비교하는거 부터 해보기. => bubble sort 수동으로 해보기. 1회차 값이 중첩 for문 안쓴 값이랑 같다. 안에 for는 버블소트 1회차, 바깥 for가 전체 돌리기.
			

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + "\t");
		}
		
		
		// mission3: 
		

	}

}