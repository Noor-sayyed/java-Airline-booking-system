package com.DAOinterface;


import com.exception.Ticketnotfound;

public interface Daointerface 
{
	
	public void bookticket(int flightno,int price,String arrival,String departure,String fdate);
	public void deleteticket(int flightno);
	public int validateflightno(int flightno) throws Ticketnotfound;
	
}
