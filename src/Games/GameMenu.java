package Games;

import Games.typesgames.NumberGuess;

import java.util.Scanner;

public class GameMenu {
    public void run() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        NumberGuess run =  new NumberGuess();
        String userInput;

        gamesMenu:
        while (true) {
            System.out.println("---- Games ----");
            String[] selection = {
                    "1.] Number Guess",
                    "2.] Hangman",
                    "3.] Quiz Game",
                    "4.] Rock Paper Scissors",
                    "5.] Dice Roller",
                    "6.] Return to Main Menu"
            };
            for (String s : selection) {
                System.out.println(s);
                Thread.sleep(500);
            }
            System.out.print(">: ");
            userInput = scanner.next();

            switch (userInput) {
                case "1":
                    run.running(scanner);
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                     break gamesMenu;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
