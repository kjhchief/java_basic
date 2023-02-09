package oop;

public class Student {
	// 필드(인스턴스 변수, 클래스 변수, 상수)

	public static final String SCHOOL_NAME = "이젠대학교"; // final 붙여서 상수가 됨. 상수는 관례상 all대문자
	// 클래스 변수(static field): 모든 인스턴스들이 공유하는 데이터
	public static int sequence = 1; // 1로 초기화한 학번. 얘는 1씩 들어나니까 final 붙이면 안됨
	// 인스턴스 변수
	private int ssn;
	private String name;
	private String subject;
	
	//초기화 블록
	{
		System.out.println("학생 인스턴스가 생성 되었습니다.");
		System.out.println("***************************************");
	}
	
	// static 초기화 블럭
	static {
		System.out.println("프로그램 로딩중........");
	}

	public Student() {
		// 공백으로 놔둬도 자동 초기화 됨.
		this(null, null); // 그치만 명시적으로 보여줄겸 this실습할겸 이렇게 초기화
	}

	public Student(String name, String subject) {
		this.ssn = sequence++; // Student.sequece++; 도 가능. 근데 어차피 같은 영역이니 Student.은 생략
		this.name = name;
		this.subject = subject;
		System.out.println("생성자 실행됨");
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	// setter getter까지 만들었으니 캡슐화가 잘 되었다.
	// 위에 까지는 세트로 외우기.

	// 여기서부터 본격 기능 구현.
	public void study() {
		System.out.println("열나 공부합니다..");
	}
	
	// 학교 이름을 출력하는 기능. 인스턴스 상관없이 공통으로 사용하는 기능이니까 클래스(static) 메소드로 만들자. 
	public static void printSchoolName() {
		System.out.println(SCHOOL_NAME);
//		System.out.println(name); 인스턴스 변수라서 접근X
	}

}
