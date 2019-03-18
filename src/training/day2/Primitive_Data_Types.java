package training.day2;

/*
 * Sample Class that's trying to show method level variables
 * */

public class Primitive_Data_Types {

	public static void main(String[] args) {
		
		int numberOfMangoes = 1; // Declaration & Initialization
		numberOfMangoes = 100;
		System.out.println("The value in the variable storesIntegerValue is "
				+ "-->" + numberOfMangoes) ;
		char canStoreOnlyOneCharacter = 'a';
		
		char[] myName = new char[] {'r', 'a', 'v', 'i'};
		
		
		
		boolean enoughBalance = false;
		boolean bool = true;
		byte a = '1';
		short sMax = 32767; 
		short sMin = -32768;
		long l = 1000000l;
		float f = 3.25465456689f; // can be used to represent the precision to 7 places
		double d = 2.22222222222222d; // cab be used to represent the precision to 15 places
		System.out.println("double value ->" + d);
		System.out.println("float value ->" + f);
		
		// this is single line comment
		
		/* this is a multi line comment
		 * continuing from the previous line
		 * 
		 * */
		
		
		if (enoughBalance) {
			System.out.println("Allow Withdraw");
			// Execute Some API
		} else {
			System.out.println("Your Blance Criteria isn't met, Please contant "
					+ "Your Branch for further info");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		l = 60l;
		
		

	}

}
