package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		//int a[]=new int[10];
		
		//int n=10;
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3); 
		a1.add(3,10);
		Iterator<Integer> it=a1.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		a1.forEach((n1)->System.out.println(n1));
	}
	

}
