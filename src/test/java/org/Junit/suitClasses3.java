package org.Junit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite.SuiteClasses;

public class suitClasses3 {
	
	@Test
	public void tc1() {
		Result jrs = JUnitCore.runClasses(unitTest4.class,unitTest5.class);
		
		System.out.println("test case run time:"+jrs.getRunTime());
		System.out.println("test case failure count:"+jrs.getFailureCount());
		System.out.println("test case ignore count:"+jrs.getIgnoreCount());
		System.out.println("test case run count:"+jrs.getRunCount());
		
		List<Failure> failures = jrs.getFailures();
		for (Failure failure : failures) {
			
			System.out.println(failure);
		}

	}

}
