/**
 * 
 */
package com.service.rest;

import java.util.List;

import com.service.model.rest.Account;

/**
 * @author Gaurav Nigam
 *
 */
public interface AccountService {

	public List<Account> getAllAccounts();
	
	public Account getAccount(long id);

	public void createAccount(Account acccount);
	
	public Boolean deleteAccount(long id);
	
}
