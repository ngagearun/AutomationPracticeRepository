package com.flipkart.appliances;

import org.openqa.selenium.By;

public class Navigation extends Homedepot {

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		openapp("https://www.homedepot.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		search(By.className("SearchBox__input"),("Biden"));
		click(By.id("headerSearchButton"));
		driver.navigate().back();
		click(By.linkText("Store Finder"));
		search1(By.id("storeSearchBox"),("3518 Baseline ct Apt B Richmond"));
		click1(By.xpath("/html/body/section/div[2]/div[1]/section[1]/div[2]/form/div[2]/button"));
        driver.navigate().refresh();
        driver.close();
	}

}
