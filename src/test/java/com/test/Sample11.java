package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Baseclass.Baseclass;

public class Sample11 extends Baseclass{
	
	public static void main(String[] args) throws IOException {
		
		driverLaunch();
		urlLaunch("https://www.flipkart.com/account/login?ret=%2Fwishlist");
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendKeys(user, excelgetData(4, 0, "Sheet1", "flipkart"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		sendKeys(pass, excelgetData(4, 1, "Sheet1", "flipkart"));
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(login);
		
	}

}
