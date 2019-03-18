package training.day4.inheritance;

public class Test_inhertance {

	public static void main(String[] args) {
		
		Person person = new Voter ("Ravi", 
				"Raj", 
				"Male", 
				"Bangalore", 
				"AQDPBasa", 
				22, 
				"asasa",
				"asda", 
				"24-May-2014", 
				true);
		
		person.changeState("Rajasthan");
		
		Person employee = new Employee ("Employee", "Bangalore", 20);
		employee.changeState("West Bengal");

	}

}
