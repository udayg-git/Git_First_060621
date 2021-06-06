package com.testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

//@Listeners(MyListner.class)

public class ListenerTest1 
{
	@Test
	public void test04()
	{
		Assert.assertEquals(true, false);
	}

	public void test05()
	{
		Assert.assertEquals(true, true);
	}
	
	public void test06()
	{
		throw new SkipException ("Skipping this test case");
	}

}
