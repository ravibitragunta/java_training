package training.day3;

public class ArithmaticOperators_Example {
	
	public static int multiplyNumbers (int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divideNumbers (int num1, int num2) {
		return num1 / num2;
	}
	
	public static int getRemainder (int num1, int num2) {
		return num1 % num2;
	}
	
	public static int addNumbers (int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtractNumbers (int num1, int num2) {
		return num1 - num2;
	}
	

	public static void main(String[] args) {
		
		System.out.println(multiplyNumbers (4, 5));
		System.out.println(divideNumbers (5, 5));
		System.out.println(getRemainder (6, 5));
		System.out.println(addNumbers (3, 5));
		System.out.println(subtractNumbers (8, 5));
		
		
	}

}
