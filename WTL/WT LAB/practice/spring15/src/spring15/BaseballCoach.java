package spring15;

public class BaseballCoach implements Coach {
	private FortuneService fortune;
	
	BaseballCoach(FortuneService fortune){
		this.fortune=fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return " Practice daily";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyFortune();
	}

	
}
