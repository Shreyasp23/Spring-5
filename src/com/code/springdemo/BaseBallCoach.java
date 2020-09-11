package com.code.springdemo;

public class BaseBallCoach implements Coach{
	
	private FortuneService FS;
	
	public BaseBallCoach(FortuneService fS) {
		super();
		FS = fS;
	}
	
	public BaseBallCoach() {
		
	}

	@Override
	public String getDailyWorkOut(){
		
		return "Spend 30 mins workout";
	}

	@Override
	public String getFortune() {
		return FS.getSpecialfortune();
	}

}
