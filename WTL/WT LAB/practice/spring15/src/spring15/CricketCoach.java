package spring15;

public class CricketCoach implements Coach {
	
	private FortuneService fortune;
	
	CricketCoach(FortuneService fortune)
	{
		this.fortune=fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return " Practice Daily!";
	}

	

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}

	
}
