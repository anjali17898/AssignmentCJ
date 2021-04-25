package com.colleaction.demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Friends {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Anjali");
		al.add("Ram");
		al.add("Shyam");
		al.add("pallavi");
		al.add("Ashi");

		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			String name = (String) li.next();
			System.out.println(name.toUpperCase());
		}

		System.out.println("=============================");
		while (li.hasPrevious()) {
			String name = (String) li.previous();
			System.out.println(name.toUpperCase());
		}

	}
}