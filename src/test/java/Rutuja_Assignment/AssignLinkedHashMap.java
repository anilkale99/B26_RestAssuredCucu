package Rutuja_Assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class AssignLinkedHashMap {

	public static void main(String[] args) {


		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1, "Rutuja");
		linkedHashMap.put(2, "Radha");
		linkedHashMap.put(3, "Prasad");
		linkedHashMap.put(4, "Ajay");
		linkedHashMap.put(4, "Mahesh");
		linkedHashMap.put(3, "Vinayak");
		
	for(Map.Entry<Integer, String> linkHashData : linkedHashMap.entrySet()){
		System.out.println(linkHashData);
	}
	System.out.println("=================================");
	
	linkedHashMap.remove(2, "Radha");
	System.out.println(linkedHashMap);
	
	
	
	}

}
