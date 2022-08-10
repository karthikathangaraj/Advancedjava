package com.list;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class pd {

public static void checking()
{
	LocalDate date1 = LocalDate.now();
	
	LocalDate d2=LocalDate.of(2020, Month.JULY, 8);
	
	 Period gap=Period.between(d2, date1);
	 System.out.println(gap);
	 
	 
	 LocalTime time1 = LocalTime.now(); 
	 
	 Duration d1=Duration.ofHours(10); 
	 LocalTime time2 = LocalTime.now(); 
	 
	 LocalTime t3=time2.plus(d1); 
	 System.out.println(d1);
	 System.out.println(t3);
	 
	 
	 
}
	public static void main(String[] args) {
		checking();

	}

}
