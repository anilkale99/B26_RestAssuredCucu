package Vinayak_Assignment;

public class SmallestArray {

	public static void main(String[] args) {
		
		//Define an array
int myarray [] =  {9, 19, 29, 39, 49 };


//consider first element is the smallest
		
		int smallest = myarray[0];
		
		 // check the array to find the smallest element
		
		for (int num : myarray) {
			
			if (num < smallest) {
				smallest = num;
        }
	}
		 System.out.println("The smallest element in the array is: " + smallest);
		
	}
	
}
	


