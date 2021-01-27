package com.flipkart.appliances;
//Program for calculating Trapeizoid and perimeter of Triangle//
public class Areas {


	void calculateTrapeizoid(int base,int base2,int height) {
		
		int Area = 2*(base+base)*height;
		System.out.println(+Area);
		
	}
	
	void calculateTriangle(int a, double b, int c) {
		
             double  Perimeter =  (a+b+c);
		System.out.println(+Perimeter);
	}
	
		
	public static void main(String[] args) {
		
		Areas a =new Areas();
		a.calculateTrapeizoid(3, 3, 5);
		a.calculateTriangle(2,  2.5, 3);
		

	}

}
