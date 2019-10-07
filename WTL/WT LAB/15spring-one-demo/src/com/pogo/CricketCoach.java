package com.pogo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	private String team; 
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getTeam() {
		return team;
	}

	public CricketCoach() {
		System.out.println("inside cricket coach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside cricket coach setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "catches win matches";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "practice is the key to success "+fortuneService.getFortune();
	}

}
