package Vinayak_Assignment;

public class IfElseRto {
	
	
	
	public static void main(String[] args) {
		int age = 60;
		 
		 if (age < 16) {
			 
			 System.out.println("Make an effort once you have turned eighteen. " + age);
			 
			 }
		 else if  (age >= 16 && age < 18)
		 {
			  System.out.println("You are eligible for a license for only non-gear bikes at age " + age);
		     }
		 else if  (age >= 18 && age <= 58 )
		 {
			  
			 System.out.println("You are eligible for a license at age " + age);
		     }
		 else 
			
			 System.out.println("You are eligible for a license, but consider renewal policies at age " + age);
	}

	
		
	}

	

	
		
