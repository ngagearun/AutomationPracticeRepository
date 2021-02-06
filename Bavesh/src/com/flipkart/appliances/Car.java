package com.flipkart.appliances;

// Abstract program//

abstract class Car {
	
	public abstract void Drive();
	
	public void stop() {
		
		System.out.println("Stop the car");
	}
	
	
	static class BMW extends Car{

		@Override
		public void Drive() {
			// TODO Auto-generated method stub
			
			System.out.println("Drive the BMW");
			
			
		}
	
	
		public static void main(String[] args) {
			BMW a = new BMW();
			a.Drive();
			a.stop();
			
		}
	}
	
}
	
	


