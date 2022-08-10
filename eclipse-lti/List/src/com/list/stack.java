package com.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack s1=new Stack(); 
		Queue<Integer> q1=new LinkedList<>();
		
		
		
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.remove();
		System.out.println(q1);
		
		
		
		
		
		
		s1.push(3);
		s1.push("karthika");
		s1.push(true);
		s1.pop();
		System.out.println(s1); 
		System.out.println(s1.peek()); 
		System.out.println(s1.search("karthikaaaa"));

	}

}
