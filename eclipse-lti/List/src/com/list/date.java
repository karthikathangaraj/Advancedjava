package com.list;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date {
	
	
	public static void local()
	{
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		
		LocalDateTime c1= LocalDateTime.now();
		System.out.println(c1);
		
		DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy  ss:mm:HH" );
		String f2=c1.format(f1);
		System.out.println(f2);
		
		LocalDate d4=LocalDate.of(2021,11,9);
		System.out.println(d4);
		
	}
	
	public static void main(String[] args)
	{
		local();
	}

}
