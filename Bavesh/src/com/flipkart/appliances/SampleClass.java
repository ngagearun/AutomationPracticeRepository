package com.flipkart.appliances;

public class SampleClass {
	//instance variable
	int a=100;
	//static variable
	static int b=200;

	//instance method
	void method1(){
		//local variable
		int c=200;
		System.out.println(b);
		method2();
	}
	
	//static method
	static void method2(){
		
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HEllos");
		SampleClass obj1=new SampleClass();
		System.out.println(obj1.a);
		obj1.method1();
		method2();
		System.out.println(b);
		
		
		
		

	}

}
