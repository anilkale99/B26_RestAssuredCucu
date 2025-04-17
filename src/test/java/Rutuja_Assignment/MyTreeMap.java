package Rutuja_Assignment;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {

	public static void main(String[] args) {
		TreeMap<String, String> set = new TreeMap<String, String>();
		set.put("ABC", "Rutuja");
		set.put("CDE" ,"Vinayak");
		set.put("EFG", "Prasad");
		set.put("GHI", "Mahesh");
		set.put("IJK", "Ajay");
		set.put("KLM" , "Rutuja");
		
		for(Map.Entry<String, String> getValues:set.entrySet())
		{
			System.out.println(getValues.getKey() + " : " + getValues.getValue());
		}
		
	}

}
