package com.capg.wallet.bean;

public class Account {
	private String Name;
	private long PhoneNumber;
	private String EmailId;
	private int Balance;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", EmailId=" + EmailId + ", Balance="
				+ Balance + "]";
	}
	
	

}
