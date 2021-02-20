package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.reusable.selenium.ReusableSelenium;

public class ResizableAction extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://jqueryui.com/resizable/");
		Thread.sleep(8000);
		Actions action=new Actions(driver);
		WebElement Resizable=driver.findElement(By.xpath("//*[@id=\'resizable\']"));
		Thread.sleep(6000);
		action.clickAndHold();
		action.dragAndDropBy(Resizable, 163, 234).release().build().perform();
		Thread.sleep(8000);
		driver.close();
		

	}

}
