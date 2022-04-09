package stringPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TotalAndDuplicateWordsInSentence {

	public static void main(String[] args) {
//		findingTotalNoOfWords();
//		findingDuplicateWords();
		findNoOfDuplicatesInSentence();
	}
	
	public static void findingTotalNoOfWords() {
		String sentence = "Java uses the concept of String literals. Suppose if there are 5 reference variables and all of them are pointing to One object. if we change/modify the object using one reference variable, then it will affect all other reference variable. Thats why String is immutable in Java";
		String[] test = sentence.split(" ");
		System.out.println(test.length);
	}
	
	public static void findingDuplicateWords() {
//		String sentence = "Java uses the concept of String literals. Suppose if there are 5 reference variables and all of them are pointing to One object. if we change/modify the object using one reference variable, then it will affect all other reference variable. Thats why String is immutable in Java";
		String sentence = "hey it hello hello it say boss it";
		sentence.replaceAll(".", "");
		String[] array1 = sentence.split(" ");
		
		int temp = 0;
		
		for(int i=0; i<array1.length; i++) {
			int eachWord = 0;
			for(int j=i+1; j<array1.length; j++) {
				if(array1[i].equalsIgnoreCase(array1[j])) {
//					System.out.println(array1[i]+ " is duplicated");
//					temp++;
					eachWord++;
				}
				
			}
			System.out.println(array1[i]+ " is duplicated "+eachWord+ " times");
		}
		
	}
	
	public static void findNoOfDuplicatesInSentence() {
		String sentence = "hey it hello hello it say boss it";
		sentence.replaceAll(".", "");
		String[] AllWordsInSentence = sentence.split(" ");
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String eachWord: AllWordsInSentence) {
			if(wordCount.containsKey(eachWord)) {
				wordCount.put(eachWord, wordCount.get(eachWord)+1);
			}
			
			else
				wordCount.put(eachWord, 1);
		}
		
		Set<String > wordsInString = wordCount.keySet();
		
		for(String printDuplicateWord: wordsInString) {
			if(wordCount.get(printDuplicateWord)>1) {
				System.out.println(printDuplicateWord+" duplicated "+wordCount.get(printDuplicateWord));
			}
		}
		
		
	}

}
