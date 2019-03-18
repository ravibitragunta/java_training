package training.day4.association;

public class TestAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person();
		person.setLastName("Ravi");
		person.setFirstName("Ravi");
		
		Bank bank = new Bank ();
		bank.setBankName("HDFC");
		bank.setBranchCode("MG Road Branch");
		bank.setIfscCode("A000456");
		
		person.setBankDetails(bank);

	}

}
