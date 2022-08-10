package com.list;

import java.util.Set;
import java.util.TreeSet;

/*
 * Java TreeSet class implements the Set interface that uses a tree for storage.
 * 
 * The important points about the Java TreeSet class are:
 * 
 * Java TreeSet class contains unique elements only like HashSet
 * Java TreeSet class access and retrieval times are quiet fast.
 * Java TreeSet class doesn't allow null element.
 */
public class treeset {

	public static void main(String[] args) {
		Set<String> t1=new TreeSet<>();
		t1.add("a");
		t1.add("a");
		t1.add("a");
		t1.add("b");
		t1.add("c");
		t1.add("c");
		System.out.println(t1);

	}

}
