package com.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Commands {

static EdgeDriver driver;
	
	
	public static void launchbrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\baves\\Desktop\\msedgedriver.exe");
		driver= new EdgeDriver();
	}

		
		public static void openapp(String url) throws InterruptedException{
			driver.get(url);
			Thread.sleep(3000);
		}
		
		public static void click(By Locatorname) {
			
			driver.findElement(Locatorname).click();
			
		}
		
		public static void mouseover(By loactorname) {
			
			 Actions action = new Actions(driver);
			 WebElement Ele = driver.findElement(loactorname);
			 action.moveToElement(Ele).perform();
		}
		
		public  String  getTitile() {
			
			String Titlename=driver.getTitle();
			return Titlename;
		}
			
		}

