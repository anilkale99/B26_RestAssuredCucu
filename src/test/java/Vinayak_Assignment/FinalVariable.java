package Vinayak_Assignment;

public class FinalVariable {
	public static void main(String[] args) {
        final int MAX_COUNT = 10;  // final variable final = meaning its value cannot be changed once assigned.

        System.out.println("The value of MAX_COUNT is: " + MAX_COUNT);

        
         //MAX_COUNT = 20;  //When you uncomment this line, you are trying to reassign a new value (20) to
          //a final variable (MAX_COUNT), which is not allowed in Java.
        // Error: cannot assign a value to final variable
       // Because final makes the variable a constant—it’s like telling Java:
      //This value should never change during the execution of the program.
    }
}

