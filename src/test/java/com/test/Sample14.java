package com.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojoclass.Pojo3;

import com.Baseclass.Baseclass;

public class Sample14 extends Baseclass {
	public static void main(String[] args) throws IOException {
		
		driverLaunch();
		urlLaunch("https://www.snapdeal.com/login");
		
		Pojo3 p = new Pojo3();
		
		WebElement username = p.getUsername();
		sendKeys(username, excelgetData(2, 1, "Sheet1", "flipkart"));
		
		WebElement login = p.getLogin();
		click(login);
		
	}

}
