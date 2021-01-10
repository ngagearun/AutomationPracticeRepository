package com.flipkart.appliances;

public class EmployeeDetails {
	
	String EmployeeName;
	int EmployeeID;
	String Employeeemailid;
	static String  EmployeeOrganization="abc";
	
	
	

	public static void main(String[] args) {
		
		
		EmployeeDetails e1= new EmployeeDetails();
		e1.EmployeeName="Bavesh";
		e1.Employeeemailid="Bavesh23@gmail.com";
		System.out.println("Name: " + e1.EmployeeName);
        System.out.println("Emailid:" + e1.Employeeemailid);
		System.out.println("orgaization:" +e1.EmployeeOrganization );
		
		
		EmployeeDetails e2= new EmployeeDetails();
		e2.EmployeeName="ram";
		e2.Employeeemailid="ram23@gmail.com";
		System.out.println("Name: " + e2.EmployeeName);
        System.out.println("Emailid:" + e2.Employeeemailid);
        System.out.println("organization:" +e2.EmployeeOrganization);
		
	}
	


	
	}