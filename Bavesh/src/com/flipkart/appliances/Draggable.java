package com.flipkart.appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Draggable extends ResuableSelinium {

	public static void main(String[] args) throws InterruptedException  {
		
		launchbrowser();
		openapp("https://jqueryui.com/draggable/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement draggable= driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(draggable,168,32).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
