package Vinayak_Assignment;

public class SecondHigestArray {

	public static void main(String[] args) {
		
		//Define an array
		
		int myarray [] =  {10, 45, 78, 23, 89, 91, 67};
		
		
		// Initialize highest and second highest number
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int num : myarray) {
            if (num > highest) {
                secondHighest = highest; // Update second highest before changing highest
                highest = num; // Update highest
            } else if (num > secondHighest && num != highest) {
                secondHighest = num; // Update second highest if new number is smaller than highest
            }
        }
        
        // Print the second highest element
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest element found.");
        } else {
            System.out.println("The second highest element in the array is: " + secondHighest);
		
		
    }
	
	}
}


