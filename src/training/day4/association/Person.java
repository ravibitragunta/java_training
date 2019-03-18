package training.day4.association;

public class Person {
	
	private String firstName;
	private String lastName;
	private Bank bankDetails;
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
	public Bank getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(Bank bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	
	

}
