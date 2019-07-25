package com.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

	@RunWith
	(Suite.class)
	@SuiteClasses
	({ TestBookticket.class, 
	TestDelete.class, 
	TestFlight.class })

	public class AllTests 
	{

	}
