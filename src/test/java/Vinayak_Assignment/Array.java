package Vinayak_Assignment;

public class Array {
	

public static void main(String[] args) {
		
		
		int myArry[][] = {   {1,2,3} ,
				             {4,5,6} ,
				             {7,8,9} };
		for (int  i = 0 ; i< myArry.length; i++ ) {
			
			for (int j = 0; j < myArry.length; j++) {
				
				System.out.print(myArry[i][j]);
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
	}


}
