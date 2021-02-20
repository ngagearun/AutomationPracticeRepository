package com.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.reusable.selenium.ReusableSelenium;

public class DropDownSelection extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=683");
		Thread.sleep(3000);
		Select sponsorname=new Select(driver.findElement(By.id("c0")));
		sponsorname.selectByIndex(10);
		Thread.sleep(3000);
		sponsorname.deselectByValue("1151^-99");
		Thread.sleep(3000);
		sponsorname.deselectByVisibleText("ALL FAA Unmanned Aircraft exams");
		Thread.sleep(3000);
		driver.close();
	}

}
