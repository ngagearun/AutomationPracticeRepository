package com.seleniumscripts;

import org.openqa.selenium.By;

import com.reusable.selenium.ReusableSelenium;

public class Flipkartapp extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://www.flipkart.com/");
		Thread.sleep(3000);
		mousehover(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div/div"));
		Thread.sleep(3000);
		click(By.xpath("//*[@id=\"container\"]/div/footer"));
		Thread.sleep(3000);
		//System.out.println(getTitle());
		driver.close();
		

	}

}
