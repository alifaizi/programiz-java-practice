package com.collections.lists;

import java.util.HashSet;

public class UnionOfSetsInHashSet {

	public static void main(String[] args) {
		
		// Program to find the union of two sets with no duplication

		// Set 1
		HashSet<Integer> numbers = new HashSet<>();

		numbers.add(2); // number 2
		numbers.add(4);
		numbers.add(6);

		numbers.size();

		System.out.println("Set 1: " + numbers);

		// Set 2
		HashSet<Integer> primeNumbers = new HashSet<>();

		primeNumbers.add(2); // duplicate number 2
		primeNumbers.add(3);
		primeNumbers.add(5);

		primeNumbers.size();

		System.out.println("Set 2: " + primeNumbers);

		// Union of two sets

		numbers.addAll(primeNumbers);

		System.out.println("Unione of two sets: " + numbers);

		// Printed only one "2" as HashSet does not support duplicate numbers

	}

}
