package com.test.java8.lambda_expressions;

public class Runnable {

	public Runnable() {
		// TODO Auto-generated constructor stub
	}

	public static void main( String args[] ) {
		new Thread(() -> System.out.println("Hello world")).start();;
	}
}
