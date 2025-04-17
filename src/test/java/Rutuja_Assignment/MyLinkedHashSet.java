package Rutuja_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Rutuja");
		set.add("Vinayak");
		set.add("Prasad");
		set.add("Mahesh");
		set.add("Ajay");
		set.add("Rutuja");
	
		
		System.out.println("Elements of LinledHashSet " + set);
		
	}

}
