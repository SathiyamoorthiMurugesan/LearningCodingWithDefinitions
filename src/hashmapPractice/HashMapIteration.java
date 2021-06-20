package hashmapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(2, "Tamil");
		map.put(1, "Sathya");
		map.put(3, "Dinesh");

		System.out.println(map);
System.out.println("*****************************************************************************************");
System.out.println("Iterating using map.entrySet()");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		
System.out.println("*****************************************************************************************");
System.out.println("Iterating using iterator");
		Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
System.out.println("*****************************************************************************************");
System.out.println("Iterating only key using keySet()");
		
		for(Integer key:map.keySet()) {
			System.out.println(key);
		}
System.out.println("*****************************************************************************************");
System.out.println("Iterating only value using value()");		
		for(String value:map.values()) {
			System.out.println(value);
		}
		
		
	}

}
