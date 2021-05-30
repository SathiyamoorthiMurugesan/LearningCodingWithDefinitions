package javaLearning;

public class StringCreation {
	/*
What is it? 
		* In general String is sequence of characters. 
		* But in java, String is an object that represents sequence of characters.
		* String implents charSequence interface
		
Why do we need String
		* Memory efficiant. When we change a String object value, old value is cleared by carbage collector
		* Security - Strings are final and can not be changable/immutable
		
How do we create String
	* There are two ways to create Strings
		* String literals
		* Using new key word
	* String object values are Stored in "String Constant Pool" section of Heap Memory
	* In General when objects are created, varible and methods in the class object is copied to heap memory
	*/
	public void StringInit() { 
	String str = "Sathya";
	String strObj= new String("Sathiyamoorthi");
//	System.out.println(str);
	System.out.println(strObj);
	
//	Assinging value of str to str2
//	Chaning the value of str1 object
	
	String str2 = str;
	
	str = "SathyaNew";
	System.out.println(str);
	System.out.println(str2);
	
	String str3 = "Sathiya";
	String str4 = "Moorthi";
	String str5 = str3+str4;
	System.out.println(str5);
	
	}
	

public static void main(String[] args) {
	StringCreation strClassObj = new StringCreation();
	strClassObj.StringInit();
	
}
}

