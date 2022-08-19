package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Baseclass.Baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Baseclass
{

	public static void main(String[] args) {
		driverLaunch();
		urlLaunch("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		sendKeys(findElement, "sivaram.e98@gmail.com");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		sendKeys(findElement2, "sivaram123");
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

