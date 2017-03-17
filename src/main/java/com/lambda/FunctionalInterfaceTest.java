package com.lambda;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		DateFormatter dateformatter = (input) -> {
			
			DateTime dt = DateTime.parse(input, DateTimeFormat.forPattern("MMddyyyy"));
			String dateStr = dt.toString("dd/MMM/yyyy");
			 
			return dateStr;
		};
		
		String date = dateformatter.format("03182017");
		
		System.out.format("Date pattern %s -> %s", "MMddyyyy", date);
		
	}

}
