package helpers;

import java.util.Scanner;
import olediuminjava.CoreValues;

public class KeyCommands {
    
    public static int randomStat;
    
// Used to hold a player at a certain point
    public static void waitForEnterKey() {
        Scanner getEnterKey = new Scanner(System.in);
        System.out.println("\n    Press [ENTER] to continue...");
        getEnterKey.nextLine();
    }
    
// Gets the next action from the Player
    public static String whatDoYouWantToDoNext() {
        Scanner getNextAction = new Scanner(System.in);
        System.out.println("\n          What do you want to do next? ");
        System.out.println("          ----------------------------");
        CoreValues.theNextAction = getNextAction.nextLine();
        return CoreValues.theNextAction;
    }
    
// Generates a random stat when making the character
    public static int statMaker(int max_stat) {
        int randomStat = (int)(Math.random() * max_stat + 1);
        System.out.println("[LOG] Returning randomStat which is: " + randomStat);
        return randomStat;
    }

}