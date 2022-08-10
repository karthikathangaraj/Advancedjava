package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class demo11 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("anu");
		names.add("vani");
		names.add("banu");
		names.add("vanitha");
		
		ArrayList<String> n1=new ArrayList<String>();
		n1.add("anu");
		n1.add("vani");
		n1.add("banu");
		n1.add("karthika");  
		Collections.sort(n1);
		System.out.println(n1);
		Collections.sort(n1,Collections.reverseOrder());
		System.out.println(n1);
		n1.retainAll(names); 
		 System.out.println(n1);
		 
		 ArrayList<Object> a3 =new ArrayList<Object>();
		 a3.add("karthika");
		 a3.add(true);
		 a3.add(90);
		 System.out.println(a3);
		 
		
		

	}

}
