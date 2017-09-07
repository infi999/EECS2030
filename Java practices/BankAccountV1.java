package test;

		public class BankAccount
		{
			public String name;
			public String number;
			private String password;
			private double balance;
			
			public BankAccount(String name)
			{
				this.name = name;
				this.number = number;
				this.password = password;
				this.balance = 0;
			}
			
			
			public void deposit(double amount)
			{
				//this.balance = amount + balance; is the same as...
				balance += amount;
			}
			
			public void withdraw(double amount)
			{
				balance -= amount;
			}
			
			public double getBalance()
			{
				return balance;
			}
			
			public String toString()
			{
				return  name + this.balance;
			
			}
			
			public static void main(String[] args)
			{
				String name = "";
				
				BankAccount Account1 = new BankAccount("Account1");
				Account1.setBalance(0);
				Account1.deposit(1000);
				Account1.withdraw(700);
			   BankAccount Account2 = new BankAccount("Account2");
			   Account2.setBalance(0);
			   Account2.deposit(300);
			   System.out.println(Account1);
			   
			   System.out.println(Account2);
			   System.out.print("are they the same?" + (Account1 == Account2));
			   
			  
				
				
				
				
			}


			private void setName(BankAccount account2) {
				// TODO Auto-generated method stub
				
			}


			private void setBalance(int i) {
				// TODO Auto-generated method stub
				
			}


	}

