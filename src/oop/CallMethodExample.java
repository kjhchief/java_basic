package oop;

/**
 * Call by Value vs Call by reference
 * 김재훈
 *
 */
public class CallMethodExample {
	
	public static void doTask(int x) { //인스턴스 메소드
		x += 10;
		System.out.println(x);
	}
	public static void doTask2(Account account) {
		account.deposit(10000);
		System.out.println(account.getRestMoney());
		
	}

	public static void main(String[] args) {
//		doTask(10); 인스턴스 메소드라 이렇게 호출 안 됨. 근데 위에 메소드를 static으로 만들면 가능하다.
//		CallMethodExample e = new CallMethodExample();
//		e.doTask(10); //이렇게는 된다.
		int i = 100;
		//Call by Value
		doTask(i);
		System.out.println(i);
		
		Account account = new Account("1111-2222-3333", "김재훈", 1234, 100000);
		doTask2(account);
		
		System.out.println(account.getRestMoney());
		
		
				
	}

}
