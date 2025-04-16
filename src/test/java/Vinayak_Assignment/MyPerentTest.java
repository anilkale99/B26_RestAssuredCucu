package Vinayak_Assignment;

import MyInharatance.MyPerentChild;

public class MyPerentTest {

	public static void main(String[] args) {
		
		MyPerent Perent = new MyPerent();
		Perent.method1();
		System.out.println(Perent.i);
		
		MyPerentChild  Child  = new MyPerentChild();
		Child.method3();
		Child.method2();
		Child.method1();
		
		

	}
}

