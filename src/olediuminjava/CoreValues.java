package olediuminjava;

public class CoreValues {

    // Checks if the player has played before
    public static boolean returningPlayerStatus; // true = Played before, false = New Player
    
    // Character Name created at the start or pulled in from existing character sheet
    public static String thePlayerName;
    
    // Case value to manage game flow
    public static String theNextAction;

    // Check the player is still alive
    public static boolean isPlayerAlive = true; //false = dead, true = alive    
    
    // Core Character Stats
    public static int playerMaxHP = 100;  // Hit points (HP)
    public static int playerCurrentHP;    // HP of the player once the game is underway
    
    public static int playerMaxSTA = 50;   // Stamina points (STA)
    public static int playerCurrentSTA;    // SP of the player once the game is underway
    
    public static int playerMaxSTR = 50; // Strength points (STR)
    public static int playerCurrentSTR;   // STp of the player once the game is underway
    
    public static int playerMaxLUC = 20;   // Luck points (LUC)
    public static int playerCurrentLUC;    // LP of the player once the game is underway
    
    // Limits of Stats
    public static int maxAllowableHealth = 100; // No boosts can take base health above 100
    
}