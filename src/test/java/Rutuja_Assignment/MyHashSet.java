package Rutuja_Assignment;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("Rutuja");
		set.add("Vinayak");
		set.add("Prasad");
		set.add("Mahesh");
		set.add("Ajay");
		set.add("Rutuja");
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Suyog");
		set1.add("Shreenidhi");
		set1.add("Anu");
		
		System.out.println("Element of HashSet : " + set);
		System.out.println("Combine set and set1 : " + set.containsAll(set1));
		System.out.println("Combine set and set1 : " + set.addAll(set1));
		
		
		
		

	}

}
