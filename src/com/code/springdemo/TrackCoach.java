package com.code.springdemo;

public class TrackCoach implements Coach {
	
	private HappyFornuteService fortune;
	
	public TrackCoach(HappyFornuteService fortune){
		this.fortune=fortune;
		
	}	
	
	@Override
	public String getDailyWorkOut() {
		
		return "RUN RUN";
	}
	
	@Override
	public String getFortune() {
		
		return this.fortune.getFortune();
	}

}
