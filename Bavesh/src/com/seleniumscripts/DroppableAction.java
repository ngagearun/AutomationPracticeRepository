package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.reusable.selenium.ReusableSelenium;

public class DroppableAction extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		

	}

}
