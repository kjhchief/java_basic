package ezen.array;

import oop.Account;

/**
 * @author 김재훈 2023. 1. 2. 계좌 저장소 객체 여러개의 계좌를 저장하고 관리(추가, 검색, 수정, 삭제)하는 역할의 클래스
 */
public class AccountRepository {
	// 다형성 Up casting
	private Account[] accounts; // Account[]를 참조타입으로 갖는 accounts라는 필드! 실제 계좌정보가 저장되는 배열칸은 accounts 다?
	private int count; // 추가되는거 관리? 위한 속성.

	public AccountRepository() { // 이게 기본 생성자??
		this(10); // 기본 10개 배열로 초기화.
	}

//	public AccountRepository(Account[] accounts) {
//		this.accounts = accounts;
//	}
	public AccountRepository(int capacity) { // 저장소 메소드. int capacity에 인자로 숫자를 받으면, accounts 배열에 새로운 빈 칸이 생긴다.
		this.accounts = new Account[capacity];
	}

	// 세터 게터
	public Account[] getAccounts() {
		return accounts;
	}
//	public void setAccounts(Account[] accounts) {
//		this.accounts = accounts;
//	} 값 설정, 변경하는 메소드인데 이거 누가 해킹해서 값 이상하게 설정할 수 있으니 아예 지워버리기. 문법적으로는 만드는게 맞긴함.

	public int getCount() {
		return count;
	}

	// 계좌 등록 기능. ArrayExample7 내용을 기능화. 받은 인자를 배열에 저장하면서 다음 텅빈 배열 생성.
	public void addAccount(Account account) {
		accounts[count++] = account;
	}

	// 계좌 검색 기능
	public Account findByNumber(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();
			// 동일 계좌번호 여부 확인
			if (an.equals(number)) {
				return accounts[i]; // 메소드 빠져나가면서 찾은 객체 반환.
			}

		}
		return null; // 먼저 컴파일 에러 안 되게 리턴값 쓰고 초기화 시키기.
	}

	// 계좌 삭제 기능
//	public boolean removeAccount(String number) {
//		for (int i = 0; i < count; i++) {
//			String an = accounts[i].getAccountNumber();
//			if (an == number) {
//				accounts[i] = accounts[i+1];
//				count--;
//				return true;
//			} 
//
//		}
//
//		return false;
//	}
	public boolean removeAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();// String 타입 an 변수 선언. i 번째 accounts(계좌)인데 getAccountNumber 메소드를 불러서 쓴다.
			if (an.equals(number)) {
				for (int j = i; j < count-1; j++) { // i 부터 시작한다. 걍 j로 하면 뭔가 밀림. 
					accounts[j] = accounts[j+1];
				}
				count--;
				return true;
			}
		}
		return false;
	}
	

}
