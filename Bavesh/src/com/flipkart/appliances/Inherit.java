package  com.flipkart.appliances;

class Employee{
	
	float salary=2000;
	String name ;String EmpID;
	
	
}

class admin extends Employee{
	String name="Bavesh";
	
	void calculatename(String name) {
		System.out.println("The Employee name"+(name));
	}
}


class administrator extends Employee{
	
	String EmpID="23456";
	
	void calculateID(String EmpID) {
		
		System.out.println("The EmployeeID"+(EmpID));
	}
}
class Program extends Employee{
	
	float bonus=1000;
	
	void calculatesal(float sal) {
		
		System.out.println("The programmer salary"  +(salary+bonus));
	}
}

class Admin extends Employee{
	
	void calculatesal() {
		
		System.out.println("The admin salary" +(salary));
	}
}

public class Inherit {

	public static void main(String[] args) {
		
		Program Bavesh = new Program();
		admin ravi=new admin();
		Bavesh.calculatesal(2000);
		ravi.calculatename("shyam");
		administrator shruti=new administrator();
		shruti.calculateID("234234");
		
		

	}

}
