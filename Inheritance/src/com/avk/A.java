package com.avk;

public class A {

	//private int a=10; // Object of subclass is not able to call this member bc of access specifier. TC-4
	
	int a=10;
	int b=20;
	
	void m1() {
		
	System.out.println("A-m1");
	
	}

	void m2() {
		
		System.out.println("A-m2");
		
	}

}

