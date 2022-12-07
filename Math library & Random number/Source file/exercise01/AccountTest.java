import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", 100.50);
		
		System.out.printf("Before calling transfer method%n");
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalnce());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalnce());
		
		Scanner input = new Scanner(System.in);
		
		double amt = 0;
		int flag = 0;
		int sel = 0;
		
		while(flag == 0) 
		
		{
			System.out.printf("%nEnter Account Number to send money...1. Jane Green, 2. John Blue, 3.Exit%n");
			sel = input.nextInt();
			switch(sel) 
			
			{
			case 1:
				System.out.printf("Enter amount to send...%n");
				amt = input.nextDouble();
				
				if (account1.transfer(account2, amt) == false) 
				
				{
					System.out.printf("Error! Transfer Failed.%n");
					System.out.printf("After calling transfer method...(Failed)%n");
					System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalnce());
					System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalnce());
				}
				else 
				
				{
					System.out.printf("Transfer $%.2f from %s to %s Sucessfull!%n", amt, account1.getName(), account2.getName());
					System.out.printf("After calling transfer method...(Sucessful)%n");
					System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalnce());
					System.out.printf("1%s balance: $%.2f%n", account2.getName(), account2.getBalnce());
					}
				break;
				
				
			case 2:
				
				System.out.printf("Enter amount to send...%n");
				amt = input.nextDouble();
				
				if (account2.transfer(account1, amt) == false)
				
				{
					System.out.printf("Error! Transfer Failed.%n");
					System.out.printf("After calling transfer method...(Failed)%n");
					System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalnce());
					System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalnce());
				}
				else
				
				{
					System.out.printf("Transfer $%.2f from %s to %s Sucessfull!%n", amt, account2.getName(), account1.getName());
					System.out.printf("*After calling transfer method...(Sucessful)%n");
					System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalnce());
					System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalnce());
				}
				break;
				
				
			case 3:
				System.out.printf("Current Info...%n");
				System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalnce());
				System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalnce());
				System.out.printf("Exit.");
				flag = 1;
				break;
			default:
				System.out.printf("correct Number 1, 2 %n%n");
				break;
			}
		}
		
		input.close();
	}
}