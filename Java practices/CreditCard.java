package test;

import java.util.*;

public class CreditCard
{
	public static final double DEFAULT_LIMIT = 5000.0;
	
	private String name;
	private int number;
	private double balance;
	private double limit;
	private Date expiry;
	
	public CreditCard(int cardNum, String cardName, Date expiry)
	{
		balance = 0.0;
		limit = DEFAULT_LIMIT;
		// TODO: Initialize other attributes with passed parameters.
		this.number = cardNum;
		this.name = cardName;
		Date copyDate = new Date(expiry.getTime());
		this.expiry = copyDate;
	}
	
	public static double getDefaultLimit() {
		return DEFAULT_LIMIT;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public double getLimit() {
		return limit;
	}
	public Date getExpiry(){
	
	    return new Date(expiry.getTime());
		
	}

	
	public boolean charge(double amount){
		if (this.getBalance() + amount <= this.getLimit()){
			this.balance = balance + amount;
			return true;
		}else
		{
		return false;
		}
		
	}
		
	public boolean pay(double payment){
		this.balance = balance - payment;
		return true;
		
	}
	
	public boolean setLimit(double newLimit){
		if (newLimit >= this.getBalance()){
			this.limit = newLimit;
			return true;
		}
		return false;
		
		
	}

	@Override
	public String toString() {
		//return "CreditCard [ name=" + name + ", balance=" + balance + ", limit=" + limit + "]";
		return String.format("CreditCard [name=%s, balance=%.2f, limit=%.2f]",this.getName(), this.getBalance(), this.getLimit());
	}

		
		
		
		
		
		
		
		
}