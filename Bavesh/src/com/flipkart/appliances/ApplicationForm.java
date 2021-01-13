package com.flipkart.appliances;

public class ApplicationForm {
	void customer(String name,char gender) {
		System.out.println("Name is:"+name);
		System.out.println("Gender is:"+gender);
		System.out.println("Click on Submit");
	}
	void customer(String name,char gender,String address,long mobno,int age) {
		System.out.println("Name is:"+name);
		System.out.println("Gender is:"+gender);
		System.out.println("Address is:"+address);
		System.out.println("Mob no is:"+mobno);
		System.out.println("age is:"+age);
		System.out.println("Click on Submit");
	}

	public static void main(String[] args) {
		ApplicationForm appl=new ApplicationForm();
		appl.customer("Arundhati", 'f');
		appl.customer("Harshit", 'm', "BBSR", 234567890l, 29);
		

	}

}
