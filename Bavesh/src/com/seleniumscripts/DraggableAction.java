package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.reusable.selenium.ReusableSelenium;

public class DraggableAction extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://jqueryui.com/draggable/");
		Thread.sleep(9000);
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		Thread.sleep(6000);
		Actions action=new Actions(driver);
		action.dragAndDropBy(draggable, 168, 97).perform();
		Thread.sleep(4000);
		driver.close();
		
	}

}
