package com.demojack;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	public static void main(String[] a)
    {
    Demojack dj=new Demojack();
    dj= getObjectData(dj);
    
    ObjectMapper Obj = new ObjectMapper();
    try {
    	String json =Obj.writeValueAsString(dj);
    	System.out.println(json);
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    }
    public static Demojack getObjectData(Demojack dj)
    {
    	
    dj.setComapnayName("infosys");
    dj.setDesp("a leading comapany");
    dj.setNoofemo(1000);
    return dj;
    	
    }

}
