package Tools;

import sounds.SoundManager;

import java.util.Scanner;

public class Calculator {
    double n1;
    double n2;
    double result;
    String operator;

    public void addition() {
        result = n1 + n2;
        System.out.println("= " + result);
    }
    public void subtraction() {
        result = n1 - n2;
        System.out.println("= " + result);
    }
    public void multiplication() {
        result = n1 * n2;
        System.out.println("= " + result);
    }
    public void division() {
        if (n2 == 0) {
            System.out.println("Cannot divide by zero");
        }
        else {
            result = n1 / n2;
            System.out.println("= " + result);
        }
    }
    public void easteregg(Scanner scanner) throws InterruptedException {
        SoundManager sound =  new SoundManager();
        SoundManager sound2 = new SoundManager();
        sound.loadsound("C:\\Users\\User\\javaStuff2folder\\javaStuff2\\src\\sounds\\narration.wav");
        sound2.loadsound("C:\\Users\\User\\javaStuff2folder\\javaStuff2\\src\\sounds\\swedish_rhapsody_reversed2.wav");
        String userInput;
        while (true) {
            String[] message = {
                    "...",
                    "It seems like you have found me...",
                    "...",
                    "I must admit that was pretty impressive of you.",
                    "But. You messed up big time.."
            };
            for (String messages : message) {
                System.out.println(messages);
                Thread.sleep(2500);
            }
            System.out.print(">: ");
            userInput = scanner.nextLine().toLowerCase();
            if (userInput.equals("y") || userInput.equals("who are you?")) {
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(2000);
                long endtime = System.currentTimeMillis() + 7000;
                while (System.currentTimeMillis() < endtime) {
                    System.out.println("01001001 01110100 01110011 00100000 01101001 01101110 00100000 01110100 01101000 01101001 01110011 00100000 " +
                            "01100011 01101111 01101101 01110000 01110101 01110100 01100101 01110010");
                    Thread.sleep(100);
                    break;
                }
            }
            else if (userInput.equals("n") || userInput.equals("what?") || userInput.equals("hello?")) {
                Thread.sleep(3000);
                System.out.println("you just saved youself from a wall of text.");
                break;
            }
            else {
                System.out.println("You must answer this riddle:");
                Thread.sleep(2000);
                System.out.println("I am weightless, but you can see me. If you put me in a bucket, I make the bucket lighter. " +
                        "What am I?");
            }
            Thread countdown = new Thread(() -> {
                for (int i = 10; i > 0; i--) {
                    System.out.println("Time left: " + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                System.out.println("Times up.");
                sound.play();
            });
                countdown.start();
                System.out.println("(You're answer)>: ");
                userInput = scanner.nextLine().toLowerCase();
                countdown.interrupt();
                if (userInput.equals("a hole") || userInput.equals("hole")) {
                    System.out.println("Correct. Alright you may go now.");
                    Thread.sleep(1000);
                    System.out.println("Bye.");
                    return;
                }
                else {
                    System.out.println("Wrong.");
                    Thread.sleep(1000);
                    sound2.play();
                    Thread.sleep(118000);
                    break;
                }
        }
    }
    public void run (Scanner scanner ) throws InterruptedException {
        while (true) {
            System.out.print("Enter 1st number (00 -> exit): ");
            n1 = scanner.nextDouble();
            scanner.nextLine();
            if (n1 == 00) {
                break;
            }
            else {
                System.out.print("Choose operator(+, -, *, /): ");
                operator = scanner.next();
                System.out.print("Enter 2nd number: ");
                n2 = scanner.nextDouble();

                switch(operator) {
                    case "+":
                        addition();
                        break;
                    case "-":
                        subtraction();
                        break;
                    case "*":
                        multiplication();
                        break;
                    case "/":
                        division();
                        break;
                    case "/12-@waq":
                        easteregg(scanner);
                        break;
                }
            }
        }
    }
}
