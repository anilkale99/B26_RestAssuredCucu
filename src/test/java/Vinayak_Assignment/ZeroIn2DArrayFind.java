package Vinayak_Assignment;

public class ZeroIn2DArrayFind {

	public static void main(String[] args) {
		int[][] myarray = {
	            {1, 2, 0, 4, 5},
	            {6, 0, 8, 9, 10},
	            {11, 12, 13, 0, 15},
	            {0, 17, 18, 19, 0} };
		
		 System.out.println("Locations of zeros in the array:");
		 
		
	        
	        //  to find that the zero values on 2d array
		 
	        for (int i = 0; i < myarray.length; i++) { //for  row 
	        	
	            for (int j = 0; j < myarray[i].length; j++) { //  for column iteration
	            	
	                if (myarray[i][j] == 0) {
	                	
	                    System.out.println("Zero found at: Row " + i + ", Column " + j);
	                }
	            }
	        }
	    }
	}
	            

	


