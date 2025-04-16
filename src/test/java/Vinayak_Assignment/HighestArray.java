package Vinayak_Assignment;

public class HighestArray {

	public static void main(String[] args) {
		
		//define an array
	int myarray [] =  {9, 19, 29, 39, 49 };
	
	 // consider first element is the maximum number
		
		int max = myarray[0];
		
		 // check the array to find the maximum element number
		
		for (int num : myarray) { 
			
			if (num > max) {
           max = num;
        }
	}
		 System.out.println("The highest element in the array is: " + max);
		
	}
	
}



//breakdown for for (int num : myarray)
		//int num → Declares a variable num that will store each element of the array during iteration.
		//: (colon) → Separates the loop variable (num) from the array (myarray). It means "for each element in".
		//numbers → The array being iterated over.
