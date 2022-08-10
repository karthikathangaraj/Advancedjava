package com.list;

import java.util.HashMap;
import java.util.Map;

public class map {
	public static void main(String args[])
    {
		Map<Integer,StringBuffer> m1=new HashMap<Integer,StringBuffer>();
		HashMap<String, Integer> map = new HashMap<>();
		Map<Integer, String> hm1 = new HashMap<>();
		m1.put(1, new StringBuffer("anu"));
		m1.put(2,new StringBuffer("anu"));
		m1.put(3,new StringBuffer("anu"));
		m1.put(4,new StringBuffer("anu"));
		m1.put(5,new StringBuffer("anu"));
		m1.put(2,new StringBuffer("karthika thangaraj"));
		Map<Integer,String> m2=new HashMap<>();
		m2.put(1, "abs");
		
		HashMap<Integer,String> h2=new HashMap<Integer,String>(m2);
		System.out.println(m1); 
		System.out.println(m1.keySet());
		System.out.println(m1.values());
    }

}
