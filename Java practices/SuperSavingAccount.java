import java.util.Date;
import java.util.Iterator;


public class SuperSavingAccount extends Account1 {
  
	
	public static String AccountType = "SuperSavingAccount";
	public static String clientType;
	private static double INTERESR_RATE = 2;


	
	public SuperSavingAccount(String clientType)
	{
		super();
		super.setAccountType(AccountType);
		super.setClientType(clientType);
	}
	
	//public void deposite(Date date, String details, double amount){
	//	Transaction t = new Transaction(date, details, amount);
	//	balance = balance + t.getAmount();
	//	transactions.add(t);
		
		//创建一个新的Transaction class，并设置 日期、金额、和交易详情；然后将Transaction添加到LinkedList中去。
		
	


	@Override
	public double calculateOneYearInterest() {
		// TODO Auto-generated method stub
		return super.getBalance() * INTERESR_RATE / 100;
	}
	public static void main(String[] args) {
	
		Date d = new Date();
		final double AMT = 88;
		SuperSavingAccount t1 = new SuperSavingAccount("PersonalBanking");
		int i;
		for (i=0;i<2;i++){
		t1.deposit(d, "A deposit", AMT);
		}
		t1.withdraw(d, "A deposit", 99);
		
		System.out.print(t1);
	
	if(transactions.hasNext()){
	
		transactions.next();
		transactions.remove();
		
		
	}
	System.out.print(t1);
		}

	}



