package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.DAOimpl.Daoimpl;

public class TestDelete {

	@Test
	public void test() 
	{
		Daoimpl d=new Daoimpl();
		System.out.println("testing delete function");
		d.deleteticket(1000);
		assertNotNull(d);
		
	}

}
