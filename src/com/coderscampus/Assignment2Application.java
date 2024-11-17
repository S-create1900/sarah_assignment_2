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
		int theRandomNumber = rand.nextInt(100) + 1;
//		cheating to know random # to check if if/else statements are working correctly &  Put this after final guess
//		System.out.println("Random number is " + theRandomNumber); 
		
		int attempts = 0; // counter for attempts
		int maxAttempts = 5;
		Integer lowerBound = 1;
		Integer upperBound = 100;

//  Prompt user to enter their guess = System,out.println("");  string
		System.out.println("Welcome! Willing to try your luck?");
		System.out.println("Pick a number between 1 and 100:");

//  Adding a while loop: do not put the random # generation within the while loop to maintain the same random number between guesses.
		while (attempts < maxAttempts) {

//Get a numeric guess from user, and store that in a variable into playerGuess.
			int playerGuess = scanner.nextInt();

// If the number chosen is outside of this range, then an error message should be displayed.
//an invalid input should not affect the number of guesses the player has left (so do not remove a guess from the 
//player if they enter a number outside of the 1 - 100 range)
			if (playerGuess < lowerBound || playerGuess > upperBound) {
				System.out.println(
						"Your guess is not between " + lowerBound + " and " + upperBound + ", please try again.");
				continue;
			}

			attempts++;

// Now we need to determine if the playerGuess is higher or lower than the Random # using if/else statements.

			if (playerGuess == theRandomNumber) {
				System.out.println("You win!");
				break; // Stops the game if winning # is picked.
			}

// the game is over and the outputted message should read “You lose, the number to guess was theRandomNumber” 
//		(where theRandomNumber is the actual value of the variable generated at the beginning of the game)

			if (attempts == maxAttempts) {
				System.out.println("You lose,");
				System.out.println("the number to guess was: " + theRandomNumber);

// if not on the final attempt, give feedback to pick higher or lower
			} else if (playerGuess < theRandomNumber) {
				System.out.println("Please pick a higher number");
			} else {
				System.out.println("Please pick a lower number");
			}
		}
		scanner.close();
	}
}

