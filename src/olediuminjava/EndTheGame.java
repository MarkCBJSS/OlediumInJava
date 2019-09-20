package olediuminjava;

import characterManagement.CreateUpdateCharacterSheet;

public class EndTheGame {
    
    public static void recordStatsAndQuit() {    
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
        CreateUpdateCharacterSheet.createUpdateTheStatsSheet();
        CoreValues.isPlayerAlive = false;
    }
}