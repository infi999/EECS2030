package test;

import java.util.Date;

public class RewardCard extends CreditCard implements Transfer
{
	private int pointBalance;
	private int DoublePoints;
	
	public RewardCard(int cardNum, String cardName, Date expiry)
	{
		super(cardNum, cardName, expiry);
		this.pointBalance = 0;
	}
	
	public boolean charge(double amount)
	{
		if (super.getBalance() + amount <= super.getLimit())
		{
			super.charge(amount);
			this.pointBalance = (int) (pointBalance + amount);
		return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getPointsBalance()
	{
		return this.pointBalance;
	}
	public int getDoublePoints()
	{  this.DoublePoints = pointBalance * 2;
	   return DoublePoints;
	}
	
	
	
	
	public String toString()
	{
		String result = String.format(super.toString() + " points: " + this.getPointsBalance() + ".");
		return result;
	}
}