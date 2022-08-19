package org.Junit;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojoclass.Pojo2;

import com.Baseclass.Baseclass;

public class unitTest4 extends Baseclass {

	
	@Test
	public void tc1() throws IOException {
		
		
		driverLaunch();
		urlLaunch("https://www.flipkart.com/");
		Pojo2 p = new Pojo2();
		sendKeys(p.getUsername(), excelgetData(2, 0, "Sheet1", "flipkart"));
		sendKeys(p.getPassword(), excelgetData(2, 1, "Sheet1", "flipkart"));
	    click(p.getLogin());
	    
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
		

	}

