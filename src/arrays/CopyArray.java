package arrays;

import java.util.Arrays;

public class CopyArray {
	
	//When we want to copy specific set of elements then we can use the below method.
	
	public void copyArrayUsingSystemCLassMethod() {
		String name[] = {"abc", "bcd", "cde", "def"};
		
		String CopyTo1[] = new String[4];
		String CopyTo2[] = new String[4];
		String CopyTo3[] = new String[4];
		String CopyTo4[] = new String[4];
		
		
		System.arraycopy(name, 0, CopyTo1, 0, 2);
		System.arraycopy(name, 0, CopyTo2, 0, 4);
		System.arraycopy(name, 2, CopyTo3, 0, 2);
		System.arraycopy(name, 0, CopyTo4, 2, 2);
		
		System.out.println("********* First Copied Array *********");
		for(String eachName: CopyTo1) {
			System.out.println(eachName);
		}
		
		System.out.println("********* Second Copied Array *********");
		for(String eachName: CopyTo2) {
			System.out.println(eachName);
		}
		
		System.out.println("********* 3rd Copied Array *********");
		for(String eachName: CopyTo3) {
			System.out.println(eachName);
		}
		
		System.out.println("********* 4th Copied Array *********");
		for(String eachName: CopyTo4) {
			System.out.println(eachName);
		}

	}
	
	// Copying array using for loop
	
	public void copyArrayUsingForLoop() {
		String name[] = {"abc", "bcd", "cde", "def"};
		
		String newArray[] = new String[name.length];
		
		for(int i=0;i<name.length;i++) {
			newArray[i] = name[i];
		}
		
		for(String eachString: newArray) {
			System.out.println(eachString);
		}
		
	}
	
	public void arrayCopyUsingCopyOfMethod() {
		String name[] = {"abc", "bcd", "cde", "def"};
		
		String newArray[] = Arrays.copyOf(name, 2);
		
		for(String eachString: newArray) {
			System.out.println(eachString);
		}
	}

	public static void main(String[] args) {
		CopyArray copyArray = new CopyArray() ;
//			copyArray.copyArrayUsingForLoop();
//			copyArray.copyArrayUsingSystemCLassMethod();
			copyArray.arrayCopyUsingCopyOfMethod();
			}

}
