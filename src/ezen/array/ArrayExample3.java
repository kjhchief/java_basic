package ezen.array;

/**
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExample3 {

	public static void main(String[] args) {
		int[] array = { 99, 78, 90, 100, 75 };
		int[] copyArray1= ArrayUtil.copyArray(array, 1);
		for (int i = 0; i < copyArray1.length; i++) {
			System.out.print(copyArray1[i]+ " ");
		}
		
		System.out.println("\n");
		
		array = ArrayUtil.sort(array);
		for(int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}