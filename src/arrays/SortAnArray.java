package arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int numbers[] = {54, 4, 99, -1};
		
		int sortedArray[] = null;
		int i;
		int j;
		for(i=0; i<numbers.length; i++) {
			for(j=i+1;j<numbers.length;j++) {
				if(numbers[i]<numbers[j]) {
					numbers[j] = numbers[i];
				}
				else {
					sortedArray[j] = numbers[i];
				}
			}
			
			
		}
		
	}

}
