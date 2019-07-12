package com.capg.wallet.service;

import java.util.HashMap;

import com.capg.wallet.bean.Account;

public interface AccountService {
	public String createAccount(account AccountNumber); 
	public void addMoney(String AccountNumber, Integer money);
	public void viewAccount(String AccountNumber);
	public void transferMoney(String AccountNumber, String RecieverAccountNumber,Integer TransferAmount  );
	public  HashMap<String, Account> getAllAccounts();
	}
