package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.reusable.selenium.ReusableSelenium;

public class DroppableAction extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("http://only-testing-blog.blogspot.com/");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.id("dragdiv"));
		WebElement to = driver.findElement(By.id("dropdiv"));
		action.dragAndDrop(from,to).build().perform();
		Thread.sleep(6000);
		driver.close();



		

	}

}
