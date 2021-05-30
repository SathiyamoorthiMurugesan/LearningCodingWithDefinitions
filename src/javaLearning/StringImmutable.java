package javaLearning;

public class StringImmutable {
	/*
	* Strings in Java are immuatable which means unchangable or un modifiable
	* Strings in Java are final
	* When String Object is created, String value is stored in SCP.
	* If we change the value of the object, String object will still point to old String value
	* But the new string value is still created in SCP but no object is pointing towards it
	* If we try to explicitly change the String value, then String object will point to the new value 
	but the old value will be still there at SCP
	
	*/
	public static void main(String[] args) {
		String str = "Sathiya";
		str.concat("moorthi");
		System.out.println(str);
		
		str = str.concat("moorthi");
		System.out.println("Explicitly changed string: "+str);
	}

}
