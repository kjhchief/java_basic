package ezen.ams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 배열로 한것을 collection으로 한다. 얼마나 심플해지나?
 * 
 * @Author 김재훈
 * @Date 2023. 1. 9.
 */
public class MapAccountRepository {
	// Key는 계좌번호(String 타입), 값은 Account
	private Map<String, Account> accounts; 

	public MapAccountRepository() {
		accounts = new HashMap<>();
	}

	// 계좌 등록
	public void addAccount(Account account) throws RuntimeException {
		if(accounts.containsKey(account.getAccountNumber())) {
			throw new RuntimeException("이미 등록된 계좌입니다.");
		}else {
			accounts.put(account.getAccountNumber(), account);	
		}
	}

	// 전체계좌 목록 조회
	public List<Account> getAccounts() {
		return new ArrayList<>(accounts.values()); // 1도 몰르겠음.
	}

	// 계좌 번호로 조회. Map은 루프를 안 돌아도 빠르다. 
	public Account findByNumber(String number) {
		return accounts.get(number); 
	}

	public boolean removeAccount(String number) {
		Account removeAccount = accounts.remove(number);
		if(removeAccount != null) { // 삭제 되었다면
			return true;
		}
		return false;
	}
}
