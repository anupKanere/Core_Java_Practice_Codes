package com.app;

public interface Test {

	public void sendEmail(EmailDetails e);

	class EmailDetails 
	{
		String from;
		String to;
		String subject;
		
	}
}
