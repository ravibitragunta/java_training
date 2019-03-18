package training.day4.aggregation;

import java.util.List;

public class College {
	private String name;
	private String deskNumber;
	private List <Department> departments;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeskNumber() {
		return deskNumber;
	}
	public void setDeskNumber(String deskNumber) {
		this.deskNumber = deskNumber;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	
	

}
