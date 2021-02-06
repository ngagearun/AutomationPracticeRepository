package com.flipkart.appliances;



public class Addition {
	
	void add(int a,int b,int c) {
		
		int sum=a+b+c;
		System.out.println(sum);
	}
	
void add(int a,int b) {
		
		int sum=a+b;
		System.out.println(sum);
	}

void add(float a,float b,float c) {
	
	float sum=a+b+c;
	System.out.println(sum);
}

	public static void main(String[] args) {
		Addition a= new Addition();
		a.add(100, 200, 300);
		a.add(400, 500, 600);
		a.add(700, 800, 900);
		


	}

}
