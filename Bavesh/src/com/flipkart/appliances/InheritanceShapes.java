package com.flipkart.appliances;

class Shapes{
	int height=100,length=200,area;
}
 class Triangle extends Shapes{
	 void calculatearea() {
	 area=height*length;
	 System.out.println("Area of the Triangle is:"+area);
	
}
 }
 class Square extends Shapes{
	 void calculatearea() {
	 area=height*height;
	 System.out.println("Area of the Square is:"+area);
	
}
 }
 class Rectangle extends Shapes{
	 void calculatearea() {
	 area=height*length;
	 System.out.println("Area of the Rectangle is:"+area);
	
}
 }
 
public class InheritanceShapes {

	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.calculatearea();
		Square s= new Square();
		s.calculatearea();
		Rectangle r=new Rectangle();
		r.calculatearea();
		
		
		

	}

}
