package com.Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseover extends Commands {
	
	public static void main(String[] args) throws InterruptedException {

	launchbrowser();
	 openapp("https://www.flipkart.com/");
	 Thread.sleep(3000);
	 mouseover(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[1]/div/img"));
	 Thread.sleep(3000);
	 click(By.xpath(("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[1]/div/img")));
	 System.out.println("GetTitle");
	 driver.close();
	 
	 
	 
	 
	

	}

}
	

