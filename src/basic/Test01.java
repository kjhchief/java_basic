package basic;

public class Test01 {
	//인스턴스 변수 선언
	private String name;
	private int[] jumsu;
	
	//생성자
	public Test01() {
		this(null, null);
	}
	
	public Test01(String name, int[] jumsu) { //이것은 생성자의 매개변수지 클래스에(?) 선언된 인스턴스 변수가 아니다.
		this.name = name;
		this.jumsu = jumsu;
	}
	
		
	//setter /getter 메서드 작업
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int[] getJumsu() {
		return jumsu;
	}



	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	//총점메서드, 평균메서드
	
	public int getSum(int[] jumsu2) {
		int sum = 0;
		for (int i=0; i<jumsu2.length; i++) {
			sum += jumsu2[i];
			
		}
		return sum;
	}
	
	public int getAvg(int[] jumsu2) {
		int sum = 0;
		for (int i=0; i<jumsu2.length; i++) {
			sum += jumsu2[i];
			
		}
		int avg = sum/jumsu2.length;
		return avg;
	}
	
//	public int getList(int[] jumsu2) { // 배열 리스트 출력 메소드 어떻게 만들지?
//		for (int i = 0; i < jumsu2.length; i++) {
//			System.out.print(jumsu2[i]);
//			 
//		}
		
		
		
		
	
	

	public static void main(String[] args) {
		String name="김재훈";
		int[] jumsu = {50, 60, 70, 80};
		
		Test01 test01 = new Test01(name, jumsu);
		
		System.out.println("이름입력: " + test01.name);
//		System.out.println("점수 데이터: " + test01.getList(jumsu));
		System.out.println("이름은? " + test01.name);
		System.out.println("총점은? " + test01.getSum(jumsu));
		System.out.println("평균은? " + test01.getAvg(jumsu));
	}

}
