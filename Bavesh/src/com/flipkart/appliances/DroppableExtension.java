package com.flipkart.appliances;

import org.openqa.selenium.edge.EdgeDriver;

public class DroppableExtension {
static EdgeDriver driver;
	
	
	public static void launchbrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\baves\\Desktop\\msedgedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
	}

		
		public static void openapp(String url) throws InterruptedException{
			driver.get(url);
			Thread.sleep(3000);
		}
		
}


