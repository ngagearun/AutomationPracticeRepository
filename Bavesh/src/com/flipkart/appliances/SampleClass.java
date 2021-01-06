package com.flipkart.appliances;

public class SampleClass {
	
	int a=100;
	
	void m1(){
		System.out.println("Welcome to Java Traing classes");
		System.out.println(a);
	}

	public static void main(String[] args){
		SampleClass sample=new SampleClass();
	    sample.m1();
	   System.out.println(sample.a);
	}
}
