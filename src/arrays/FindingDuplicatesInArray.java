package arrays;

public class FindingDuplicatesInArray {

	public static void main(String[] args) {
		int[] originalArray = {1, 3, 5, 8, 8, 5, 7, 1};
		
		int temp = 0;
		
		for(int i=0; i<originalArray.length-1; i++) {
			for(int j=i+1; j<originalArray.length; j++) {
				if(originalArray[i]==originalArray[j]) {
					System.out.println(originalArray[i]+ " is duplicated");
					temp++;
				}
				
			}
		}
		System.out.println("we have "+temp+ " numbers duplicated");
	}

}
