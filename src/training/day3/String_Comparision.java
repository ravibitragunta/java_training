package training.day3;

public class String_Comparision {
	
	public static void main (String ... args) {
		
		String myName = "Ravi"; // One way
		String myNameOneMore = "Ravi";
		
		// This sits in a different location of memory
		
		// myName --> A --> B
		// myNameOneMore --> E --> B
		// myNameAgain --> C --> D
		
		// myName -> Pointing to memory Location --> Will point to another location 
		String myNameAgain = new String ("ravi"); // Method 2
		// This sits somewhere else. Creates new object
			
		if (myName == myNameAgain) {
			System.out.println("reference -->Both names are same");
		} else {
			System.out.println("reference -->Both names are not the same");
		}
		
		
		if (myName.equalsIgnoreCase(myNameAgain)) {
			System.out.println("equals -->Both names are same");
		} else {
			System.out.println("equals -->Both names are not the same");
		}
		
		
		
	}

}
