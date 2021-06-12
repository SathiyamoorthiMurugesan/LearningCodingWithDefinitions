package arrays;

import java.util.Scanner;

public class ArrayInitAndIteration {
	
	public void simpleArray() {
		int array[] = {1,2,3,4,5};
		
		for(int each:array) 
		{
			System.out.println(each);
		}
		
	}
	
	public void createArrayWithUserInput() {
		
		int a[] = new int[4];
		Scanner scan = new Scanner(System.in);
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter "+a.length+" values: ");
			a[i] = scan.nextInt();
		}
		
		for(int each:a) {
			System.out.println(each);
		}
	}
		

	public static void main(String[] args) {
		ArrayInitAndIteration arrayObj = new ArrayInitAndIteration();
			
			arrayObj.simpleArray();
			arrayObj.createArrayWithUserInput();
		
		
		
	
		
	}

}
