package com.seleniumscripts;

import java.io.IOException;

import org.openqa.selenium.By;

import com.reusable.selenium.ReusableSelenium;

public class WindowbasedAlert extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException, IOException {
		launchbrowser();
		openapp("https://www.naukri.com/");
		Thread.sleep(3000);
		click(By.id("wdgt-file-upload"));
		Thread.sleep(3000);
		Runtime.getRuntime().exec("");
		driver.close();
		

	}

}
