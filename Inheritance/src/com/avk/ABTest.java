package com.avk;

public class ABTest {
	
	public static void main(String[] args) {
	
	/*	
	  // Test Case 1- This test shows that we can't call members (e.g-a,b,m1,m2) of super-class by creating 
	 //  object of sub-class.
		
		B b=new B();		 
	    System.out.println(b.a); // ERROR
	
	*/
	

	/*	
	 	// Test Case 2- This test shows that we can't call members of sub-class by creating object of super-class.
		
		A aa = new A();				
		System.out.println(aa.a);	
		System.out.println(aa.b);	
		System.out.println(aa.c);	 // ERROR
		aa.m1();
		aa.m2();
		aa.m3();					// ERROR
	
	*/	
		
	
	/*
		
		// Test Case 3- This test shows we can call members of super-class only when we use "extends" keyword
		//				in sub-class.
		
		B b=new B();		
	    System.out.println(b.a);
	    
	*/    
	
	
	/*	
		
	// Test Case 4- If we apply private specifier to member of super-class then the object of subclass
	//				is not able to call that member.
		
		B b = new B();
		System.out.println(b.a); // ERROR
		
		
	*/
		
	/*
		
	// Test Case 5- Members of parent class those which are also in subclass, can't be printed, they shows output of 
	// sub-class only.	
		
		
		B b = new B();
		System.out.println(b.a); // 10
		System.out.println(b.b); // 20  // 30	
		System.out.println(b.c); // 40
		b.m1();
		b.m2();
		b.m3();
*/		
		
/*		
		
		// Test Case- 6
		
		A a = new B(); // This case shows that we can assign subclass to superclass.
		B b = new A(); // This case shows that we can't assign subclass to superclass.
		
*/		

/*
		
		// Test Case 7- When we assign subclass to superclass at that time members of subclass will give error, 
		//			    which are not in super class.
		
		A a = new B();
		
		System.out.println(a.a);	
		System.out.println(a.b);	
		System.out.println(a.c);	 
		a.m1();
		a.m2();
		a.m3();					
	
*/	
		

/*	
	
	// Test Case 8- 
		
		A a = new C();
		
		System.out.println(a.a);	
		System.out.println(a.b);	
		//System.out.println(a.c);	 
		//System.out.println(a.d);
		a.m1();
		a.m2();
		//a.m3();					
		//a.m4();
		
*/		

/*

	// Test Case 9-
		
		B b = new C();
		
		System.out.println(b.a);	
		System.out.println(b.b);	
		System.out.println(b.c);	 
		//System.out.println(b.d);
		b.m1();
		b.m2();
		b.m3();					
		//b.m4();
		
*/		
		

// Test Case 10-
	
		A a = new A();
		B b = new B();
		//b=(B) a;
		//a=b;
		
		System.out.println(b.a);	
		System.out.println(b.b);	
		System.out.println(b.c);	 
		//System.out.println(b.d);
		b.m1();
		b.m2();
		b.m3();					
	   //b.m4();
	
	}
}
