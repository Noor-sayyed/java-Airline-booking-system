package com.Aspects;
import com.Service.BookTicket;
import com.ServiceImpl.AirlineType;

	public class ObjectProvider 

	{
	
		public static BookTicket ProvideObj()
		{
			return  new AirlineType();
	
		}

	}
