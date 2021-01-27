package com.flipkart.appliances;

public class customerfield {


void submit(String Name, char Gender) {
	 System.out.println("Name:" +Name);
	 System.out.println("Gender:" +Gender);
	 System.out.println("click submit");
 }
	
 
 void submit1(String Name, char Gender,long phonenumber,String Address) {
	 
	 System.out.println("Name:" +Name);
	 System.out.println("Gender:" +Gender);
	 System.out.println("phonenumber:" +phonenumber);
	 System.out.println("Address:" +Address);
	 System.out.println("click submit");
 }
	 
 public static void main(String[] args) {
	 
	 customerfield a = new customerfield();
	a.submit("Bavesh", 'M');
	a.submit1("Bavesh", 'M', 23432, "chicago");
	 
	 
	 
	 
 }
	   
   }
   
