package com.Mavenproject.BMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Selinium {
static EdgeDriver driver;
	
	
	public static void launchbrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\baves\\Desktop\\msedgedriver.exe");
		driver= new EdgeDriver();
		
	}
	public static void openapp(String url) throws InterruptedException{
		driver.get(url);
		Thread.sleep(3000);

	}
	

  public static void click(By Loacatorname) {
	  
	  driver.findElement(Loacatorname).click();
  }
  
  public static void search(By locatorname, String value) {
	    driver.findElement(locatorname).clear();
	    driver.findElement(locatorname).sendKeys(value);
	  
  }
}

