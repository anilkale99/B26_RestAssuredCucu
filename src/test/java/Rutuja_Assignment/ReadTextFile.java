package Rutuja_Assignment;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class ReadTextFile {

	public static void main(String[] args) {
		
		String filePath = "src\\test\\java\\Rutuja_Assignment\\ExceptionHandling.txt";  // File path (double backslashes!)
        String content = "Exception Handling\r\n"
        		+ "- Exception is nothing but an abnormal condition\r\n"
        		+ "- There are classes made/created by Java itself.";
        
        try {
            	File file = new File(filePath);

            	// Create file if it doesn't exist
            	if (file.createNewFile()) 
            	{
            		System.out.println("File created: " + file.getAbsolutePath());
            	} else 
            	{
            		System.out.println("File already exists. Writing to it...");
            	}
        
            	FileWriter writer = new FileWriter(file);
            	writer.write(content);
            	writer.close();

            		System.out.println("Content written successfully.");
        		} 		
        	catch (IOException e) 
        	{
        		System.out.println("An error occurred.");
        		e.printStackTrace();
    }
	}
}
		
	
	

