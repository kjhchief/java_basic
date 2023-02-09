package oop;

public class StudentApp {

	public static void main(String[] args) {
		Student student = new Student("김재훈", "행정학과");
		System.out.println(student.getSsn());
		String name = student.getName(); //student가 갖고있는 getName 호출
		System.out.println(name);
		student.study();
		
		//클래스 변수는 클래스이름.변수명(참조변수 이름 아님)
		System.out.println(Student.SCHOOL_NAME);
		
		Student student2 = new Student("홍길동", "컴퓨터공학과");
		System.out.println(student2.getSsn());
		
		System.out.println(Student.SCHOOL_NAME); //바로 클래스 변수로 접근
		
		
		Student.printSchoolName(); //다이렉트 클래스 접근(권장). 메소드 통해 출력
		student.printSchoolName(); //인스턴스 변수로 호출(비권장). 딱 봤을 때 인스턴스 변수인지 클래스 변수인지 안 보이니까
		

	}

}
