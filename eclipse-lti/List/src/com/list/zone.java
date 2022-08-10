package com.list;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zone {
  
	public static void zone1()
	{
		ZonedDateTime c2=ZonedDateTime.now();
		
		System.out.println(c2.getZone());
		System.out.println(c2);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime t1=c2.withZoneSameInstant(tokyo);
		System.out.println(t1.getZone());
		
	
	}
	public static void main(String[] args) {
		zone1();

	}

}
