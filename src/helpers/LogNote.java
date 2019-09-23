package helpers;

import olediuminjava.CoreValues;

public class LogNote {

// CreatePlayer.java    
    public static String log000 = "[LOG]> Got the chacter name of: " + CoreValues.thePlayerName;    
    public static String log001 = "[LOG]> Player HP: " + CoreValues.playerCurrentHP;
    public static String log002 = "[LOG]> Player STR: " + CoreValues.playerCurrentSTR;
    public static String log003 = "[LOG]> Player STA: " + CoreValues.playerCurrentSTA;
    public static String log004 = "[LOG]> Player LUC: " + CoreValues.playerCurrentLUC;
 
// ReadFile.java
    public static String log005 = "[LOG]> I set the textData string array to the lines in the Statsfile";

// RunTheGame.java
    public static String log006 = "[LOG]> h and help - partially implemented.";
    public static String log007 = "[LOG]> a and attack - Yet to be implemented";
    public static String log008 = "[LOG]> f and flee - Yet to be implemented";
    public static String log009 = "[LOG]> s and search - Yet to be implemented";
    public static String log010 = "[LOG]> I didn't recognise that command. Try using 'h' or 'help'";    
}
