
public class Time1Test {

	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());
	}
}



class SimpleTime{
	
	private int hourT;
	private int minuteT;
	private int secondT;

	
	
	
	public SimpleTime(int hour, int minute, int second) {
	
		hourT = hour;
		minuteT = minute;
		secondT = second;
	}

	
	public String buildString() {
	
		return String.format("%24s: %s%n%24s: %s", 
				"This.toUniversalString()", this.toUniversalString(),
				"toUniversalString()", toUniversalString());
	}

	
	public String toUniversalString() {
		
	
	
	
		return String.format("%02d:%02d:%02d",
				hourT, minuteT, secondT);
	}
}