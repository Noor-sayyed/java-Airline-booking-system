package com.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Aspects.ConnectionProvider;
import com.DAOinterface.Daointerface;
import com.exception.Ticketnotfound;

public class Daoimpl implements Daointerface
{
	PreparedStatement p1,p2,p3,p4;
	ResultSet rs;
	int fno,pri;
	String Arr,Dep,d;
	
	Connection conn=ConnectionProvider.Provideconnection();
	
	public void bookticket(int flightno,int price,String arrival,String departure,String fdate) 
	{
		try {
			
				p2=conn.prepareStatement("insert into AIRLINE values(?,?,?,?,?)");
				p2.setInt(1, flightno);
				p2.setInt(2, price);
				p2.setString (3, arrival);
				p2.setString(4, departure);
				p2.setString(5, fdate);
				int UpdateCount=p2.executeUpdate();
				
				System.out.println(UpdateCount);
				System.out.println("what");
			} 
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		
	}
	public void deleteticket(int flightno)
	{
		
		  try 
		  {
			 
			  p3=conn.prepareStatement("delete from AIRLINE where flightno=?");
			  p3.setInt(1, flightno);
			  rs=p3.executeQuery();
			  int updatecount=p3.executeUpdate();
			  System.out.println(updatecount);
		  } 
		  catch (SQLException e) 
		  {
		   e.printStackTrace(); 
		  }
		 
	}
	
	public int validateflightno(int flightno) 
	{
		try {
			p4=conn.prepareStatement("Select flightno,price,arrival,departure,fdate from Airline where flightno=?");
			p4.setInt(1, flightno);
			rs=p4.executeQuery();
			
		}
		
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
			try {
				while(rs.next()) 
				{
				  fno=rs.getInt("flightno");
				  pri=rs.getInt("price");
				  Arr=rs.getString("arrival");
				  Dep=rs.getString("departure");
				  d=rs.getString("fdate");
				}
				
				if(flightno==fno)
				{
					
					System.out.println("flightno matched  :"+fno+"\n Price :"+pri+" KWD"+"\n Arrival :"+Arr+"\n Departure :"+Dep+"\n Date:"+d);
				}
				else {
					throw new Ticketnotfound("ticket not found ");
				}
				
			}
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Ticketnotfound e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flightno;
		} 
	
}
