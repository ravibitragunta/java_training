package training.day2;

import java.util.HashMap;
import java.util.Map;

public class Tables_In_Java {
	
	public static void main (String[] args) {
		
		Map <String, String> customTable = new HashMap <> ();
	
		customTable.put("student1", "Ramesh");
		customTable.put("student2", "Rajesh");
		customTable.put("student3", "Raveesh");
		customTable.put("student4", "Dhivesh");
		
		for (String key : customTable.keySet()) {
			System.out.println("Key -->" + key + " Value -->" + customTable.get(key));
		}
		
	}

}
