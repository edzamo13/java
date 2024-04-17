package com.app.hackerranks.advanced;

public class Example {
	
	
	public interface IStrategy{
		
		public String sayHello(String name);
	}
	
	public static void main(String[] args) {
		IStrategy strategy= (name) -> "Hello " + name;
		
		System.out.println(strategy.sayHello("name"));
	}

}
