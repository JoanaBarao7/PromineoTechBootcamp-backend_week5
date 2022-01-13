package com.joanabarao.week_5;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String msg) {
		System.out.println("***" + msg + "***");
		
	}


	@Override
	public void error(String msg) {
		System.out.println("******************");
		System.out.println("***Error: Hello***");
		System.out.println("******************");
		
		
	}

}
