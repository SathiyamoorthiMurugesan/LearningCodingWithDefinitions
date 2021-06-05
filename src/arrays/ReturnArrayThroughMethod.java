package arrays;

public class ReturnArrayThroughMethod {
	
	public static String[] thisMethodReturnsArray() {
		String name[] = {"abc", "bcd", "cde", "def"};
		
		return name;
	}

	public static void main(String[] args) {
		String getArray[] = thisMethodReturnsArray();
		
		for(String eachName: getArray) {
			System.out.println(eachName);
		}

	}

}
