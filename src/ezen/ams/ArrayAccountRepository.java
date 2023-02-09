package ezen.ams;

/**
 * AccountRepository 인터페이스 구현 클래스
 * 
 * @Author 김재훈
 * @Date 2023. 1. 9.
 */
public class ArrayAccountRepository implements AccountRepository {

	private Account[] accounts;
	private int count;

	public ArrayAccountRepository() {
		this(10);
	}

	public ArrayAccountRepository(int capacity) {
		this.accounts = new Account[capacity];
	}

	//전체계좌 목록
	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void addAccount(Account account) {
		accounts[count++] = account;

	}

	@Override
	public Account[] getAccounts() {
		return accounts;
	}

	@Override
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

	@Override
	public boolean removeAccount(String number) {
		for (int i = 0; i < count; i++) {
			String an = accounts[i].getAccountNumber();// String 타입 an 변수 선언. i 번째 accounts(계좌)인데 getAccountNumber 메소드를
														// 불러서 쓴다.
			if (an.equals(number)) {
				for (int j = i; j < count - 1; j++) { // i 부터 시작한다. 걍 j로 하면 뭔가 밀림.
					accounts[j] = accounts[j + 1];
				}
				count--;
				return true;
			}
		}
		return false;
	}

}
