package training.day4.inheritance.interfaces;

public class Medical implements StudentContract{

	@Override
	public void enroll(long studentid) {
		System.out.println("In Medical Student Enrolling process");
		
	}

	@Override
	public void notify(long studentId, String notificationEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareDissertation(long studentId) {
		// TODO Auto-generated method stub
		
	}

}
