package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {
	
	
	public static void main(String[] args)
	{
		List<String> l1=new ArrayList<>();
		LinkedList<Integer> l2=new LinkedList<Integer>();
		
		l2.addLast(34);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.addFirst(90);
		
		l2.add(2,45);
		//l2.add(21, 300);
		System.out.println(l2);
		l2.remove();
		l2.removeLast();
		l2.remove(4);
		System.out.println(l2); 
		
		
	}

}
