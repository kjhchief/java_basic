package ezen.array;

/**
 * @author 김재훈
 * 2022. 12. 29.
 */
public class ArrayExample {

	public static void main(String[] args) {
		int score1, score2, score3, score4, score5;
		score1 = 95;
		score2 = 88;
		score3 = 100;
		score4 = 75;
		score5 = 98;
		
		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		
		int average = sum / 5;
		System.out.println("평균: " + average);
		
//		//배열 선언
//		int[] scores; //int[5] scores; 안 됨.
////		int scores[]; 이렇게도 가능. 이건 옛날 C스타일
//		//배열 생성
//		scores = new int[5]; //int 데이터 5개를 인스턴스화 시킴. score는 그 주소를 불러오는것. 값은 자동으로 0으로 초기화됨.
//		//배열 요소 접근법
//		scores[0] = 95; //일반 인스턴스였다면 scores. 이었겠지?
//		scores[1] = 88;
//		scores[2] = 100;
//		scores[3] = 75;
//		scores[4] = 98;   //배열 요소 접근의 기본.
		
		//선언, 생성, 초기화 동시에
//		int[] scores = new int[] {95, 88, 100, 75, 98};
		int[] scores = {95, 88, 100, 75, 98, 90};
		System.out.println(scores.length);
		
		//for문 이용하여 5개점수 평균 구하기
		sum =0;
		for(int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum/scores.length);
		
		
	}

}
