package com.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Client.ClientBooking;
import com.DAOimpl.Daoimpl;

public class TestFlight {
     ClientBooking c=new ClientBooking();
     @Test
	public void test() 
	{
		Daoimpl d=new Daoimpl();
		
		//Daoimpl.public int validateflightno(int flightno)} 
		
		System.out.println("checking the validateflight  function");
		
		int outcome=d.validateflightno(1102);
		
		assertEquals(1102, outcome);
	}

}
