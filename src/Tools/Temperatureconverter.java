package Tools;

import java.util.Scanner;

public class Temperatureconverter {
    double temp;
    double newTemp;
    String unit;

    public void run(Scanner input) {
        while (true) {
            System.out.println("Enter temperature: ");
            temp = input.nextDouble();
            input.nextLine();
            System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
            unit = input.nextLine();

            newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9 ) + 32;
            System.out.printf("New Temperature: %.2f°%s%n", newTemp,  unit);
            System.out.println("Continue? (y/n): ");
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("y")) {
                continue;
            }
            if (userInput.equalsIgnoreCase("n")) {
                return;
            }
        }
    }
}