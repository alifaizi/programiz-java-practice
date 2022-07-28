package com.collections.lists;

import java.util.LinkedList;

public class LinkedListAsQueue {

	public static void main(String[] args) {

		LinkedList <String> languages = new LinkedList<>();
		
		languages.add("Java");
		languages.add("C");
		languages.add("Python");
		languages.add("Java Script");
		
		System.out.println("List of languages: " + languages);
		
		// Remove an element from the front
		
		String str1 = languages.poll();
		
		System.out.println("Removed element from the front: " + str1);
		
		// Add element at the back 
		
		languages.offer("Java");
		System.out.println("Added element at the back " + languages);

	}

}
