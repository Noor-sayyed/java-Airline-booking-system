package com.testing;

import static org.junit.Assert.*;
import org.junit.Test;
import com.DAOimpl.Daoimpl;

public class TestBookticket
	{

	@Test
	public void test() 
	{
	Daoimpl d=new Daoimpl();
	System.out.println("testing the bookticket function");
	
	d.bookticket(1022, 87, "Boston", "Chelsea", "4-5-2018");
	
	assertNotNull(d);
	}

}
