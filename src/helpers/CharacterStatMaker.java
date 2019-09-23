package helpers;

import olediuminjava.CoreValues;

public class CharacterStatMaker {
    
    public static void generatePlayerHP() {
        CoreValues.playerCurrentHP = KeyCommands.statMaker(CoreValues.playerMaxHP);
    }
    
    public static void generatePlayerSTR() {
        CoreValues.playerCurrentSTR = KeyCommands.statMaker(CoreValues.playerMaxSTR);
    }

    public static void generatePlayerSTA() {
        CoreValues.playerCurrentSTA = KeyCommands.statMaker(CoreValues.playerMaxSTA);
    }    
    
    public static void generatePlayerLUC() {
        CoreValues.playerCurrentLUC = KeyCommands.statMaker(CoreValues.playerMaxLUC);
    }
    
}