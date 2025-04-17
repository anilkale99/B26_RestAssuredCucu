package Rutuja_Assignment;

import java.util.ArrayList;
public class StringAssign {

	public static void main(String[] args) {
		{

			String detail = "FName=Rutuja|LName=Kalwari|Address=Pune|Age=28|School=Private|Occupation=Job|FName=Shree";

			String[] str = detail.split("[= |]");
			 ArrayList<String> list = new ArrayList<String>();
			 for(String words : str)
			 {
			 list.add(words);
			 }

			for(int i=0, j=1; i<str.length-1; i+=2, j+=2)
			{
			System.out.println(str[i] + " : "+ str[j]);
			}
			}		
	}
}
