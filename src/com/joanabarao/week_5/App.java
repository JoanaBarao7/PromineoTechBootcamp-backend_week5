package com.joanabarao.week_5;

public class App {

	public static void main(String[] args) {
		Logger Asterisk = new AsteriskLogger();
		
		Asterisk.log("Hello");
		System.out.println();
		
		Asterisk.error("Hello");
		System.out.println();
		
		Logger Space = new SpacedLogger();
			
		Space.log("Hello");
		System.out.println();
		
		Space.error("Hello");


	}

}
