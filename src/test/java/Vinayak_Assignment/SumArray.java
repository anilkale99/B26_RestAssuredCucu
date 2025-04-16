package Vinayak_Assignment;

public class SumArray {
	
	
	public static int length;

	public static void main(String[] args) {
		
		
		//define the array
		
		int myarray [] =  {100, 200, 300, 400, 500 };
		
		//store the value of sum
		int sum =0;
		
		//add  element to sum
		
		for (int num : myarray) {
            sum += num;
        }
		
		 System.out.println("The sum of all elements in the array is: " + sum);
	
	
	}
}
		
	
	
	
