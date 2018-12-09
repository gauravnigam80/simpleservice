package com.service.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.service.model.rest.Account;


@Service
public class AccountServiceImpl implements AccountService {

	private Map<Long,Account> map = new HashMap<Long,Account>();
	
	private final AtomicLong counter = new AtomicLong();
	
	
	/**
	 * 
	 */
	public AccountServiceImpl() {
		super();
	}

	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(map.values());
	}

	@Override
	public Account getAccount(long id) {
		return map.get(id);
	}

	@Override
	public void createAccount(Account account) {
		Account account_copy = new Account(account.getFirstName(),account.getSecondName(),account.getAccountNumber());
		account_copy.setId(counter.incrementAndGet());
		map.put(account.getId(), account);
	}

	@Override
	public Boolean deleteAccount(long id) {
		return map.remove(id)!=null ? Boolean.TRUE:Boolean.FALSE;
	}
	
}
