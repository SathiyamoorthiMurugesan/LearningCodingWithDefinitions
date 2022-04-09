package autoBoxing;

public class IntToInteger {

	public static void main(String[] args) {
		
		convertingIntToInteger();

	}

	
	public static void convertingIntToInteger() {
		int a = 20;
		Integer i = a;
		
		System.out.println(i);
		
		Integer test = new Integer(a);
			System.out.println(test);
		
	}
	
	
	
	
}
