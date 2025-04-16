package Vinayak_Assignment;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Mahesh");
		myArrayList.add("Vinayak");
		myArrayList.add("Ajay");
		myArrayList.add("Rutuja");
		myArrayList.add("Akshay");
		myArrayList.add("Onkar");
		myArrayList.add("Manish");
		myArrayList.add("Sumit");
		myArrayList.add("Aarti");
		myArrayList.add("Jyoti");
		
		
		ArrayList<String> myArrayList1 = new ArrayList<String>();
		myArrayList1.add("Aniket");
		myArrayList1.add("Ajay");
		myArrayList1.add("Aarti");
	
		boolean allExits = myArrayList.containsAll(myArrayList1);
		System.out.println("All names from myArrayList1 are present in myArrayList." + allExits );
		System.out.println("===============");
		
		myArrayList1.removeAll(myArrayList);
		System.out.println("elments which are in myArrayList "+ myArrayList);
		System.out.println("===============");
		System.out.println("elments of updated myArrayList1 " +myArrayList1);
		System.out.println("===============");
		
		boolean checkall =  myArrayList.contains("Onkar");
		System.out.println("is onkar present in myArrayList "+ checkall);
	}
		
	}

	

