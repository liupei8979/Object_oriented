public class MethodOverload {

	
	public static void main(String[] args)
	
	{
		
		System.out.printf("Square of integer 5 is %d%n",  square(5));
		System.out.printf("Square of double 5.5 is %f%n",  square(5.5));
		System.out.printf("Square of string 'hello' is %s%n", square("hello"));

	}
	
	public static int square(int intValue)
	
	{
		
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		
		return intValue * intValue;
	}
	
	
	public static double square(double doubleValue)
	
	{
		
		System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
		
		return doubleValue * doubleValue;
	}
	
	public static String square(String stringValue) 
	
	{
		
		System.out.printf("%nCalled square with String argument: %s%n", stringValue);
		
		return stringValue + stringValue;
	}
}
