package arrays;

import java.util.Arrays;

public class SortAnArray {
	int numbers[] = {54, 4, 99, -1};
	
	public void sortArrayUsingSortMethod() {
		
		Arrays.sort(numbers);
		
		for(int each:numbers) {
			System.out.println(each);
		}
		
//		for(int i=0; i<numbers.length;i++) {
//			System.out.println(numbers[i]);
//		}
	}
	
	public void sortArrayWithoutUsingPredefinedMethods() {
		int temp = 0; 
		for(int i=0; i<numbers.length;i++) {
			for(int j=i+1; j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		SortAnArray SA = new SortAnArray();
		SA.sortArrayUsingSortMethod();
//		SA.sortArrayWithoutUsingPredefinedMethods();
	}
		

}

