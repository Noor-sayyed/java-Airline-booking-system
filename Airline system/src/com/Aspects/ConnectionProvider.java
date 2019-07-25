package com.Aspects;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider 
{
	static Connection con;
	FileInputStream fis;
	static String dclass,url,uname,pass;

	public static Connection Provideconnection()
	{
	Properties p= new Properties();
		
	
	try
		{
		p.load(new FileInputStream(".//resources//dbconfig.properties"));
		dclass=p.getProperty("drivermanager");
		url=p.getProperty("url");
		uname=p.getProperty("username");
		pass=p.getProperty("password");
		
		Class.forName(dclass);
		con=DriverManager.getConnection(url,uname,pass);
		}
	catch(Exception e)
		{
		
		e.printStackTrace();
		}
	return con;
	}
}
