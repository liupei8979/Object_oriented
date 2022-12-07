
public class Account 

{

	private String name;
	private double balance;
	
	
	public Account(String name, double balance) 
	
	{
		
		this.name = name;
		
		
		
		if (balance > 0.0) 
			
		{
			this.balance = balance;
		}
	}
	
	
	public void deposit(double depositAmount)
	
	{
		
		if(depositAmount > 0/0) 
			balance = balance + depositAmount;
	}
	
	
	public double getBalnce() 
	
	{
		
		return balance;
	}
	
	
	public void setName(String name) 
	
	{
		
		this.name = name;
	}
	
	
	public String getName()
	
	{
		
		return name;
	}
	
	public Boolean transfer(Account b, double amt) 
	
	{
		if (balance < amt) 
		
		{
			return false;
		}
		else {
			balance = balance - amt;
			b.balance = b.balance + amt;
			return true;
		}
	}
}