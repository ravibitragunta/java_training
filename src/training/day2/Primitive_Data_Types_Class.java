package training.day2;

public class Primitive_Data_Types_Class {
	private int i;
	private double d;
	
	
	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}
	
	public int getMultiplesOfI (int multiplier) {
		return multiplier * this.getI();
	}



	public double getD() {
		return d;
	}



	public void setD(double d) {
		this.d = d;
	}



	public static void main (String[] args) {
		
		Primitive_Data_Types_Class classVariable = new Primitive_Data_Types_Class();
		classVariable.setI(300);
		classVariable.setD(432.32d);
		
		System.out.println("Int Value is -->" + classVariable.getI());
		System.out.println("Double Value is -->" + classVariable.getD());
		
		Primitive_Data_Types_Class anotherClassVariable = new Primitive_Data_Types_Class();
		anotherClassVariable.setI(400);
		anotherClassVariable.setD(645.32d);
		
		
	}

}
