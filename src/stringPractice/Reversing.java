package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reversing {

	public static void main(String[] args) {
//		reverseUsingCharArray("Sathya");
//		reverseUsingArrayList("Sathiyamoorthi");
		reverseUsingBuilder("Sathya");
		reverseUsingBuffer("Sathiyamoorthi");
		
	}
	
	public static void reverseUsingCharArray(String str) {
		char[] charArray = str.toCharArray();
	String temp ="";
		for(int i=charArray.length-1;i>=0;i--) {
			temp = temp+charArray[i];
		}
		System.out.println(temp);
	}
	
	public static void reverseUsingArrayList(String str) {
		char[] charArray = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
			for(char each: charArray) {
				list.add(each);
			}
			Collections.reverse(list);
			for(Character ch: list) {
				System.out.print(ch);
			}
	}
	
	public static void reverseUsingBuilder(String str) {
		StringBuilder builder = new StringBuilder(str);
//		builder.append(str);
		builder.reverse();
		System.out.println(builder);
	}
	
	public static void reverseUsingBuffer(String str) {
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		System.out.println(buffer);
	}

}
