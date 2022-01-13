package com.joanabarao.week_5;

public class SpacedLogger implements Logger {

	@Override
	public void log(String msg) {
		System.out.println(spaceLog(msg));	
		
	}
	
	private String spaceLog(String msg) {
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < msg.length(); i++) {
			builder.append(msg.charAt(i)).append(' ');
		}
		
		return builder.toString();
	}

	@Override
	public void error(String msg) {
		System.out.println("ERROR: " + spaceLog(msg));
		
	
	
	
	}

}
