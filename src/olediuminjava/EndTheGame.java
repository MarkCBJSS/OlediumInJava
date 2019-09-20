package olediuminjava;

import characterManagement.CreateUpdateCharacterSheet;

public class EndTheGame {
    
    public static void recordStatsAndQuit() { 
        System.out.println("Thanks for playing, " + CoreValues.thePlayerName + ".");
        System.out.println("         o**{====>   <====}**o");
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
        CreateUpdateCharacterSheet.createUpdateTheStatsSheet();
        CoreValues.isPlayerAlive = false;
    }
}