import java.security.SecureRandom;

public class RollDie

{

	public static void main(String[] args) 
	
	
	{
		SecureRandom randomNumbers = new SecureRandom();
		
		int storage[] = new int[6];
		
		for (int roll = 1; roll <= 6000000; roll++) 
		
		
		{
			
			int face = 1 + randomNumbers.nextInt(6);
			
			switch(face) 
			
			{
			case 1:
				storage[face - 1]++;
				break;
			case 2:
				storage[face - 1]++;
				break;
			case 3:
				storage[face - 1]++;
				break;
			case 4:
				storage[face - 1]++;
				break;
			case 5:
				storage[face - 1]++;
				break;
			case 6:
				storage[face - 1]++;
				break;
			}
		}
		
		System.out.println("Num\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", storage[0],
				storage[1], storage[2], storage[3], storage[4], storage[5]);
	}

}