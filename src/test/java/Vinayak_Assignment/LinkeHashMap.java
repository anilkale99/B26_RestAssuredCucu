package Vinayak_Assignment;

import java.util.HashMap;
import java.util.Map.Entry;

public class LinkeHashMap {

	public static void main(String[] args) {
		HashMap<Integer , String> LinkeHashMap = new HashMap<Integer , String>();
		LinkeHashMap.put(1, "Vinayak");
		LinkeHashMap.put(11, "Mahesh");
		LinkeHashMap.put(12, "Rutuja");
		LinkeHashMap.put(13, "Ajay");
		LinkeHashMap.put(14, "prasad");
		
		for(Entry<Integer, String> LinkeHashData : LinkeHashMap.entrySet()) {
			System.out.println(LinkeHashData);
			
		}
		System.out.println("===============");
		LinkeHashMap.remove(11,"Mahesh");
		LinkeHashMap.remove(14,"Prasad");
		System.out.println(LinkeHashMap);
	}
	
}
