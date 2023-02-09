package ezen.array;

/**
 * @author 김재훈 2022. 12. 29.
 */
public class ArrayExample4 {

	public static void main(String[] args) {
		// 6개의 로또번호 임의 생성 및 배열에 저장
		
		int[] lottos = new int[6];
		for (int i = 0; i < lottos.length; i++) {
			int random=(int)(Math.random() * 45) + 1; // 0.0 <= value < 1.0
			lottos[i] = random;
			// for을 통해 중복 체크
			for (int j =0; j <i; j++) {
				if(lottos[j] == lottos[i]) {
					i--;
				}
			}
			
		}
		
		
		
		// 중복된 값 안 나오게 하는법?
		//힌트: for 안에 또 for를 돌려서 새로운 번호랑 기존 번호 일치하는지 if 써서 비교하기. 같으면 담지 말기. 같으면 담기
		
		
		//정렬 및 출력
		ArrayUtil.sort(lottos);
		
		for (int i = 0; i < lottos.length; i++) {
			System.out.print(lottos[i] + " ");
		}
		
		

	}

}