package training.day2;

enum Week_Days_in_Week {
	Monday, 
	Tuesday, 
	Wednesday, 
	Thursday, 
	Friday, 
	Saturday, 
	Sunday 
}


public class Enum_In_Java {
	
	static Week_Days_in_Week weekDay = Week_Days_in_Week.Friday;
	
	public static void main (String[] args) {
		switch (weekDay) {
			case Monday: System.out.println("Monday Blues"); break;
			case Tuesday: System.out.println("Still 4 more days"); break;
			case Wednesday: System.out.println("Boring Day"); break;
			case Thursday: System.out.println("2 more Days"); break;
			case Friday: System.out.println("TGIF"); break;
			default: System.out.println("Weekends, yuppie!!"); break;
		}
	}
}
