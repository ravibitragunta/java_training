package training.day4.inheritance.interfaces;

public class Engineer implements StudentContract{

	@Override
	public void enroll(long studentid) {
		System.out.println("Enrolling an engineer");
		
	}

	@Override
	public void notify(long studentId, String notificationEvent) {
		
		
	}

	@Override
	public void prepareDissertation(long studentId) {
		// TODO Auto-generated method stub
		
	}

}
