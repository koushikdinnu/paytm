package com.capg.wallet.service;

import com.capg.wallet.bean.Account;

import Exceptions.InvalidMailException;
import Exceptions.InvalidPhoneNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capg.wallet.bean.*;

public class Validator {
	public void Validator(Account account) {
	
	{
		try {
			 validatePhoneNumber(account.getPhoneNumber());
			 validateEmailId(account.getEmailId());
			 
				
			}catch (InvalidPhoneNumberException | InvalidMailException e) {
				// TODO Auto-generated catch block
				throw e;
			}
		}
		public void validateEmail(String string) throws InvalidMailException
		{
			try
			{
				Pattern p = Pattern.compile("\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b");
				Matcher m = p.matcher(string);
				if(!m.matches())
				{
					throw new InvalidMailException();
				}
			}
			catch(Exception e)
			{
				throw e;
			}
		}
		public void validatePhoneNumber(long phone) throws InvalidPhoneNumberException
		{
			try
			{
				String temp=String.valueOf(phone);
				Pattern p = Pattern.compile("\\d{10}");
				Matcher m = p.matcher(temp);
				if(!m.matches() || (!(temp.length()==10)))
				{
					throw new InvalidPhoneNumberException();
				}
			}
			catch(Exception e)
			{
				throw e;
			}
		}
		
	}