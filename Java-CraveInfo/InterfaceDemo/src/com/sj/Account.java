package com.sj;



public class Account implements Printable {
	private int actID;
	private String accountHolderName;
	private double balance;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int actID, String accountHolderName, double balance) {
		super();
		this.actID = actID;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getActID() {
		return actID;
	}
	public void setActID(int actID) {
		this.actID = actID;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Account details:"+actID+"-"+accountHolderName);
	}
	
	/*
	 * @Override public String toString() {
	 * return("Account details are:"+actID+"-"+this.accountHolderName); }
	 */
	
	
	
	

}
