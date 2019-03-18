package training.day4.aggregation;

class Person {
	boolean sleeping; // State or attribute
	String name;
	
	public void setSleeping (boolean sleeping) {
		this.sleeping = sleeping;
	}
	
	public boolean getSleeping () {
		return this.sleeping;
	}
	
	public void wakeHimUp (int decibles) {
		
		if (decibles > 20) {
			System.out.println("It's noisey, cant sleep here!!");
			this.setSleeping(false);
		} else {
			System.out.println("It's within bearable range!!");
		}
	}
	
}

public class Class_Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setSleeping(true);
		person.wakeHimUp(45);
		System.out.println (person.getSleeping());

	}

}
