package com.arraylist;

import java.util.ArrayList;

public class addall {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(300); 
		for(Integer i:a1)
		{
			System.out.println(i);
		} 
		System.out.println();
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30); 
		for(Integer i:a2)
		{
			System.out.println(i);
		} 
		System.out.println();
		a2.addAll(a1);
		for(Integer i:a2)
		{
			System.out.println(i);
		} 	
		ArrayList<Integer> c1=(ArrayList<Integer>)a2.clone(); 
		System.out.print(c1);
			
         boolean res=c1.contains(10);
         System.out.println(res);
         
         
	}

}
