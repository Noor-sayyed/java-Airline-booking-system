package com.ServiceImpl;

import com.Beans.Airline;
import com.Beans.Location;
import com.DAOimpl.Daoimpl;
import com.Service.BookTicket;

public class AirlineType implements BookTicket
{
	public Location l;
	public Airline ar=new Airline();	
	public Daoimpl dimpl;
	
	

	public void book(int flightno, int price, String arrival, String departure,String fdate) 
	{
		dimpl=new Daoimpl();
		dimpl.bookticket(flightno, price, arrival, departure,fdate);
	}
	
	public void delete (int flightno)
	{
		dimpl=new Daoimpl();
		dimpl.deleteticket(flightno);
	}
	
	public void validate(int flightno)
	{
		dimpl=new Daoimpl();
		dimpl.validateflightno(flightno);
	}
}
