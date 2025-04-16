package Vinayak_Assignment;

public class SplitString {
	public static void main(String[] args) {
        String input = "FName=Isaac|LName=Newton|Address=UK|Age= |School=Trinity|Invention=LawsOfMotion";

        String[] pairs = input.split("\\|"); // Split the string by '|'

        for (String pair : pairs) {  // Loop through each key=value pair
          
            String[] keyValue = pair.split("=", 2);  // Split each pair by '='  Limit to 2 parts only

          
            if (keyValue.length == 2) {
                System.out.println(keyValue[0] + " : " + keyValue[1].trim());
            } else {
                System.out.println(keyValue[0] + " : ");
            }
        }
    }

}
///We loop through each element in the array pairs. Each element looks like "FName=Isaac".

//For each pair, we split it by the = character to separate the key from the value: