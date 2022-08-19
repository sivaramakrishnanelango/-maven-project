package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Baseclass.Baseclass;

public class Sample10 extends Baseclass {
	public static void main(String[] args) throws IOException {
		
		driverLaunch();
		urlLaunch("https://www.snapdeal.com/login");
		WebElement user = driver.findElement(By.id("userName"));
		sendKeys(user, excelgetData(3, 2, "Sheet1", "New Microsoft Excel Worksheet"));
	}

}
