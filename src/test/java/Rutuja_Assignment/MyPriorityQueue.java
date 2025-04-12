package Rutuja_Assignment;

import java.util.PriorityQueue;

public class MyPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> obj = new PriorityQueue<String>();
		obj.add("Rutuja");
		obj.add("Vinayak");
		obj.add("Prasad");
		obj.add("Mahesh");
		obj.add("Ajay");
		obj.add("Rutuja");
		
		System.out.println("Elements are : "+obj);
		
		obj.remove("Rutuja");
		System.out.println("Elements are : "+obj);
		
		

	}

}
