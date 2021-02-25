package com.seleniumscripts;

import org.openqa.selenium.By;

import com.reusable.selenium.ReusableSelenium;

public class WebBasedAlerts extends ReusableSelenium{

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		openapp("https://candidate.psiexams.com/account/create_account.jsp");
		Thread.sleep(3000);
		//driver.findElement(By.className("errorInline")).getText();
		sendtext(By.name("emailid"),"test@gmail.com");
		sendtext(By.name("firstname"),"jogashree");
		sendtext(By.name("lastname"),"mishra");
		click(By.xpath("//*[@id=\"tbl\"]/table/tbody/tr[10]/td/input[1]"));
		driver.switchTo().alert().accept();
		driver.close();
		

	}

}
