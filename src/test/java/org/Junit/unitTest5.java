package org.Junit;

import java.io.IOException;

import org.junit.Test;
import org.pojoclass.Pojo3;

import com.Baseclass.Baseclass;

public class unitTest5 extends Baseclass{

	@Test
	public void tc1() throws IOException  {
		
		
		
		driverLaunch();
		urlLaunch("https://www.snapdeal.com/login");
		Pojo3 p = new Pojo3();
		sendKeys(p.getUsername(), excelgetData(1, 1, "Sheet1", "flipkart"));
		click(p.getLogin());

	}
}
