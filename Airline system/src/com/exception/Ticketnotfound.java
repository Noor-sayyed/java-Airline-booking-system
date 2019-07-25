package com.exception;

@SuppressWarnings("serial")
public class Ticketnotfound extends Exception
{
	public String msg;

	public Ticketnotfound(String msg) 
	{
		super();
		this.msg = msg;
	}

		public String toString() {
		return "Ticketnotfound [msg=" + msg + "]";
	}
}
