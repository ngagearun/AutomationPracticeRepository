package com.seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.reusable.selenium.*;

public class MouseHoverActions extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://www.icicibank.com/");
		Thread.sleep(3000);
		mousehover(By.xpath("/html/body/header/div/div[3]/div/nav/ul/li[3]/div[1]/span[2]"));
		Thread.sleep(3000);
		click(By.xpath("/html/body/header/div/div[3]/div/nav/ul/li[3]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/p/a"));
		Thread.sleep(3000);
		System.out.println(getTitle());
		driver.close();

	}

}
