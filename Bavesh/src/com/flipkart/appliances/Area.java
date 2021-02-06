package com.flipkart.appliances;

public class Area {
	


	void calculateCircle(int raidus,double pi) {
		
		double pi1 =3.14;
		
		
		
		int Area = (int) (pi1*raidus*raidus);
		
		System.out.println(+Area);
	}
	
	void caluclateTriangle(int a,int b) {
		
		int Area = a*b;
		
		System.out.println(+Area);
	}
	
	void calculateRectangle(int Lenght, int Breadth, int Height) {
		
		int Area= Lenght*Breadth*Height;
		System.out.println(+Area);
		
	}

	
	public static void main(String[] args) {
		
		
		Area a = new Area();
		a.calculateCircle(3, 3.14);
		a.caluclateTriangle(3, 4);
		a.calculateRectangle(3, 4, 12);

	}

}
