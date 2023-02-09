package basic;

public class IFExample {

	public static void main(String[] args) {
		int score = 88;
		
		//단순 if
		if(score >= 50) {
			System.out.println("50 이상입니다.");
		}
		//비권장
		if(score >= 50) 
		System.out.println("50 이상입니다.");
		
		// if ~ else
		if(score >= 60) {
			System.out.println("합격!");
		}
		else {
			System.out.println("불합격!");
			
		}
		
		//다중 if문
		if(score >= 90) {
			System.out.println("수입니다");
		}
		else if(score >= 80) {
			System.out.println("우입니다");
		}
		else if(score >= 70) {
			System.out.println("미입니다");
		}
		else if(score >= 60) {
			System.out.println("양입니다");
		}
		else {
			System.out.println("가입니다");
		}
		
		

	}

}
