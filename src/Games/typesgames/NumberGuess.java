package Games.typesgames;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    Random number = new Random();
    int guess;

    public void running(Scanner scanner) {
        int randomNumber = number.nextInt(1, 11);
        int attempts = 0;
        System.out.println("Enter a number between 1 and 10: ");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again!");
            }
            else if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again!");
            }
            else{
                System.out.println("Correct! The number was: " + randomNumber);
                System.out.println("# of Attempts: " + attempts++);
            }
        }while (guess != randomNumber);
    }
}
