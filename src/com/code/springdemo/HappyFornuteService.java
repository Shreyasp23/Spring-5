package com.code.springdemo;

public class HappyFornuteService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "GOOD LUCK";
	}

	@Override
	public String getSpecialfortune() {
		
		return "You got very lucky!!!";
	}

	
}
