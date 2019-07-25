package com.Client;
import java.sql.Connection;
import java.sql.SQLException;
import com.Aspects.ConnectionProvider;
import com.Aspects.ObjectProvider;
import com.Service.BookTicket;
import com.exception.Ticketnotfound;


public class ClientBooking 
{ 

	public static void main(String[] args) throws Ticketnotfound
	{
		//hiding the implementation using interface---BookTicket
		
	    new ObjectProvider();
		
		Connection a=ConnectionProvider.Provideconnection();
	
		BookTicket b=ObjectProvider.ProvideObj();
	
		//new seat booking of the flight 
		
		
		 b.book(1101, 88, "India", "US","2-8-2018");
		
		 b.book(1102, 78, "dubai", "Greece","5-2-2019");
	
	    //deleting the flight ticket if customer wants to cancel the flight
		 b.delete(1002);
		 
		 b.delete(1003);
		 
	     b.delete(1112);
		
		//checking the flight details if not match throws ticket not found exception
		//price in Kuwait Dinar(kwd)
	   // b.validate(1000);
	    
		b.validate(1001);
		
		b.validate(1002);
		
		b.validate(1003);
		
		b.validate(1004);
		
		
		//closing the connection of the database
		try {
			a.close();
		    } 
		catch (SQLException e) 
			{
			e.printStackTrace();
			}
		}

	

	
}

