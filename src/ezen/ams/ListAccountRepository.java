package ezen.ams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 배열로 한것을 collection으로 한다. 얼마나 심플해지나?
 * 
 * @Author 김재훈
 * @Date 2023. 1. 9.
 */
public class ListAccountRepository {

	private List<Account> accounts;

	public ListAccountRepository() {
		accounts = new ArrayList<>();
//		accounts = new LinkedList<>();
	}

	// 계좌 등록
	public void addAccount(Account account) {
		accounts.add(account);
	}

	// 전체계좌 목록 조회
	public List<Account> getAccounts() {
		return accounts;
	}

	// 계좌 번호로 조회
	public Account findByNumber(String number) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equals(number)) {
				return account;
			}
		}
		return null;
	}

	public boolean removeAccount(String number) {
		for (Account account : accounts) {
			if (account.getAccountNumber().equals(number)) {
				accounts.remove(account);
			}
		}
		return false;
	}
}


