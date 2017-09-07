package test;

import java.util.*;

public final class Transaction implements Comparable <Transaction>
{
	private final Date date;
	private final String details;
	private final double amount;

	public Transaction (Date date, String details, double amount)
	{
		Date copydate = new Date(date.getTime());
		this.date = copydate;
		this.details = details;
		this.amount = amount;
	}
	
	public Date getDate(){
		return new Date(date.getTime());
		
	}
	
	public String getDetails(){
		return details;
		
	}
	
	public double getAmount(){
		return amount;
	}
	
	public int compareTo (Transaction other)
	{
		if (this.date.compareTo(other.getDate()) == 0)
		{
			if (this.getDetails().compareTo(other.getDetails()) == 0)
			{
				if (this.getAmount () - other.getAmount () > 0)
				{
					return 1;
				}
				else if (this.getAmount () - other.getAmount () < 0)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			
			}	
			else
			{
				return this.getDetails().compareTo(other.getDetails());
			}
		}
		return this.date.compareTo(other.getDate());
	}

	

		
		
		
		
		


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", details=" + details + ", amount=" + amount + "]";
	}

}