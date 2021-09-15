package com.test.pkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondClass {
	
	@Test
	public void sum()
	{
		int a = 10;
		int b = 20;
		System.out.println("Sum of given number is: " + (a+b));
		Assert.assertEquals((a+b), 30);
	}

}
