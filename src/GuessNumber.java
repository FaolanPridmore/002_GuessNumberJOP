import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessNumber {

	// "Field" Very Important is "Scope"
	// "Public" means any other class has access; usually BAD!
	// "Private" means only used inside of this class; usually this is very good!
	// "Protected" means can be used by any other class in this package
	private int lowerLimit = 0;
	private int upperLimit = 10;

	Random rand = new Random();
	Scanner keyboard = new Scanner(System.in);

	/*
	 * 1. set lower and upper bounds on the numbers, like 0 - 10 2. pick a random
	 * number in that range 3. start looping -- guess -- check for win -- if win
	 * congrats! -- if no win repeat -- set a guess limit, like after 5 tries game
	 * over
	 */
	public GuessNumber() {

		// placeholder, but essential - a constuctor reserves computer memory

	}// end of constuctor

	public void startGame() {

		// method scope
		Boolean gameRunning = true;
		int guess;
		int countLimit = 5;
		String startMsg = "";
		String startGuess = "";
		String showAnswer = "";
		String endGame = "";
		String endMsg = "";
		// get a new random number
		// example of "meth"od scope" -- can only exist in this method
		int answer = rand.nextInt(upperLimit) + lowerLimit;

		// upperLimit - 1 because it is exclusive, stops 1 number before
		// System.out.println("for test answer = " + answer);
		startMsg = "...for test answer = " + answer;
		JOptionPane.showMessageDialog(null, startMsg);

		// later: test for bounds

		// ok, check for win
		// PAY ATTENTION! == is a test operator, ALWAYS used in if's

		while (gameRunning && countLimit > 0) {
			//System.out.println("\nPlease enter your guess, between " + lowerLimit + " and " + (upperLimit - 1));
			startGuess = "\nPlease enter your guess, between " + lowerLimit + " and " + (upperLimit - 1);
			//JOptionPane.showMessageDialog(null, startGuess);
			guess = Integer.parseInt(JOptionPane.showInputDialog(startGuess));
			//System.out.println("\n guess= " + guess + "\n" );

			// test -- remove once everything is working corectly

			if (guess == answer) {
				showAnswer = "Congrats! You won!";
				JOptionPane.showMessageDialog(null, showAnswer);
				gameRunning = false;
			} else if (guess > answer) {
				showAnswer = "Sorry, your guess is to high";
				JOptionPane.showMessageDialog(null, showAnswer);
				

			} else if (guess < answer) {
				showAnswer = "\"Sorry, your guess is to low\"";
				JOptionPane.showMessageDialog(null, showAnswer);
				

			} else {
				showAnswer = "\"Whaaaat?? I don't understand\"";
				JOptionPane.showMessageDialog(null, showAnswer);
				

			}

			countLimit--; // count down by one -- "decrement"

		} // end while

		if (countLimit > 3) {
			endGame = "Whoa! You did AWESOME";
			JOptionPane.showMessageDialog(null, endGame);
		} else if (countLimit == 2 || countLimit == 3) {
			endGame = "You did really good";
			JOptionPane.showMessageDialog(null, endGame);
		} else if (countLimit == 1 || gameRunning == false) {
			endGame = "You barely made it!";
			JOptionPane.showMessageDialog(null, endGame);
		} else {
			endGame = "Sorry, You lost";
			JOptionPane.showMessageDialog(null, endGame);
		}

		endMsg = "All Done, CU later!";
		JOptionPane.showMessageDialog(null, endMsg);

	}// end of start game

}// end of class
