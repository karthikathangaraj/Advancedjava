package com.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
public  @Data class car {
	private int carno;
	private @Setter String name;
		
	
}
