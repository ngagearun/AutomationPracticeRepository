package com.flipkart.appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class launch extends Resuable {
		

		public static void main(String[] args) throws InterruptedException {
			
			launchbrowser();
			openapp("https://www.mortgagecalculator.org/");
			Thread.sleep(3000);
			sendText(By.id("homeval"),("7000000"));
			send(By.id("downpayment"),("900000"));
			Text(By.name("param[principal]"),("3000000"));
			sendinput(By.name("param[interest_rate]"),("7"));
			loanterm(By.name("param[term]"),("12"));
			WebElement dropdown=driver.findElementByName("param[start_month]");
			Thread.sleep(3000);
			Select select = new Select(dropdown);
			select.selectByIndex(1);
			
			StartYear(By.name("param[start_year]"),("2022"));
			PMI(By.name("param[pmi]"),("3"));
			
			HOI(By.id("hoi"),("10000"));
			MonthlyHOA(By.id("hoa"),("9"));
				
			WebElement Dropdown=driver.findElementByName("param[milserve]");
			Thread.sleep(3000);
			Select select1 =new Select(Dropdown);
			select1.selectByIndex(1);
			
			WebElement Dropdown2=driver.findElementByName("param[refiorbuy]");
			Thread.sleep(3000);
			Select select3 =new Select(Dropdown2);
			select1.selectByIndex(2);
			
			
			driver.close();
	}
			
		

		

	
}
