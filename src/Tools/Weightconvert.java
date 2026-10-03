package Tools;

import java.util.Scanner;

public class Weightconvert {
    double weight;
    double newWeight;
    String userInput;

    public void kgstolbs (Scanner scanner) {
        while (true) {
            System.out.print("Enter weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs: %.2f%n",  newWeight);
            System.out.println("\nContinue? (y/n): ");
            userInput = scanner.next().toLowerCase();
            if (userInput.equals("y")) {
                continue;
            }
            else if (userInput.equals("n")) {
                return;
            }
        }
    }
    public void lbstokgs (Scanner scanner) {
        while (true) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.621371192;
            System.out.printf("Weight in lbs: %.2f%n",  newWeight);
            System.out.println("\nContinue? (y/n): ");
            scanner.nextLine();
            userInput = scanner.next().toLowerCase();
            if (userInput.equals("y")) {
                continue;
            }
            else if (userInput.equals("n")) {
                return;
            }
        }
    }
    public void gramstokgs (Scanner scanner) {
        while (true) {
            System.out.print("Enter weight in grams: ");
            weight = scanner.nextDouble();
            newWeight = weight / 1000;
            System.out.printf("New weight in Kilograms: %.2f%n",newWeight);
            System.out.println("\nContinue? (y/n): ");
            userInput = scanner.next().toLowerCase();
            if (userInput.equals("y")) {
                continue;
            }
            else if (userInput.equals("n")) {
                return;
            }
        }
    }
    public void kgstotonner (Scanner scanner) {
        while (true) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 1000;
            System.out.printf("New weight in Tonners: %.2f%n",newWeight);
            System.out.println("\nContinue? (y/n): ");
            userInput = scanner.next().toLowerCase();
            if (userInput.equals("y")) {
                continue;
            }
            else if (userInput.equals("n")) {
                return;
            }
        }
    }

    public void run(Scanner scanner) throws InterruptedException {
        while (true) {
            String[] weights = {
                    "1.] Kilograms to Pounds",
                    "2.] Pounds to Kilograms",
                    "3.] Grams to Kilograms",
                    "4.] Kilograms to Tonner",
                    "5.] Return to Main Menu"
            };
            for (String weight : weights) {
                System.out.println(weight);
                Thread.sleep(500);
            }
            System.out.print(">: ");
            userInput = scanner.next();

            switch (userInput) {
                case "1":
                    kgstolbs(scanner);
                    break;
                case "2":
                    lbstokgs(scanner);
                    break;
                case "3":
                    gramstokgs(scanner);
                    break;
                case "4":
                    kgstotonner(scanner);
                    break;
                case "5":
                    return;
            }
        }
    }
}
