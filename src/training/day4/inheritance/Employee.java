package training.day4.inheritance;

public class Employee extends Person {

	public Employee (String personType, String city, int age) {
		super (personType, city, age);
	}
	
	@Override
	public void updateStateChangeRules(String newState) {
		// 
		System.out.println("Employee -> updating tax rules here");

	}

}
