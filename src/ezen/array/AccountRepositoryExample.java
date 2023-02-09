package ezen.array;

import oop.Account;
import oop.MinusAccount;

/**
 * @author 김재훈 2023. 1. 3. 애플리케이션 실행을 위한 역할 - 애플리케이션(메인) 클래스
 */
public class AccountRepositoryExample {

	public static void main(String[] args) { // 클래스 하나 새로 만들기 귀찮아서 걍 여기 만든거라 생각하면 됨.
		AccountRepository repository = new AccountRepository(100); // AR의 생성자메소드 중에 int capacity를 매개변수로 갖는 저장소 메소드에 인자로 100을 보냄. => AR에 있는 accounts 참조변수가 100개의 빈 칸을 갖는 배열이 됨. 그럼 repository는 뭐지? 생성자인가? accounts를 불러오는 역할? 다리와 같은 역할?
		
		// Account 클래스의 생성자에 접근하여 인스턴스(고객정보) 생성
		// 입출금 신규계좌 생성 테스트
		Account account = new Account("1111-2222", "김재훈", 1111, 100000); //여기서 repository에 배열 1칸이 채워졌다. 정확히는 accounts가 1칸이 채워진거지.

		// 입출금 신규계좌 등록
		repository.addAccount(account); // 방금 만든 account객체를 
		repository.addAccount(new Account("1111-3333", "홍길동", 2222, 10000));
		repository.addAccount(new Account("1111-4444", "김또깡", 3333, 10000));
		
		// 마이너스 신규계좌 등록
		MinusAccount ma = new MinusAccount("2222-4444", "김대출", 1111, 10000, 10000000, "2023.1.10");
		// 자동형변환 적용(Up casting)
		repository.addAccount(ma);
		repository.addAccount(new MinusAccount("2222-5555", "김슝슝", 1111, 1000, 100000, "2023.1.2"));

		// 전체 계좌 목록 조회
		System.out.println("----- 전체 계좌 목록 -----");
		Account[] list = repository.getAccounts(); //모르겠음...
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}

		// 계좌 번호로 계좌 검색 테스트
		System.out.println("----- 계좌 검색 -----");
		Account findAccount = repository.findByNumber("1111-3333");
		// Account로 반환하니까 Account로 받는다..
		if (findAccount != null) {
			System.out.println(findAccount.toString());
		} else {
			System.out.println("해당 계좌가 존재하지 않습니다.");
		}

		// 계좌 번호로 계좌 삭제 테스트
		System.out.println("----- 계좌 삭제 -----");
		boolean result = repository.removeAccount("1111-3333");
		if (result) {
			System.out.println("정상 삭제하였습니다.");
			System.out.println(repository.getCount());
		} else {
			System.out.println("삭제하고자 하는 계좌가 존재하지 않습니다.");
		}
		// 전체 계좌 목록 조회
		System.out.println("----- 전체 계좌 목록 -----");
		list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		
		repository.addAccount(new Account("1111-7777", "박찬울", 1111, 10000));
		
		// 전체 계좌 목록 조회
		System.out.println("----- 전체 계좌 목록 -----");
		list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		

	}

}
