package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.reusable.selenium.ReusableSelenium;

public class DraggableAction extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("http://only-testing-blog.blogspot.com/");
		Thread.sleep(9000);
		driver.findElement(By.linkText("Drag and Drop")).click();
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		WebElement from = driver.findElement(By.id("dragdiv"));
		WebElement to = driver.findElement(By.id("dropdiv"));
		action.dragAndDrop(from,to).build().perform();
		Thread.sleep(6000);
		driver.close();



	}

}
