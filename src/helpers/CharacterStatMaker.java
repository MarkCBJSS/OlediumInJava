/*
    // Core Character Stats
    public static int playerMaxHp = 100;  // Hit points (HP)
    public static int playerCurrentHp;    // HP of the player once the game is underway
    public static int playerMaxSp = 50;   // Stamina points (SP)
    public static int playerCurrentSp;    // SP of the player once the game is underway
    public static int playerMaxLp = 10;   // Luck points (LP)
    public static int playerCurrentLp;    // LP of the player once the game is underway
 */
package helpers;

import olediuminjava.CoreValues;
import helpers.CharacterStatMaker;
import helpers.KeyCommands;

public class CharacterStatMaker {
    
    public static void generatePlayerHP() {
        CoreValues.playerCurrentHp = KeyCommands.statMaker(CoreValues.playerMaxHp);
        //CoreValues.playerCurrentHp = KeyCommands.randomStat;
    }
    
    public static void generatePlayerSP() {
        
    }
    
    public static void generatePlayerLP() {
        
    }
    
}
