package com.flipkart.appliances;

class RBI {
	
	int ROI;
	String IFSCODE;
}

class SBI extends RBI{
	
	int ROI = 6;
	String IFSCODE ="IND23456";
	void calculateROISBI(int ROI) {
		System.out.println("Calculate rate of Interest"  +(ROI));
	}
	
	void calculateIFSCODE(String IFSCODE) {
		System.out.println("IFSCODE of sbi" +(IFSCODE));
	}
	
}

class HDFC extends RBI{
	
	int ROI=7;
	String IFSCODE="HDFC2345";
	void calculateROIHDFC(int ROI) {
		System.out.println("calculate rate of Interest" +(ROI));
		
	}
	
	void calcuateIFSCODE(String IFSCODE) {
		System.out.println("IFSCODE of HDFC" +(IFSCODE));
	}
	
}

class AXIS extends RBI{
	
	int ROI=4;
	String IFSCODE="AXIS2345";
	void calculateROIAXIS(int ROI) {
		System.out.println("calculate rate of Interest" +(ROI));
		
	}
	
	void calcuateIFSCODE(String IFSCODE) {
		System.out.println("IFSCODE of HDFC" +(IFSCODE));
	}
	
}
public class Bank {

	public static void main(String[] args) {
		
		SBI bavesh = new SBI();
		bavesh.calculateROISBI(6);
		bavesh.calculateIFSCODE("IND23456");
		HDFC ram = new HDFC();
		ram.calculateROIHDFC(7);
		ram.calcuateIFSCODE("HDFC2345");
        AXIS shyam = new AXIS();
        shyam.calculateROIAXIS(4);
        shyam.calcuateIFSCODE("AXIS2345");
	}

}
