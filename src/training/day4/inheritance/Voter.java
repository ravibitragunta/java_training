package training.day4.inheritance;

public class Voter extends Person {
	private String voterId;
	private String boothId;
	private String lastVoted;
	private String electionType; 
	private boolean canVote;
	
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voter(String firstName, String lastName, String personType, String city, String aadhaarNumber, int age,
			String voterId, String boothId, String lastVoted, boolean canVote) {
		super(firstName, lastName, personType, city, aadhaarNumber, age);
		this.voterId = voterId;
		this.boothId = boothId;
		this.lastVoted = lastVoted;
		this.canVote = canVote;
		
	}
	public boolean isCanVote() {
		return canVote;
	}
	public void setCanVote(boolean canVote) {
		this.canVote = canVote;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getBoothId() {
		return boothId;
	}
	public void setBoothId(String boothId) {
		this.boothId = boothId;
	}
	public String getLastVoted() {
		return lastVoted;
	}
	public void setLastVoted(String lastVoted) {
		this.lastVoted = lastVoted;
	}
	
	@Override
	public void updateStateChangeRules(String newState) {
		// Voting Rules gets updated here
		System.out.println("Updated voting rules");
		
	}
	
	

}
