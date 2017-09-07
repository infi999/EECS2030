
import java.util.Date;



public abstract class Account1 {
	
	private double balance;
	private String name;
	private String accountType;
	private String clientType;
	public static MyLinkedList<Transaction> transactions = new MyLinkedList<Transaction>();
	private double cost = 0;
	
    public void setClientType(String clientType){
    	
    	this.clientType = clientType;
    }
    
    public String getClientType(String clientType){
    	return clientType;
    }
    
   
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public double getBalance() {
    return balance;
    }
	

	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract double calculateOneYearInterest();	
	

	public void deposit (Date date, String details, double amount){
        Transaction t = new Transaction(date, details, amount);
		balance = balance + t.getAmount();
        transactions.add(t);
	}
	
	public void withdraw (Date date, String details, double amount){
        Transaction t = new Transaction(date, details, amount);
		balance = balance - t.getAmount();
        transactions.add(t);
	}
	
	public MyLinkedList<Transaction> getTransaction(){
		return transactions;
		
	}

	
	
	public double getCost(){

		if ((this.clientType == "PersonalBanking") && this.balance < 5000){
			if (transactions.getSize() > 20){
				return cost = (transactions.getSize() - 20) * 4;
			}
		}
		return cost;
	}
	
	@Override
	public String toString() {
		return accountType + " " + clientType + " balance=" + balance + "  name=" + name + "  TransactionCount=" + transactions.getSize() + " interest =" + this.calculateOneYearInterest() + " extra costs for personal =" + this.getCost() + this.getTransaction();
	}
	
	
	
	
	
	
	

	

}
