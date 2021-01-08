package com.flipkart.appliances;

public class EmployeeDetails {
	
	String EmployeeName;
	int EmployeeID;
	String Employeeemailid;
	 int  EmployeeOrganization;
	
	static void Method1() {
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		EmployeeDetails e1= new EmployeeDetails();
		e1.EmployeeName="Bavesh";
		e1.Employeeemailid="Bavesh23@gmail.com";
		Method1();
		System.out.println("Name: " + e1.EmployeeName);
        System.out.println("Emailid:" + e1.Employeeemailid);
		System.out.println("abc");
		
		EmployeeDetails e2= new EmployeeDetails();
		e2.EmployeeName="ram";
		e2.Employeeemailid="ram23@gmail.com";
		Method1();
		System.out.println("Name: " + e2.EmployeeName);
        System.out.println("Emailid:" + e2.Employeeemailid);
		System.out.println("xyz");
		
	}
	


	
	}