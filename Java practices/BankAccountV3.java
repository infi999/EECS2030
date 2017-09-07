package test;

import java.io.File;
import java.util.Scanner;



/**	This class reads transactions from an input file.  The first line of the
 * 	file provides account information.  Each subsequent line represents a
 * 	transaction.  Each transaction is written as "type,amount", where "type"
 * 	is "D" for deposit or "W" for withdrawal, and "amount" represents the
 * 	amount of the transaction.
 * 
 * 	Here is a sample input file:

Steven Castellucci,123-456-789-5,3Uj5CEmt
D,300
W,50
W,80
D,20

*/

public class BankAccountV3
{
	public String name;
	public String number;
	private String password;
	private double balance;
	
	public BankAccountV3(String name, String number, String password)
	{
		this.name = name;
		this.number = number;
		this.password = password;
		this.balance = 0;
	}
	
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	public boolean withdraw(double amount)
	{
		boolean isValid = amount < this.balance;
		if (isValid) // only withdraw if sufficient funds
		{
			this.balance -= amount;
		}
		return isValid;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public String toString()
	{
		return "Name: " + name + "; Account No.: " + number +
				"; Balance: $" + String.format("%8.2f", this.balance);
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		Scanner fileInput = new Scanner(new File("bankInput.txt"));
		
		String line = fileInput.nextLine(); // Assumes file has at least one line.
		String[] fields = line.split(",");  // The fields are comma-delimited.
		BankAccountV3 ba = new BankAccountV3(fields[0], fields[1], fields[2]);
		System.out.println(ba);
		
		System.out.println("Transactions:");
		for ( ; fileInput.hasNextLine(); )  // Alternatively, use while-loop.
		{
			fields = fileInput.nextLine().split(",");
			String transaction = fields[0];
			double amount = Double.parseDouble(fields[1]);
			if (transaction.equals("D"))    // Process deposit.
			{
				System.out.printf("Deposit  $%8.2f\n", amount);
				ba.deposit(amount);
			}
			else                            // Process withdrawal.
			{
				System.out.printf("Withdraw $%8.2f...", amount);
				if (ba.withdraw(amount))
				{
					System.out.println("Succeeded");
				}
				else
				{
					System.out.println("Failed!!!");
				}
			}
		}
		fileInput.close();
		System.out.println(ba);
	}
}