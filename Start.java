package com.capg.wallet.presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.capg.wallet.bean.Account;
import com.capg.wallet.service.AccountServiceImpl;

public class Start {
	static AccountServiceImpl service=new AccountServiceImpl();
	public static void showMenu(){
		System.out.println("******WELCOME******");
		System.out.println("enter your choice");
		System.out.println("01. Create an Account");
		System.out.println("02. Add Money to Account");
		System.out.println("03. Show Details");
		System.out.println("04. Transfer Money");
		System.out.println("05. Show All Accounts");
		System.out.println("06. Exit");
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		while(true) {
			showMenu();
			choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.println("create an account");
			try {
			Account account=new Account();
			System.out.println("enter your name");
			account.setName(sc.next());
			System.out.println("enter your mobile number");
			account.setPhoneNumber(sc.nextLong());
			System.out.println("enter your emailid");
			account.setEmailId(sc.next());
			String AccountNumber = service.createAccount(account);
			System.out.println("your account num is " +AccountNumber);
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
			case 2: System.out.println("add money to account");
			try {
			System.out.println("enter your Account number");
			String AccountNumber=sc.next();
			System.out.println("enter the money to be added");
			int money=sc.nextInt();
			service.addMoney(AccountNumber, money);
			} catch (Exception e) {
				System.out.println(e);
			}
			break;
			case 3: System.out.println("show the details");
			try {
				System.out.println("enter your account number");
				String AccountNumber=sc.next();
				Account account=service.viewAccount(AccountNumber);
				System.out.println("**welcome**"+"\n your details are"+"\n name"+account.getName()+"\n MoileNumber"+account.getPhoneNumber()+"\n emailId"+account.getEmailId()+"\n balance"+account.getBalance());
			} catch(Exception e) {
				System.out.println(e);
			}
			break;
			case 4: System.out.println("transfer money");
			try {
				System.out.println("enter your account number");
				String AccountNumber=sc.next();
				System.out.println("enter reciever account number");
				String RecieverAccountNumber=sc.next();
				System.out.println("enter the amount to transfer");
				int TransferAmount=sc.nextInt();
				service.transferMoney(AccountNumber, RecieverAccountNumber, TransferAmount  );
			} catch(Exception e) {
				System.out.println(e);
			}
			break;
			case 5: System.out.println("show all accounts");
			try {
				Map<String, Account> userlist=new HashMap<String, Account>();
				userlist=service.getAllAccounts();
				if(!userlist.isEmpty()) {
					for(Map.Entry<String, Account> entry: userlist.entrySet()) {
						userlist.forEach((key,value) -> System.out.println(key+"="+value));
						}
				} else {
					System.out.println("no accounts found");
				}
			}catch (Exception e) {
				System.out.println(e);
					}
			break;
			case 6:System.out.println("****BYE****");
			System.exit(0);
			default :
				break;
					
				
			}
			
			
		}
	}

}
