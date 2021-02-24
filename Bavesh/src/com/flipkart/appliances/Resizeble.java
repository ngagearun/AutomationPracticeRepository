package com.flipkart.appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Resizeble extends DroppableExtension {
	
	public static void main(String args[]) throws InterruptedException {
	
	launchbrowser();
	openapp("https://jqueryui.com/resizable/");
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	WebElement draggable = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	Actions action= new Actions(driver);
	action.clickAndHold(draggable).moveByOffset(80, 100).release(draggable).build().perform();
	Thread.sleep(3000);
	driver.close();

	}
	
}
