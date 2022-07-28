package com.java.practice;

import java.util.Scanner;

public class OmidPracticeCode {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter the number of Subject: ");
		
		int subject = s.nextInt();
		float [] score = new float[subject];
		for(int x = 0; x < subject; x++) {
			System.out.print("Enter a mark: ");
			score[x] = s.nextFloat();
		}// to find the total of sum
		float totalSum=0;
		for (int x = 0;  x <subject; x++) {
			totalSum += score[x];
			
			s.close();
		}
		System.out.println("Sum of Total Subject is: " + totalSum);
		System.out.println("Avarage subject score: " + (totalSum/subject));
		
		// to find the biggest or the maximum number
		float max = score[0];
		for(int x = 0; x < subject; x++) {
			if(score[x] > max) {
				max= score[x];
			} 
		}
		System.out.println("The biggest number is: " + max);
		
		// to find the Minimum or smallest number
		float minimum = score[0];
		for (int x = 0; x < subject; x++) {
			if(score[x] < minimum) {
				minimum = score[x];
			}
		}
		
		System.out.println("The smallist number is: " + minimum);
	}

}
