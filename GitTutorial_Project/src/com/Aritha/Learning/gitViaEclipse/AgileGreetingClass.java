package com.Aritha.Learning.gitViaEclipse;

public class AgileGreetingClass {
	private String GreetingMessage;
	
	
	public AgileGreetingClass(String message) {
		GreetingMessage = message;
	}

	public String message() {
		return GreetingMessage;
	}

	public void greet(){
		System.out.println(GreetingMessage);
	}
}
