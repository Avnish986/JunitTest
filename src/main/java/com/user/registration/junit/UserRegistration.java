package com.user.registration.junit;

public class UserRegistration {
	
	public String analyseMood(String msg) {
		if(msg.contains("Sad"))
				return "SAD";
		else
			return "HAPPY";
		
	}

}
