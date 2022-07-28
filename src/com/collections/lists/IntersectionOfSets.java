package com.collections.lists;

import java.util.HashSet;

public class IntersectionOfSets {
	
	public static void main(String[] args) {
		
		// Program to find the common elements in both sets
		
		// Set 1

		HashSet <Integer> numbers = new HashSet <>();
		
		numbers.add(2); // number 2
		numbers.add(4);
		numbers.add(6);
		
		numbers.size();
		
		System.out.println("Set 1: " + numbers);
		
		// Set 2
		
		HashSet <Integer> primeNumbers = new HashSet <>();
		
		primeNumbers.add(2); // duplicate number 2 
		primeNumbers.add(3);
		primeNumbers.add(5);
		
		primeNumbers.size();
		
		System.out.println("Set 2: " + primeNumbers);
		
		// Intersection of both sets 
		
		numbers.retainAll(primeNumbers);
		
		System.out.println("Intersection of two sets: " + numbers); 
		
		// Printed only number 2 as it is the only common element in both sets
		
		
	}

}

