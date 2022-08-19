package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Baseclass.Baseclass;

public class Sample7 extends Baseclass {
	public static void main(String[] args) throws IOException {
		
		driverLaunch();
		urlLaunch("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		sendKeys(username, excelgetData(1, 2, "Sheet1", "New Microsoft Excel Worksheet"));
		WebElement pass = driver.findElement(By.name("pass"));
		sendKeys(pass, excelgetData(1, 3, "Sheet1", "New Microsoft Excel Worksheet"));
	}


}
