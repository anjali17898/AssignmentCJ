package com.vector.demo;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String>v=new Vector<>();
		
			v.add("A");
			v.add("B");
			v.add("C");
			v.add("D");
			v.add("B");
			v.add("E");
			v.add("A");
			v.add("I");
			v.add("K");
			
			System.out.println("elements present: "+v.size());
			System.out.println(v);
			for(int i=0;i<v.size();i++) {
				System.out.println(v.get(i));
			}
			for(Object o:v) {
				System.out.println(o);
			}
			v.set(7, "Z");
			System.out.println(v);
			Collections.sort(v);
			System.out.println(v);
			
			
			
			
		
	}

}
