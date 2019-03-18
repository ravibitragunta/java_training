package training.day3;

public class OtherOperators_Impl {
	
	public static void main(String[] args) {
		
		int localVar; // Declaration
		// localVar --> Memory Location --> 32
		localVar = 32; // Assignment
		
		if (localVar == 20) {
			
		}
		
		double bigValue = 1000000000.6665676678;
		
		boolean flag = false;
		
		System.out.println(!flag);
		
		boolean isTodayTuesday = false;
		
		boolean amINotFeelingWeak = false;
		
		if (isTodayTuesday && !amINotFeelingWeak) {
			System.out.println("No Fasting ");
		} 
		else {
			System.out.println("Fasting Today! ");
		}
		
		
		
		System.out.println(++localVar);
		System.out.println(localVar++);
		
		
		System.out.println(--localVar);
		System.out.println(localVar--);
		
		long bigLong = (long) bigValue; // Explicit Conversion
		// Type mismatch: cannot convert from double to long 
		
		double convertedLocalVar = localVar; // Implicity Conversion 
		
		// Cycle is 
		// double <-- float <-- long <-- int <-- short
		
		// Comparision operations
		
		for (int loopVariable = 0; loopVariable <= 4; loopVariable++) {
			System.out.println("Printing the loop Variable ->" + loopVariable);
		}
		
		if (localVar > 45 && bigLong > 100) {
			System.out.println("It's true");
		} else {
			System.out.println("Conditions arent met");
		}
		
		boolean value = localVar > 45? true: false ; 
		
	}

}
