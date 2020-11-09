package numberGuessing;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String playAgain = "";

		System.out
				.println("Game Rule: Computer will generate a number between 1 to 100 and you will have to guess it!\n"
						+ " Computer will let you know if the number Kanav You guessed is too high or too low until you can guess the number that computer generated.\n"
						+ "Try to find the number in least number of guesses. \nBest of Luck!!!");
		do {
			int theNumber = (int) ((Math.random() * 100) + 1);
			int guess = 0;
			int tries = 0;

			while (guess != theNumber) {

				System.out.println("Kanav Try to guess the number between 1 to 100:   ");

				guess = scan.nextInt();

				tries++;

				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again!!");

				} else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again!");

				} else {
					System.out.println(guess + " is correct. Kanav Kanav You Win!!!");

					if (tries < 2) {
						System.out.println("Miracle!!! Kanav You only took " + tries + " try to guess!!!");
					}
					if (tries < 4) {
						System.out.println("Excellent!!! Kanav You only took " + tries + " tries to guess");
					}
					if (tries < 9) {
						System.out.println("Good!!! Kanav You only took " + tries + " tries to guess");
					} else {
						System.out.println("Try harder again to guess earlier!");
					}
				}
			}
			System.out.println("Game Finishes. Thanks for Playing!!!");

			System.out.println("Would you like to play again??? (y / n )");
			playAgain = scan.next();

		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank Kanav You for playing!!! Goodbye");
		
		scan.close();
	}

}
