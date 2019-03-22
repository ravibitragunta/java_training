package training.day4.inheritance.interfaces;

public interface StudentContract {
	
	void enroll(long studentid);
	
	void notify (long studentId, String notificationEvent);
	
	void prepareDissertation (long studentId);
	
}
