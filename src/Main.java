import Games.GameMenu;
import Tools.Calculator;
import Tools.Temperatureconverter;
import Tools.Weightconvert;
import sounds.SoundManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Temperatureconverter tempconvert = new  Temperatureconverter();
        GameMenu gameMenu = new GameMenu();
        Weightconvert weight = new Weightconvert();
        SoundManager sound = new SoundManager();
        SoundManager sound2 = new SoundManager();


        String userinput;
        sound.loadsound("C:\\Users\\User\\javaStuff2folder\\javaStuff2\\src\\sounds\\menuSounds\\gabester_fallmountain-menumusic.wav");
        sound2.loadsound("C:\\Users\\User\\javaStuff2folder\\javaStuff2\\src\\sounds\\menuSounds\\select.wav");

        while (true) {
            sound.play();
            Thread.sleep(2400);
            System.out.println(" ----- { [Multi Tool v0.4] } -----\n");
            Thread.sleep(1900);
            System.out.println("  ======= OPTIONS ======\n");
            String[] choices = {
                    "1.] Calculator",
                    "2.] Temperature converter",
                    "3.] Weight converter",
                    "4.] Games",
                    "5.] Exit"
            };
            for (String choice : choices) {
                System.out.println(choice);
                Thread.sleep(500);
            }
            System.out.print(">: ");
            userinput = input.next();

            switch (userinput) {
                case "1":
                    sound.stop();
                    sound2.play();
                    Thread.sleep(500);
                    calculator.run(input);
                    continue;
                case "2":
                    sound.stop();
                    sound2.play();
                    Thread.sleep(500);
                    tempconvert.run(input);
                    continue;
                case "3":
                    sound.stop();
                    sound2.play();
                    Thread.sleep(500);
                    weight.run(input);
                    continue;
                case "4":
                    sound.stop();
                    sound2.play();
                    Thread.sleep(500);
                    gameMenu.run();
                    continue;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
            input.close();
        }
    }
}