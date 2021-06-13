package stringPractice;

public class WhyImmutable {
	
//	Java uses the concept of String literals. Suppose if there are 5 reference variables and all of them are pointing to One object.
//	if we change/modify the object using one reference variable, then it will affect all other reference variable.
//	Thats why String is immutable in Java.
	
//	In this below example, Object "Sathya" is stored in String Constant Pool only once.
//	All the reference variables such as str1, str2,...str6 will be pointing out to same and only one "Sathya" object
//	When str1 is modified, in that case, instead of changing "Sathya" object, a new object is created and str1 will be pointed out to it.
//	So that, other refernce variables str2, str3, ... will use original "Sathya" Object
	

	public static void main(String[] args) {

		String str1 = "Sathya";
		String str2 = "Sathya";
		String str3 = "Sathya";
		String str4 = "Sathya";
		String str5 = new String("Sathya");
		String str6 = new String(str1);
		
		
		str1 = str1.concat("moorthi");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str5);
		System.out.println(str6);
		
	}
}

