package com.capg.wallet.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.capg.wallet.bean.Account;
import com.capg.wallet.dao.AccountDao;
import com.capg.wallet.dao.AccountDaoImpl;

public class AccountServiceImpl extends Validator implements AccountService {
	AccountDaoImpl dao=new AccountDaoImpl();
	Validator validator=new Validator();
	public String createAccount(account AccountNumber); 
	String AccountNumber=null;
	try
	{
		validator.Validator(account);
		Random rand=new Random();//dd
		int num= rand.nextInt(100)+10000000;
		AccountNumber=String.valueOf(num);
		dao.createAccount(AccountNumber, account);
		
	} catch (Exception e) {
		throw e;
	}
	return AccountNumber;
}
public void addMoney(String AccountNumber, Integer money);
try {
	dao.addMoney(AccountNumber, Money);
} catch (Exception e) {
	throw e;
}
public void viewAccount(String AccountNumber);
try {
	dao.viewAccount(AccountNumber);
} catch(Eexception e) {
	throw e;
}
public void transferMoney(String AccountNumber, String RecieverAccountNumber,Integer TransferAmount  );
try {
	dao.transferMoney(AccountNumber,  RecieverAccountNumber, TransferAmount  );
} catch (Exception e) {
	throw e;
}
public  HashMap<String, Account> getAllAccounts();
try {
	return dao.getAllAccounts();
} catch (Exception e) {
	throw e;
}

	
	


}