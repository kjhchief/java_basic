package basic;

public class MethodExample {

	//사용자 정의 메소드 (구구단 입력 메소드)
	//단을 입력받아 해당 단을 출력하는 기능을 메소드 정의
	static void printDan(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i) + "\t");
		}
	}
	
	static void printGugudan() {
		for (int i = 2; i <= 9; i++) {
			for (int j =1; j<=9; j++) {
				System.out.print(i+"x"+j+'='+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
	static int sum(int x, int y) {
		return x + y;
		//반환하고 메소드 바깥으로 나가서 메소드 끝.
	}
	
	public static void main(String[] args) {
		System.out.println("자바 애플리케이션 Start...");
		//7단 출력을 위한 메소드 사용(호출)
		printDan(5);
		printGugudan();
		int result= sum(22222, 234);
		System.out.println(result);
		
		
		System.out.println("자바 애플리케이션 End...");
		

	}

}
