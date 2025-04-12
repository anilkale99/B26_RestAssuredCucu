package Rutuja_Assignment;

import java.util.LinkedList;

public class AssignLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Rutuja");
		linkedList.add("Vikrant");
		linkedList.add("Mahesh");
		linkedList.add("Rutuja");
		linkedList.add("Archana");
		linkedList.add("Radha");
		linkedList.add("Ajay");
		linkedList.add("Rutuja");
		
		System.out.println("Elements of LinkedList are : " + linkedList);
		
		System.out.println("First Element is : " +linkedList.peekFirst());
	}

}
