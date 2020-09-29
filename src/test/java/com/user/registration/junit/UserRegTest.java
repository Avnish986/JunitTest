package com.user.registration.junit;
import org.junit.*;
import org.junit.Assert;
public class UserRegTest {
	
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad()
	{
		UserRegistration moodAnalyser = new UserRegistration();
		String mood = moodAnalyser.analyseMood("This is Sad message");
		Assert.assertEquals("SAD", mood);
	}
	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy()
	{
		UserRegistration moodAnalyser = new UserRegistration();
		String mood = moodAnalyser.analyseMood("This is Happy message");
		Assert.assertEquals("HAPPY", mood);
	}
	 
}
