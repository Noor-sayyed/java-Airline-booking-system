package com.Beans;
import java.util.Date;
public class Airline 
{
protected static String Name="Qatar Airways";

public static String getName() 
{
	return Name;
}
public static void setName(String name) 
{
	Name = name;
}
	protected int flightNo=1120;
	protected Date time;
	protected  float price=550.0f;
	public Airline()
	{
	flightNo=flightNo++;

	}


public void setFlightNo(int flightNo)
{	
	this.flightNo = flightNo;
}
public int getFlightNo() 
{
	flightNo++;
	return flightNo;
}

public Date getTime() 
{
	return time;
}
public void setTime(Date time) 
{
	this.time = time;
}
public float getPrice() 
{
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

public String toString() {
	return "Airline [flightNo=" + flightNo + ", time=" + time + ", price=" + price + "]";
	
}
}
