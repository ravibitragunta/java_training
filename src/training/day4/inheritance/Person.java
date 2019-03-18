package training.day4.inheritance;

public abstract class Person { // owned by consensus department
	private String firstName;
	private String lastName;
	private String personType;
	private String city;
	private String state;
	private String aadhaarNumber;
	private int age;
	
	public void changeCity (String newCity) {
		this.city = newCity;
	}
	
	public void changeState (String newState) {
		this.state = newState;
		// Business Logic related to other departments
		updateStateChangeRules(newState);
	}
	
	public abstract void updateStateChangeRules(String toState);
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonType() {
		return personType;
	}
	public void setPersonType(String personType) {
		this.personType = personType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAadhaarNumber() {
		return aadhaarNumber;
	}
	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	public Person(String firstName, String lastName, String personType, String city, String aadhaarNumber, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.personType = personType;
		this.city = city;
		this.aadhaarNumber = aadhaarNumber;
		this.age = age;
	}
	
	public Person (String personType, String city, int age) {
		this.personType = personType;
		this.city = city;
		this.age = age;
	}
	
	public Person () {
		
	}
	
	

}
