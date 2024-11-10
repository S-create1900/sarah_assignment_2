package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
// Need a random # & add as import java.util.Random
	Random rand = new Random();

//Accept user input  - add as import java.util.scanner
	Scanner scanner = new Scanner(System.in);
	
// Create a variable to hold the Random #.  Need to add 1 to ensure range is from 1 - 100 and not 0-99.	
	int randomNumber = rand.nextInt(100) + 1;
	
	int attempts = 0;     // counter for attempts
	int maxAttempts = 5;  // Set the maximum number of attempts


//  Prompt user to enter their guess = System,out.println("");  string
	System.out.println("Welcome, Willing To Try Your Luck?");
	System.out.println("Pick a number between 1 and 100:");
	
//  Adding a while loop: do not put the random # generation within the while loop to maintain the same random number between guesses.
	while(attempts < maxAttempts) {
		attempts++;
//	
	
//Get a numeric guess from user, and store that in a variable into playerGuess.
	int playerGuess = scanner.nextInt();

	
// Now we need to determine if the playerGuess is higher or lower than the Random # using if/else statements.

	if (playerGuess == randomNumber) {
		System.out.println("You win!");
		break;	// Stops the game if winning # is picked.
		}
		
	if (attempts == maxAttempts) {
	    System.out.println("You lose, the number to guess was: " + randomNumber);
// if not on the final attempt, give feedback to pick higher or lower	
	}else if (playerGuess < randomNumber) {
		System.out.println("Please pick a higher number");
	}else{
		System.out.println("Please pick a lower number");
	}
	}
	scanner.close();
	}
}


//cheating to know random # to check if if/else statements are working correctly &  Put this after final guess
//	System.out.println("Random number is " + randomNumber);