package test;

import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;


public class SavingsTester
{

	public static void main(String[] args)
	{
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		out.println("Commands: test1, test2, test3, test4, test5, exit");
		
		boolean exit = false;
		String cmd;
		while (!exit)
		{
			out.print("\n> ");
			cmd = in.next();
			if (cmd.equals("exit"))
			{
				exit = true;
			}
			else if (cmd.equals("test1"))
			{
				test1();
			}
			else if (cmd.equals("test2"))
			{
				test2();
			}
			else if (cmd.equals("test3"))
			{
				test3();
			}
			else if (cmd.equals("test4"))
			{
				test4();
			}
			else if (cmd.equals("test5"))
			{
				test5();
			}
		}
	}
	
	
	private static void test1()
	{
		System.out.println("Tests Transaction constructors and accessors.");
		
		Date d = new Date();
		final double AMT = 88.5;
		Transaction t1 = new Transaction(d, "A deposit", AMT);
		Transaction t2 = new Transaction(d, "A deposit", AMT);
		boolean result = t1 != t2;
		result &= t2.getDate().equals(d);
		result &= t2.getDetails().equals("A deposit");
		result &= Double.compare(t2.getAmount(), AMT) == 0;
		System.out.println(result ? "passed" : "failed");
		System.out.println(t1);
		System.out.println(t2);
	}

	private static void test2()
	{
		System.out.println("Tests Transaction equals() method.");
		
		Date d = new Date();
		final double AMT = 520.5;
		Transaction t1 = new Transaction(d, "A deposit", AMT);
		Transaction t2 = new Transaction(d, "A deposit", AMT);
		Transaction t3 = new Transaction(new Date(), "A fake deposit", AMT+1);
		boolean result = !t1.equals(null);
		result &= !t1.equals(d);
		result &= t1.equals(t1);
		result &= t1.equals(t2);
		result &= !t1.equals(t3);
		System.out.println(result ? "passed" : "failed");
	}

	private static void test3()
	{
		System.out.println("Tests SavingsAccount constructor and methods.");
		
		SavingsAccount sa = new SavingsAccount();
		boolean result = (Double.compare(sa.getBalance(), 0.0) == 0) &&
			sa.getTransaction().isEmpty();
		try
		{
			sa.post(null);
			result = false;
		}
		catch (NullPointerException npe) {}
		sa.post(new Transaction(new Date(), "A deposit", 600.0));
		sa.post(new Transaction(new Date(), "A withdrawl", -380.5));
		result &= Double.compare(sa.getBalance(), 219.5) == 0;
		result &= sa.getTransaction().size() == 2;
		System.out.println(result ? "passed" : "failed");		
	}

	private static void test4()
	{
		System.out.println("Tests sortation of SavingsAccount transactions.");
		
		SavingsAccount sa = new SavingsAccount();
		Date d1 = new Date();
		d1.setTime(1435865370574L);
		Date d2 = new Date();
		d2.setTime(1435868370575L);
		Date d3 = new Date();
		d3.setTime(1435865330579L);
		sa.post(new Transaction(d2, "A deposit", 350.0));
		sa.post(new Transaction(d1, "A withdrawl", -100.0));
		sa.post(new Transaction(d2, "A deposit", 350.0));
		sa.post(new Transaction(d3, "A deposit", 100.0));
		sa.post(new Transaction(d1, "A withdrawl", -200.0));
		sa.post(new Transaction(d1, "A deposit", 100.0));
		boolean result = Double.compare(sa.getBalance(), 250.0) == 0;
		result &= sa.getTransaction().size() == 5;
		System.out.println(result ? "passed so far..." : "failed");
		System.out.println("But I can't test for sorted order without " +
				"giving you the code. :-)  So I will print the set for " +
				"you to review youself.");
		for (Transaction t : sa.getTransaction())
		{
			System.out.println(t);
		}
	}
	
	private static void test5()
	{
		System.out.println("Tests that Transaction's has-a relationship " +
				"with Date is via composition, not simple aggregation.");
		
		Date d1 = new Date();
		d1.setTime(1435865370574L);
		Transaction t = new Transaction(d1, "A withdrawl", -100.0);
		Date before = t.getDate();
		d1.setTime(1385865370574L);
		Date after = t.getDate();
		boolean result = before != after && before.equals(after);
		System.out.println(result ? "passed" :
			"failed - not composition!");
	}
}