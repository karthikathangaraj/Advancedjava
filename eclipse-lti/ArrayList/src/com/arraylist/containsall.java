package com.arraylist;

import java.util.ArrayList;

public class containsall {
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(10);
		a2.add(20);
		a2.add(30);
		//a2.add(300);
		System.out.print(a1.containsAll(a2));
		
	}

}
