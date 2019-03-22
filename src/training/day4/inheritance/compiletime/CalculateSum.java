package training.day4.inheritance.compiletime;

public class CalculateSum {

	public static void main(String[] args) {
		Summation summation = new Summation();
		System.out.println(summation.sum(4, 6));
		
		System.out.println(summation.sum(10, 1,1));
		


	}

}
