package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumberInInt {

	public static void main(String[] args) {
		int[] originalArray = {1, 3, 10, 4, 5, 8, 6};
		Arrays.sort(originalArray);
		for(int each: originalArray) {
			System.out.println(each);
		}
		
//		List<Integer> list = new ArrayList<Integer>();
//		for(int each: originalArray) {
//			list.add(each);
//		}
//		Set<Integer> set = new HashSet<Integer>();
//		set.addAll(list);
		
		Set<Integer> set = new HashSet<Integer>();
		for(int each: originalArray) {
			set.add(each);
		}
		
		int total = set.size();
		
		for(Integer i=1; i<=10; i++) {
			set.add(i);
			if(set.size()!=total) {
				System.out.println("Missing number is "+i);
				total = total+1;
			}
		}

	}

}
