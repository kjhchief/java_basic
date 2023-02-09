package ezen.ams;

import java.util.List;

//import oop.MinusAccount;
//
//import oop.Account;

public class AMSExample2 {

	public static void main(String[] args) {
		System.out.println("애플리케이션 시작됨");
//		ListAccountRepository repository = new ListAccountRepository();
		MapAccountRepository repository = new MapAccountRepository();

		// 신규계좌 등록
		Account account3 = new Account("1111-2222-3333", "홍길동", 1234, 100500);
		repository.addAccount(account3);
		System.out.println("신규계좌 등록 완료!");
		repository.addAccount(new Account("2222-3333-4444", "박지성", 1111, 1000));
		System.out.println("신규계좌 등록 완료!");
		repository.addAccount(new MinusAccount("3333-4444-5555", "김대출", 1111, 1000, 10000000, "2023.1.9"));
		System.out.println("신규계좌 등록 완료!");

		// 전체계좌 조회
		System.out.println("----- 계좌 목록 -----");
		List<Account> list = repository.getAccounts();
		for (Account acc : list) {
			System.out.println(acc.toString());
		}

		// 계좌 이름으로 계좌 검색
		System.out.println("----- 계좌 검색 -----");
		Account findAccount = repository.findByNumber("1111-2222-3333");
		if (findAccount != null) {
			System.out.println("검색된 계좌 : " + findAccount);
			try {
				findAccount.withdraw(-100000);
			} catch (NotSufficientBalanceException e) {
				// 사용자에게 오류메세지 출력
//				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}

		} else {
			System.out.println("검색된 계좌가 존재하지 않습니다.");
		}

		// List로 하면 삭제 안 되는데 Map으로 하면 삭제 됨.
		boolean result = repository.removeAccount("2222-3333-4444");
		if (result) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}

		System.out.println("애플리케이션 종료됨");
	}

}
