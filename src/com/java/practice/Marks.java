package com.java.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

		double subject1 = 0, subject2 = 0, subject3 = 0, subject4 = 0, subject5 = 0;

		boolean flag;

		Scanner userInput = new Scanner(System.in);

		System.out.println("MARKS SHEET");
		
		System.out.println();
		
		System.out.println("This program takes marks for 5 subjects (Mathematics, "+"\n"
				+ "Science, Social Studies, History, Language Art) from "+"\n"
				+ "the user and returns the total marks, percentage, highest mark, "+"\n"
				+ "average and grade obtained by the student");
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println();
		

		do {
			System.out.println("Enter the marks for Mathmatics: ");
			if (userInput.hasNextDouble()) {
				subject1 = userInput.nextDouble();

				flag = true;

			} else {
				System.err.println("I don't understand you!");
				flag = false;

				userInput.next();
			}

		} while (!(flag));

		if (subject1 < 0 || subject1 > 100) {
			System.err.println("Values must be equal or less than 100!");
		} else {

			do {
				System.out.println("Enter the marks for Science: ");
				if (userInput.hasNextDouble()) {
					subject2 = userInput.nextDouble();
					flag = true;

				} else {
					System.err.println("I don't understand you!");
					flag = false;

					userInput.next();

				}

			} while (!(flag));

			if (subject2 < 0 || subject2 > 100) {
				System.err.println("Values must be equal or less than 100!");
			} else {

				do {
					System.out.println("Enter the marks for Social Studies: ");
					if (userInput.hasNextDouble()) {
						subject3 = userInput.nextDouble();
						flag = true;

					} else {
						System.err.println("I don't understand you!");
						flag = false;

						userInput.next();

					}

				} while (!(flag));

				if (subject3 < 0 || subject3 > 100) {
					System.err.println("Values must be equal or less than 100!");
				} else {

					do {
						System.out.println("Enter the marks for History: ");
						if (userInput.hasNextDouble()) {
							subject4 = userInput.nextDouble();
							flag = true;

						} else {
							System.err.println("I don't understand you!");
							flag = false;

							userInput.next();

						}

					} while (!(flag));

					if (subject4 < 0 || subject4 > 100) {
						System.err.println("Values must be equal or less than 100!");
					} else {

						do {
							System.out.println("Enter the marks for Language Art: ");
							if (userInput.hasNextDouble()) {
								subject5 = userInput.nextDouble();
								flag = true;

							} else {
								System.err.println("I don't understand you!");
								flag = false;

								userInput.next();

							}

						} while (!(flag));

						if (subject5 < 0 || subject5 > 100) {
							System.err.println("Values must be equal or less than 100!");
						} else {

							System.out.println("\n");
							System.out.println("---> Your result is: ");
							System.out.println();
						}

						userInput.close();

						if (subject1 < 40) {

							System.err.println("You are failed in Mathematics!");

							System.out.println(
									"You have scored " + subject1 + " in Mathematics. The passing number is 40.");

							System.out.println("\n");

						} else {

							System.out.println("Your Mathematics marks is: " + subject1);
						}

						if (subject2 < 40) {

							System.err.println("You are failed in Science!");
							System.out
									.println("You have scored " + subject2 + " in Science. The passing number is 40.");

							System.out.println("\n");

						} else {

							System.out.println("Your Science marks is: " + subject2);
						}

						if (subject3 < 40) {

							System.out.println("\n");

							System.err.println("You are failed in Social Studies!");
							System.out.println(
									"You have scored " + subject3 + " in Scocial Studies. The passing number is 40.");

							System.out.println("\n");

						} else {

							System.out.println("Your Social Studies marks is: " + subject3);
						}

						if (subject4 < 40) {

							System.out.println("\n");

							System.err.println("You are failed in History!");
							System.out.println(
									"You have scored " + subject4 + " in History. The passing number is 40.");

							System.out.println("\n");

						} else {

							System.out.println("Your History marks is: " + subject4);
						}

						if (subject5 < 40) {

							System.out.println("\n");

							System.err.println("You are failed in Language Art!");
							System.out.println(
									"You have scored " + subject5 + " in Language Art. The passing number is 40.");

							System.out.println("\n");

						} else {

							System.out.println("Your Language Art marks is: " + subject5);
						}

						if ((subject1 >= 40 && subject1 <= 100) && (subject2 >= 40 && subject2 <= 100)
								&& (subject3 >= 40 && subject3 <= 100) && (subject4 >= 40 && subject4 <= 100)
								&& (subject5 >= 40 && subject5 <= 100)) {

							System.out.println();

							System.out.println("---> Your complete report is as below:");

							System.out.println();

						} else {

							System.out.println("\n");

							System.out.println("You are failed!: ");

							System.out.println("\n");
						}

						// Total of

						double totalMarksOfFiveSubs = subject1 + subject2 + subject3 + subject4 + subject5;

						// System.out.println("Total marks of the five subjects: " +
						// totalMarksOfFiveSubs);

						DecimalFormat dp = new DecimalFormat("#.###");
						System.out.println("Total marks obtained: " + dp.format(totalMarksOfFiveSubs));

						System.out.println("----------------------");

						// Percentage

						double percentage = totalMarksOfFiveSubs / 500 * 100;

						DecimalFormat df = new DecimalFormat("#.##");

						// System.out.println("Percentage: " + "%" + percentage);

						System.out.println("Percentage obtained: " + "%" + df.format(percentage));

						System.out.println("----------------------");

						// Highest marks

						if (subject1 > subject2 && subject1 > subject3 && subject1 > subject4 && subject1 > subject5) {

							System.out.println("Highest mark obtained: " + subject1);

							System.out.println("----------------------");

						} else if (subject2 > subject1 && subject2 > subject3 && subject2 > subject4
								&& subject2 > subject5) {

							System.out.println("Highest mark obtained: " + subject2);

							System.out.println("----------------------");

						} else if (subject3 > subject1 && subject3 > subject2 && subject3 > subject4
								&& subject3 > subject5) {

							System.out.println("Highest mark obtained: " + subject3);

							System.out.println("----------------------");

						} else if (subject4 > subject1 && subject4 > subject2 && subject4 > subject3
								&& subject4 > subject5) {

							System.out.println("Highest mark obtained: " + subject4);

							System.out.println("----------------------");

						} else {

							System.out.println("Highest mark obtained: " + subject5);

							System.out.println("----------------------");

						}

						// Average

						double averageMarks = totalMarksOfFiveSubs / 5;

						// System.out.println("Average marks: " + averageMarks);

						DecimalFormat dPA = new DecimalFormat("#.###");
						System.out.println("Average marks obtained: " + dPA.format(averageMarks));

						System.out.println("----------------------");

						// Remarks

						if (percentage < 40 || subject1 < 40 || subject2 < 40 || subject3 < 40 || subject4 < 40
								|| subject5 < 40) {

							System.err.println("Remarks: You are failed!");

							System.out.println("----------------------");

						} else if (percentage >= 40 && percentage <= 50) {

							System.out.println("Your grade is: " + "\"D\"");

							System.out.println("You ar passed but you need to work hard");

							System.out.println("----------------------");

						} else if (percentage > 50 && percentage <= 60) {

							System.out.println("Your grade: " + "\"C\"");

							System.out.println("Good Job!");

							System.out.println("----------------------");

						} else if (percentage > 60 && percentage <= 80) {

							System.out.println("Your grade: " + "\"B\"");

							System.out.println("Great Job!");

							System.out.println("----------------------");

						} else if (percentage > 80 && percentage <= 90) {

							System.out.println("Your grade: " + "\"A\"");

							System.out.println("Excellent Job!");

							System.out.println("----------------------");

						} else if (percentage > 90 && percentage <= 100) {

							System.out.println("Your grade: " + "\"A+\"");

							System.out.println("Fantastic!");

							System.out.println("----------------------");

						} else {

							System.out.println("Try again!");
						}

					}
				}
			}
		}
	}
}
