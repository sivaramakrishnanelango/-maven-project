package org.Junit;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojoclass.Pojo1;

import com.Baseclass.Baseclass;

public class unitTest2 extends Baseclass {

	@Test
	public void tc1() throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		Pojo1 p = new Pojo1();
		sendKeys(p.getUsername(), excelgetData(1, 0, "Sheet1", "flipkart"));
		sendKeys(p.getPassword(), excelgetData(1, 1, "Sheet1", "flipkart"));
		click(p.getBtnclick());
		Thread.sleep(2000);
		

	}
	
	@Test
	public void tc2() throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		Pojo1 p = new Pojo1();
		sendKeys(p.getUsername(), excelgetData(2, 0, "Sheet1", "flipkart"));
		sendKeys(p.getPassword(), excelgetData(2, 1, "Sheet1", "flipkart"));
		click(p.getBtnclick());
		Thread.sleep(2000);
		

	}
	@Test
	public void tc3() throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		Pojo1 p = new Pojo1();
		sendKeys(p.getUsername(), excelgetData(3, 0, "Sheet1", "flipkart"));
		sendKeys(p.getPassword(), excelgetData(3, 1, "Sheet1", "flipkart"));
		click(p.getBtnclick());
		Thread.sleep(2000);
		

	}
	@Test
	public void tc4() throws IOException, InterruptedException {
		urlLaunch("https://www.facebook.com/");
		Pojo1 p = new Pojo1();
		sendKeys(p.getUsername(), excelgetData(4, 0, "Sheet1", "flipkart"));
		sendKeys(p.getPassword(), excelgetData(4, 1, "Sheet1", "flipkart"));
		click(p.getBtnclick());
		Thread.sleep(2000);
		

	}
	
	@Before
	public void startTime() {
		 Date d = new Date();
		 System.out.println(d);

	}
	
	@After
	
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@BeforeClass
	public static void browserlaunch() {
		 driverLaunch();

	}
	@AfterClass
	public static void browserClose() {
		driverClose();

	}
}
