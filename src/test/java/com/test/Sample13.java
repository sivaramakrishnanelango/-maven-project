package com.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojoclass.Pojo2;

import com.Baseclass.Baseclass;

public class Sample13 extends Baseclass {
	
	public static void main(String[] args) throws IOException {
		
		driverLaunch();
		urlLaunch("https://www.flipkart.com/");
		
		Pojo2 p = new Pojo2();
		
		WebElement username = p.getUsername();
		sendKeys(username, excelgetData(1, 0, "Sheet1", "flipkart"));
		
		WebElement password = p.getPassword();
		sendKeys(password, excelgetData(1, 1, "Sheet1", "flipkart"));
		
		WebElement login = p.getLogin();
		click(login);
		
	}

}
