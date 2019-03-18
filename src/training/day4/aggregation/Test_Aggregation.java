package training.day4.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Test_Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student();
		student1.setFirstName("Ravi");
		student1.setLastname("Raj");
		student1.setEmailAddress("raviraj636@gmail.com");
		
		Student student2 = new Student();
		
		student2.setFirstName("Charan");
		student2.setLastname("Raj");
		student2.setEmailAddress("charanraj636@gmail.com");
		
		
		Student student3 = new Student();
		
		student3.setFirstName("Bhuvan");
		student3.setLastname("Raj");
		student3.setEmailAddress("bhuvanraj636@gmail.com");
		
		Student student4 = new Student();
		student4.setFirstName("Pavan");
		student4.setLastname("Raj");
		student4.setEmailAddress("pavanraj636@gmail.com");
		
		List  <Student> cscStudents = new ArrayList <>();
		cscStudents.add(student1);
		cscStudents.add(student2);
		
		List  <Student> eceStudents = new ArrayList <>();
		eceStudents.add(student3);
		eceStudents.add(student4);
		
		
		Department department1 = new Department();
		department1.setDepartment("CSC");
		department1.setStudents(cscStudents);
		
		Department department2 = new Department();
		department2.setDepartment("ECE");
		department2.setStudents(eceStudents);
		
		List <Department> departments = new ArrayList<> ();
		departments.add(department1);
		departments.add(department2);
		
		College college = new College ();
		college.setName("Narayana Engineering College");
		college.setDeskNumber("080-44332200");
		college.setDepartments(departments);
		

	}

}
