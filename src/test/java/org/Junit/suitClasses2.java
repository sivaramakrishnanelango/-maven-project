package org.Junit;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class suitClasses2 {
	@Test
	public void tc2000() {
		
		JUnitCore.runClasses(unitTest4.class,unitTest5.class);

	}

}
