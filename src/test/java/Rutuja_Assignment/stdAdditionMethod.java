package Rutuja_Assignment;

public class stdAdditionMethod {


		    public static double add(Number a, Number b) {
		        return a.doubleValue() + b.doubleValue();
		    }

		    public static void main(String[] args) {
		    	
		        System.out.println("Add int: " + add(5, 10));   
		        System.out.println("Add float: " + add(5.5, 4.5));      
		        System.out.println("Add double: " + add(2.2, 3.3));         
		        System.out.println("Add mixed (int + float): " + add(3, 2.5)); 
		        
		    }

	
	

}
