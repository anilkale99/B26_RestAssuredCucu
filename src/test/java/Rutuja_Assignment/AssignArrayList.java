package Rutuja_Assignment;

import java.util.ArrayList;

public class AssignArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mahesh");
		list1.add("Vikrant");
		list1.add("Rajat");
		list1.add("Rutuja");
		list1.add("Archana");
		list1.add("Radha");
		list1.add("Ajay");
		list1.add("Prasad");
		list1.add("Vinayak");
		list1.add("Arohi");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Suyog");
		list2.add("Shreenidhi");
		list2.add("Rutuja");
		
		// Check if all elements of list2 are present in List1
		boolean allExist = list1.containsAll(list2);
		System.out.println("All elements of list2 are present in list1 : " + allExist);
		System.out.println("=================");
		
		//Remove all elments which are there in arralist2, from arrylist1
		list2.removeAll(list1);
		System.out.println("Elements of list1 are "+list1);
		System.out.println("=================");
		System.out.println("Elements of updated list2 are " + list2);
		System.out.println("=================");
		
		//Check that any of given element is present in arraylist1
		boolean checkElt = list1.contains("Radha");
		System.out.println("Radha is present in list1 : " +checkElt);
		

		
		
		
	}

}
