package com.flipkart.appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Droppable extends DroppableExtension {

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		openapp("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement draggable= driver.findElement(By.id("draggable"));
		WebElement droppable =driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.contextClick(draggable);
		Thread.sleep(4000);
		action.dragAndDrop(draggable, droppable).perform();
		Thread.sleep(4000);
		driver.close();

	}

}
