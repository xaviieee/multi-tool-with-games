package Tools;
import java.util.ArrayList;
import java.util.Scanner;

public class Notes {
    ArrayList<String> note = new ArrayList<>();

    public void takeNotes(Scanner sc){
        String user;
        System.out.print("Enter Note>: ");
        user = sc.nextLine();
        note.add(user);
        System.out.println(">> Note Saved!");
        System.out.println(note.toString());
        System.out.println("(note: in order to delete a note, you need to enter " +
                "its assigned index number (1 - 10 for example). It is supposed to start at zero but" +
                "for easier use— it is set at starting point 1.)");
    };
    public void deleteNotes(Scanner sc){
        String UserInput;
        System.out.print("Enter Note>: ");
        UserInput = sc.nextLine();
        if (UserInput.isEmpty()){
            System.out.println("Notes are empty!");
            return;
        }
        try {
            int userIndex = Integer.parseInt(UserInput);
            int targetIndex = userIndex - 1;
            if (targetIndex >= 0 && targetIndex < note.size()) {
                note.remove(targetIndex);
                System.out.println(">> Note deleted!" + note);
            }
            else  {
                System.out.println(">> Error: Number out of range! ");
            }
        }
        catch (NumberFormatException e) {
            System.out.println(">> Error: Please enter a number between 1 and 10");
        }
    }
    public void viewNotes(Scanner sc){
        if (note.isEmpty()){
            System.out.println(">> There are no notes to view!");
        }
        else {
            for (int i = 0; i < note.size(); i++){
                System.out.println(note.get(i));
            }
        }
        System.out.println("--------------------------");
    }
    public void run(Scanner sc) throws InterruptedException{
        String choice;
        while(true){
            String[] selections = {
                    "1. Add note",
                    "2. Delete note",
                    "3. View note",
                    "4. Return to main menu",
            };
            for (String selection : selections){
                System.out.println(selection);
                Thread.sleep(500);
            }
            System.out.print(">: ");
            choice = sc.nextLine();

            switch (choice){
                case "1":
                    takeNotes(sc);
                    break;
                case "2":
                    deleteNotes(sc);
                    break;
                case "3":
                    viewNotes(sc);
                    break;
                case "4":
                    return;
            }
        }
    }
}
