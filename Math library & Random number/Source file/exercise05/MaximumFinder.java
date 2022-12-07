

import java.util.Scanner;
import java.lang.Math;

public class MaximumFinder {

	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print(
				"Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		

		double result = maximum(number1, number2, number3);
		
		
		System.out.println("Maximum is " + result);
		input.close();
	}
	
	public static double maximum(double x, double y, double z) {
		double Value1 = Math.max(x, y);
		double Value2 = Math.max(y, z);
		double result = Math.max(Value1, Value2);
		
		return result;
	}
}