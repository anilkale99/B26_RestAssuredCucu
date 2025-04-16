package Vinayak_Assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Random16DigitStringFile {
	
	 public static void main(String[] args) {
	        
	        String characters = "qawsedrftgyhujik";
	        StringBuilder randomString = new StringBuilder();
	        Random random = new Random();

	        //  16-character random string
	        for (int i = 0; i < 16; i++) {
	            int index = random.nextInt(characters.length());
	            randomString.append(characters.charAt(index));
	        }

	        String generated = randomString.toString();
	        System.out.println("Generated String: " + generated);

	        // Save  to a .txt file under src folder
	        try {
	            FileWriter writer = new FileWriter("C:\\Users\\ONKAR\\eclipse-workspace\\src\\16 Digit String"); 
	            writer.write(generated);
	            writer.close();
	            System.out.println("Random string saved to src/16 Digit String");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
	    }

}
