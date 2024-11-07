package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
// Defining Details of Range:
		int lowerBound = 1;
		int upperBound = 100;

//  To use console
		System.out.println("\nEnter a number");
		int number = scanner.nextInt();
		
//  Code converts String to integer:
		Integer number = Integer.parseInt(number);
		
//  Generate random # code	
		
// Use if/else statements to determine if # is in range w/ # or not result depends on the random number.
//  
//	1. 	If pick random #: "You win!"
		if (number >= lowerBound && random <= upperBound, + random) {

			System.out.println("You win!");
			} else {
			System.out.println("The number you typed in was: null");
			}

//	2. 	If pick # higher than random #: "Please pick a lower number"
//	3. 	If pick # lower than random #: 	"Please pick a higher number"
//	4.  If pick # out of range: "Your guess is not between 1 and 100, please try again."
//	5.  On 5th failed try: 	“You lose, the number to guess was theRandomNumber” 
		


//Close scanner
		scanner.close();
	}
	
}