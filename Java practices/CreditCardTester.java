package test;

import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

/**	This class provides the user interface to test CreditCard.java.
 */
public class CreditCardTester
{
	public static void main(String[] args)
	{
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		out.println("Commands:");
		out.println(" C to charge");
		out.println(" P to pay");
		out.println(" L to set limit");
		out.println(" B to get balance");
		out.println(" N to get name");
		out.println(" E to test expiry Date composition");
		out.println(" S to get toString output");
		out.println(" X to exit");
		out.println("For example,\n > C 500.00\nwill charge $500 to the card");
		
		boolean exit = false;
		char cmd;
		double value;
		final long FIVE_YEARS_FROM_NOW = 157680000000L;
		Date expiry = new Date(System.currentTimeMillis() +
				FIVE_YEARS_FROM_NOW);
		CreditCard cc = new CreditCard(123456, "Alexia Smith", expiry);
		while (!exit)
		{
			out.print("> ");
			cmd = in.next().toUpperCase().charAt(0);
			if (cmd == 'C')
			{
				value = in.nextDouble();
				out.println(cc.charge(value) ? "done" : "failed");
			}
			else if (cmd == 'P')
			{
				value = in.nextDouble();
				out.println(cc.pay(value) ? "done" : "failed");
			}
			else if (cmd == 'L')
			{
				value = in.nextDouble();
				out.println(cc.setLimit(value) ? "done" : "failed");
			}
			else if (cmd == 'B')
			{
				out.println(cc.getBalance());
			}
			else if (cmd == 'N')
			{
				out.println(cc.getName());
			}
			else if (cmd == 'E')
			{
				Date before = cc.getExpiry();
				out.println("Changing Date object via reference.");
				expiry.setTime(System.currentTimeMillis());
				Date after = cc.getExpiry();
				if (before != after && before.equals(after))
				{
					out.println("Test passed.");
				}
				else
				{
					out.println("Test failed -- not composition!");
				}
			}
			else if (cmd == 'S')
			{
				out.println(cc);
			}
			else if (cmd == 'X')
			{
				exit = true;
			}
		}
	}
}