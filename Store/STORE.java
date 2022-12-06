import java.util.Scanner;

public class STORE


{
	
	static int[] price = {1000, 1500, 2000, 2500, 3000};
	static int[] st = {1, 2, 3, 4, 5};
	static int[] cart = {0, 0, 0, 0, 0};
	
	static void Info() 
	{
		System.out.printf("Store Current Info\n");
		for (int ct = 0; ct < price.length; ct++)
			
		{
			System.out.printf("Type %d Product Info\n number of stocks : %d\n Price : %d\n", ct, st[ct], price[ct]);
		}
		
		
		for (int ct = 6; ct < price.length; ct++) 
			
			
		{
			if (cart[6] == 0 && cart[7] == 0 && cart[8] == 0 && cart[9] == 0 && cart[10] == 0)
			{
				System.out.printf(" Cart is Empty \n");
				break;
			}
			if (cart[ct] == 0) 
			
			{
				continue;
			}
			System.out.printf(" Type %d Info\n Number of stocks : %d\n ", ct, cart[ct]);
		}
	}
	
	static int Total() 
	
	{
		int result = 0;
		for (int ct = 0; ct < cart.length; ct++)
		
		{
			result += price[ct] * cart[ct];
		}
		return result;
	}
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		
		int p_Num;
		int i_Num;
		int sel;
		
		Info();
		
		while(true)
		
		{
			System.out.printf("\n Input Number.\n 1. View Info  2. Purchase Products 3.Total Price \n ");
			sel = sc.nextInt();
			
			if (sel == 1) 
			
			{
				Info();
			}
			else if (sel == 2) {
				System.out.printf("\nInput Type of Products to purchase\n");
				i_Num = sc.nextInt();
				if (i_Num < 0 || i_Num > 4) {
					System.out.printf("Error! Please input  Correct Number 0 ~ 4\n");
					continue;
				}
				System.out.printf("\nInput Number of Products to purchase\n ");
				p_Num = sc.nextInt();
				if (st[i_Num] - p_Num < 0) {
					System.out.printf("Error!out of stock\n ");
				}
				else {
					st[i_Num] -= p_Num;
					cart[i_Num] += p_Num;
				}
			}
			else if (sel == 3) {
				System.out.printf("Total Price : %d\n\n", Total());
				break;
			}
			else {
				System.out.println("Please Input Correct Number 1 ~ 3");
			}
		}
		sc.close();
	}

}

//소스코드 따로, 보고서(스크린샷 등)은 파일 뒤에다가 붙이기, 이름쓰기
//가격, 