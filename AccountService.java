package Service;

import java.util.HashMap;

import Exceptions.*;
import bean.Account;

public interface AccountService {
	public String createAccountDao(Account user) throws IncorrectDetailsException, InvalidMailException, InvalidPhoneNumberException;
	public Account viewAccount(String AccountNumber) throws AccountNotFoundException;
	public void addMoney(String AccountNumber, int Amount) throws AccountNotFoundException;
	public void transfer(String AccountNumber1,String AccountNumber2, int Amount) throws InsuffecientBalanceException, AccountNotFoundException;
	public HashMap<String, Account> getAllAccounts();
}