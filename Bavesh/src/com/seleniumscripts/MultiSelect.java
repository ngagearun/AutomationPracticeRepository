package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.reusable.selenium.ReusableSelenium;

public class MultiSelect extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("http://only-testing-blog.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("TextBox")).click();
		
		Thread.sleep(6000);
		WebElement item1 = driver.findElement(By.id("country1"));
		WebElement item4 = driver.findElement(By.id("country4"));
		WebElement item6 = driver.findElement(By.id("country6"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(item1).click(item4).click(item6).build().perform();
		Thread.sleep(5000);
		action.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[2]/input[1]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
