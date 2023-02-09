package oop;

public class MinusAccountExample {

	public static void main(String[] args) {
		MinusAccount ma; //참조변수 선언
		ma = new MinusAccount("1111-2222", "김재훈", 1111, 10000, 10000000, "2023.1.4"); //왜 set메소드를 안 썼지? 처음 만드는 거라서??  자식 클래스의 인스턴스 객체 생성하면서 자동으로 부모 클래스의 세터 게터, 메소드, 속성(변수) 등 다 불러온다. 이것을 ' "1111-2222", "김재훈", 1111, 10000 '이걸 타이핑 함으로서 하는건가?
		
		//부모메소드 재사용
		System.out.println(ma.getAccountNumber()); //get이니까 저장된 애를 받아오는 출력
		System.out.println(ma.getAccountOwner());
		ma.deposit(1000000);
		ma.withdraw(1000);
		System.out.println("현재잔액: " + ma.getRestMoney());
		System.out.println(ma.toString());
		System.out.println(); // toString() 메소드는 JVM에 의해 자동 호출된다. 
		
		//새롭게 추가된 메소드 사용
		System.out.println(ma.getBorrowMoney());
		System.out.println(ma.getBorrowDate());
		
		// Object의 메소드 재사용
		int code = ma.hashCode();
		System.out.println(code);
		System.out.println(ma.toString());
		
		String name = "S김재훈"; //new String("김재훈"); 와 같다.
		System.out.println(name.toString());
		System.out.println(name); // String 클래스에 재정의된 toString() 메소드 자동 호출
		
		// Object 클래스는 equal() 메소드를 기본 제공
		// 레퍼런스 비교
		
		Account account1 = new Account("1111", "김기정", 1111, 10000);
		Account account2 = new Account("1111", "김기정", 1111, 10000);
		System.out.println(account1 == account2); // 참조 변수니까 주소값을 비교한다. 기본 타입 변수면 값을 비교해서 true가 되겠지
		System.out.println(account1.equals(account2)); // Object의 equals 메소드 재사용. Object의 equals도 주소값만 비교한다.
		
		String message1 = "자바 재밌어요";
		String message2 = "자바 재밌어요";
		System.out.println(message1.equals(message2)); 
		// 여기서 유추할 수 있는 것.
		// String 클래스는 Object가 제공하는 equals() 메소드를 재사용하는 것이 아니라
		// equals() 메소드를 재정의하여 문자열과 문자열을 비교한다.
		
		Object obj;

	}

}
