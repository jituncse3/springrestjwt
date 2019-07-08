package com.nse.exception;

import java.util.Date;

public class ErrorDetails extends RuntimeException{
	
	String s1,s2,s3,s4;
	Date d;
	public ErrorDetails(Date d,String s1, String s2, String s3, String s4) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.d = d;
	}

	
	
	

}
