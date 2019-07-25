package com.Service;

public interface BookTicket 
{
	public void book(int flightno,int price,String arrival,String departure,String fdate);
	
	public void delete(int flightno);
	
	public void validate(int flightno);

}
