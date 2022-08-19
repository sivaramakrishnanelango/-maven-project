package org.Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Baseclass.Baseclass;

public class unitTest1 extends Baseclass{

	@Test
	public void tc1() {
		System.out.println("tc1");

	}
	
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
	@Test
	public void tc3() {
		System.out.println("tc3");

	}
	@Test
	public void tc4() {
		System.out.println("tc4");

	}
	@Test
	public void tc5() {
		System.out.println("tc5");

	}
	
	@Before
	public void startTime() {
	  System.out.println("starttime");

	}
	@After
	public void endTime() {
		System.out.println("endTime");

	}
	
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("launchbrowser");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("closebrowser");
		

	}
}
