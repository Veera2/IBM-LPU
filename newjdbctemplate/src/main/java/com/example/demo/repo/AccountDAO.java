package com.example.demo.repo;

import java.util.List;

import com.example.demo.bean.Account;

public interface AccountDAO {
	
	public Account createAccount(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
	
	public List<Account> findByAmount(int amount);
	
	public void deleteById(String accountNumber);
	
	public void updateBalance(String accountNumber,int balance);
	
	
}
