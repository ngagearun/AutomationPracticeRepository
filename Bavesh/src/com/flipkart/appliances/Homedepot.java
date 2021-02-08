package com.flipkart.appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Homedepot {

static EdgeDriver driver;
	
	
	public static void launchbrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\baves\\Desktop\\msedgedriver.exe");
		driver= new EdgeDriver();
		
	}
	public static void openapp(String url) throws InterruptedException{
		driver.get(url);
		Thread.sleep(3000);

	}


public static void search(By loactorname, String value) {
	
	driver.findElement(loactorname).clear();
	driver.findElement(loactorname).sendKeys(value);
}
	
	public static void click(By loactorname) {
		
		driver.findElement(loactorname).click();
	}
	
	
	public static void search1(By loactorname, String value) {
		
		driver.findElement(loactorname).clear();
		driver.findElement(loactorname).sendKeys(value);
	}
		
		public static void click1(By loactorname) {
			
			driver.findElement(loactorname).click();
		}
	
}
