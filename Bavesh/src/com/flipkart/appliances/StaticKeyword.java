package com.flipkart.appliances;

public class StaticKeyword {
	
	static int accbalance=10000;
	
	void checkbalance(){
		accbalance=accbalance-4000;
		System.out.println(accbalance);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticKeyword hdfc=new StaticKeyword();
		hdfc.checkbalance();
		
		StaticKeyword axis=new StaticKeyword();
		axis.checkbalance();
		
		StaticKeyword sbi=new StaticKeyword();
		sbi.checkbalance();

	}

}
