package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingNumberInInteger {

	public static void main(String[] args) {
		Integer[] originalArray = {1, 3, 10, 4, 5, 8, 6};
		Arrays.sort(originalArray);
		for(Integer each: originalArray) {
			System.out.println(each);
		}
		
		List<Integer> list = Arrays.asList(originalArray);
		
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		
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
