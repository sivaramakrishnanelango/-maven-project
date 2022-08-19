package com.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojoclass.Pojo1;

import com.Baseclass.Baseclass;

public class Sample12 extends Baseclass {

	
	public static void main(String[] args) throws IOException {
		
		driverLaunch();
		urlLaunch("https://www.facebook.com/");
		
		Pojo1 p = new Pojo1();
		
		WebElement username = p.getUsername();
		sendKeys(username, excelgetData(2, 0, "Sheet1","flipkart" ));
		WebElement password = p.getPassword();
		sendKeys(password, excelgetData(2, 1, "Sheet1","flipkart" ));
		
		
	}
}
