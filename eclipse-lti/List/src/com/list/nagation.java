package com.list;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class nagation {
	
	public static void main(String[] args)
    {
       NavigableSet<String> t1=new TreeSet<>(); 
       TreeSet<Integer> t2=new TreeSet();
       t1.add("abs");
       t1.add("banu");
       t1.add("abi");
       t1.add("nani");
       t1.add("kl");
       t1.pollLast();
       System.out.println(t1.first());
       System.out.println(t1.last());
       
       Set<StringBuffer> t4=new TreeSet<>();
       
       t4.add(new StringBuffer("kartika"));
       
       TreeSet<Integer> t5=new TreeSet<Integer>();
       t5.add(9);
       t5.add(10);
       t5.add(89);
       t5.add(1);
       t5.add(2);
       t5.add(3);
       t5.add(4);
       t5.add(5);
       System.out.println(t5);
      t5=(TreeSet<Integer> )t5.tailSet(2);
      System.out.println(t5);
       
    }

}
