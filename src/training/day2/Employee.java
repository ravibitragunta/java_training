package training.day2;

public class Employee {
	String ssn;
	int employeeId;
	float salary;
	String employeeName;
	
	/*String address1;
	String address2;
	String phone1;
	String phone2;
	String zipcode;*/
	
	Address employeeAddress;
	
	
	
	public void setEmployeeId (int employeeId) {
		this.employeeId = employeeId;
	}
	
	public float getSalary () {
		return this.salary;
	}
	
	public void incremtntSalary (int percent) {
		float computedSalary = this.salary + this.getSalary() * percent/100;;
		this.salary = computedSalary;
	}
	
	public void setSalary (float salary) {
		this.salary = salary;
	}
	
	public void setEmployeeName (String employeeName) {
		this.employeeName = employeeName;
	}
	
	public static void main(String[] args) {
		
		Employee ravi = new Employee();
		ravi.setEmployeeName("Ravi Chandra Raj B");
		ravi.setEmployeeId(100);
		ravi.setSalary(3000);
		
		ravi.incremtntSalary(10);
		
		Employee chandra = new Employee();
		chandra.setEmployeeId(200);
		chandra.setEmployeeName("Chandra");
		chandra.setSalary(5000);
		
		
	

	}

}
