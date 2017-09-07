package test;

import java.util.TreeSet;

public class SavingsAccount {
	public double balance;
	public TreeSet<Transaction> A;

public SavingsAccount(){
	
	this.balance = 0D;
	A = new TreeSet<Transaction>();
	
}
	
	

	public double getBalance() {

	for (Transaction t : getTransaction()){
		balance = balance + t.getAmount();
	}
	return balance;
}

	
	

	public TreeSet<Transaction> getTransaction() {
		return A;
	}

	public void post (Transaction t) throws NullPointerException
	{
		if (t == null)
		{
			throw new NullPointerException ("Can't put a null transaction!");
		}
		else
		{
			this.getTransaction().add(t);
		}
	}
}




