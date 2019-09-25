package helpers;

import olediuminjava.CoreValues;

public class LogNote {

// CreatePlayer.java 
    public static String log011 = "[LOG 011] Moved to generateNewPlayerCharacter()";
    public static String log000 = "[LOG 000] Got the character name of: " + CoreValues.thePlayerName;    
    public static String log001 = "[LOG 001] Player HP: " + CoreValues.playerCurrentHP;
    public static String log002 = "[LOG 002] Player STR: " + CoreValues.playerCurrentSTR;
    public static String log003 = "[LOG 003] Player STA: " + CoreValues.playerCurrentSTA;
    public static String log004 = "[LOG 004] Player LUC: " + CoreValues.playerCurrentLUC;
 
// ReadFile.java
    public static String log005 = "[LOG 005] I set the textData string array to the lines in the Statsfile";
    
// FileData.java
    public static String log014 = "[LOG 014] I got the statsSheet.log file";
    public static String log015 = "[LOG 015] I printed the contents of the Stats file";

// RunTheGame.java
    public static String log006 = "[LOG 006] h and help - partially implemented.";
    public static String log007 = "[LOG 007] a and attack - Yet to be implemented";
    public static String log008 = "[LOG 008] f and flee - Yet to be implemented";
    public static String log009 = "[LOG 009] s and search - Yet to be implemented";
    public static String log010 = "[LOG 010] I didn't recognise that command. Try using 'h' or 'help'"; 
    
// CheckForExistingPlayer
    public static String log012 = "[LOG 012] A Stat Log Sheet already exists";
    public static String log013 = "[LOG 013] There's NO Stats Log Sheet";
    
// PlayerInventory.java
    public static String log016 = "[LOG 016] Displaying playerInventory items";
    
// CreatePlayerInventory
    public static String log017 = "[LOG 017] Running buildTheInventory()";
}