package com.Mavenproject.BMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Resuable {

static EdgeDriver driver;
	
	
	public static void launchbrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\baves\\Desktop\\msedgedriver.exe");
		driver= new EdgeDriver();
	}

		
		public static void openapp(String url) throws InterruptedException{
			driver.get(url);
			Thread.sleep(3000);
		}
			public static void sendText(By locatorname,String value) {
				driver.findElement(locatorname).clear();
				driver.findElement(locatorname).sendKeys(value);
			}
		
			public static void send(By locatorname, String value) {
				driver.findElement(locatorname).clear();
				driver.findElement(locatorname).sendKeys(value);
			}
			
			public static void Text(By name, String value) {
				driver.findElement(name).clear();
				driver.findElement(name).sendKeys(value);
	}
			
			public static void sendinput(By name, String value) {
				driver.findElement(name).clear();
				driver.findElement(name).sendKeys(value);
				
			
			}
			
			public static void loanterm(By name, String value) {
				driver.findElement(name).clear();
				driver.findElement(name).sendKeys(value);
			
}
			public static void StartDate(By name, String value) {
				driver.findElement(name).clear();
				driver.findElement(name).sendKeys(value);		
			
}

			public static void StartYear(By name, String value) {
				driver.findElement(name).clear();
				driver.findElement(name).sendKeys(value);		
			
			
}
			public static void PMI(By name, String value) {
				driver.findElement(name).clear();
				driver.findElement(name).sendKeys(value);		
					
			
}
			
			public static void HOI(By loctarname, String value) {
				driver.findElement(loctarname).clear();
				driver.findElement(loctarname).sendKeys(value);	

}
			public static void MonthlyHOA(By loctarname, String value) {
				driver.findElement(loctarname).clear();
				driver.findElement(loctarname).sendKeys(value);	
		
}

			


}



