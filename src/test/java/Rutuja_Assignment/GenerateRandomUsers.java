package Rutuja_Assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;


public class GenerateRandomUsers {

	public static void main(String[] args) throws IOException {
		 JSONArray usersArray = new JSONArray();

	        for (int i = 1; i <= 100; i++) {
	            JSONObject user = new JSONObject();
	            user.put("name", "AK_" + i);
	            user.put("Job", "AK_QA_"+i);
	            user.put("Mobile","+91 "+i+ i+222);
	            user.put("email", "AKStudent_" + i + "@mail.com");
	            user.put("Location", "Pune_" + i+2);
	            usersArray.put(user);
	        }

	        	FileWriter file = new FileWriter("UserDetails.json");	        
	            file.write(usersArray.toString(2));
	            System.out.println("JSON file created successfully");
	       
	    }
}
