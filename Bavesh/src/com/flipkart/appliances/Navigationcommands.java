package com.flipkart.appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;

public class Navigationcommands extends Selinium {

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://www.selenium.dev/");
		Thread.sleep(3000);
		click(By.linkText("Downloads"));
		click(By.linkText("Projects"));
		click(By.linkText("Documentation"));
		driver.navigate().back();
		driver.navigate().forward();
		
		search(By.id("gsc-i-id1"),("selinium"));
		driver.close();
	}
	

	


	


	}
	

