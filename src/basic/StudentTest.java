package basic;

import java.util.Scanner;

public class StudentTest {
	//인스턴스 변수 선언
	private String name;
	private int[] jumsu;
		
	//생성자 
	public StudentTest() {
		this(null, null);
	}
	
	public StudentTest(String name, int[] jumsu) {
		this.name = name;
		this.jumsu = jumsu;
	}
	
	
	//세터, 게터
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
	
	public int getSum() {
		int sum = 0;
		for (int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
			
		}
		return sum;
	}
	
	public double getAvg() {
		return (double)getSum() / jumsu.length;

	}
	

	public static void main(String[] args) {
		String name = null;
		int[] jumsu = new int[4];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = scanner.nextLine();
		
		System.out.print("점수 입력(4과목): ");
		for (int i=0; i<jumsu.length; i++) {
			jumsu[i] = scanner.nextInt();
		}
		
		StudentTest student = new StudentTest(name, jumsu);
		System.out.println("총점: " + student.getSum());
		System.out.println("평균: " + student.getAvg());
	}

}
