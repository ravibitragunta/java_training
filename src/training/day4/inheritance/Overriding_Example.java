package training.day4.inheritance;

class Dog {
	public void bark(){
        System.out.println("woof ");
    }
	
	public void bark(int num){
    	for(int i=0; i<num; i++)
    		System.out.println("woof ");
    }
}

class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}

public class Overriding_Example {

	public static void main(String[] args) {
		Dog dog = new Hound();
		dog.bark();

	}

}
