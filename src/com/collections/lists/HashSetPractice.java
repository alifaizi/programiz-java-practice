package com.collections.lists;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		
		HashSet <Integer> id = new HashSet <>();
		
		id.add(5);
		id.add(10);
		id.add(15);
		id.add(20);
		id.add(10);
		
		System.out.println(id);
		// No order in printing
		// No duplicate printing
		
		id.size();
		System.out.println(id);
		
		
		
		
	}

}
