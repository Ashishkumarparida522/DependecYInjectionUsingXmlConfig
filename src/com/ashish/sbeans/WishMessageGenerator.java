package com.ashish.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime lt;
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}
	
	public WishMessageGenerator()
	{
		System.out.println("0-param-const");
	}
	
	//buisness method
	
	public String getWishMessage(String user)
	{
		
		int hour=lt.getHour();
		if(hour <12)
			return"good morning"+user;
		else if(hour<16)
			return "good afternoon"+user;
		else if(hour<20)
			return "good evening"+user;
		else
		return "good night"+user;
		
	}

	
	
	

}
