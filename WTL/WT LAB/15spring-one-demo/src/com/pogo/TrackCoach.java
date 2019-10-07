package com.pogo;

public class TrackCoach implements Coach {

	private FortuneService fs;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fs)
	{
		this.fs = fs;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "atleast run 5k everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it "+fs.getFortune();
	}

}
