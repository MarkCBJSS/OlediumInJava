package characterManagement;

import java.util.Formatter;

import olediuminjava.CoreValues;

public class CreateUpdateCharacterSheet {
    
    public static void createUpdateTheCharacterSheet() {
        
        try {
            //Formatter f = new Formatter(CoreValues.locationOfCharacterSheet + "characterSheet.txt");
            Formatter f = new Formatter("characterSheet.txt");
            
            
            f.format("%s", "                 o**{====>   <====}**o                 \n\n");
            f.format("%s", "####################   CHARACTER   ####################\n");
            f.format("%s", "#                                                      \n");
            f.format("%s", "#  Character Name: " + CoreValues.thePlayerName + "    \n");
            f.format("%s", "#      Hit Points: " + CoreValues.playerCurrentHP + "  \n");
            f.format("%s", "#         Stamina: " + CoreValues.playerCurrentSTA + " \n");
            f.format("%s", "#        Strength: " + CoreValues.playerCurrentSTR + " \n");
            f.format("%s", "#            Luck: " + CoreValues.playerCurrentLUC + " \n");
            f.format("%s", "#                                                      \n");
            f.format("%s", "#######################################################\n");
            f.format("%s", "                                                       \n");
            f.format("%s", "####################   INVENTORY   ####################\n");
            f.format("%s", "#                                                      \n");
            f.format("%s", "#    Head:                                             \n");
            f.format("%s", "#   Chest:                                             \n");
            f.format("%s", "#    Arms:                                             \n");
            f.format("%s", "#   Hands:                                             \n");            
            f.format("%s", "#    Legs:                                             \n");            
            f.format("%s", "#    Feet:                                             \n");
            f.format("%s", "#   Charm:                                             \n");            
            f.format("%s", "#                                                      \n");
            f.format("%s", "#######################################################\n");
            
            f.close();
            
        } catch(Exception e) {
            System.out.println("[LOG] Error with in createUpdateCharacterSheet()");
        }
        
    }
    
        public static void createUpdateTheStatsSheet() {
        
        try {
            //Formatter f = new Formatter(CoreValues.locationOfCharacterSheet + "characterSheet.txt");
            Formatter f = new Formatter("statsSheet.log");            
            
            f.format("%s", CoreValues.thePlayerName + "\n");
            f.format("%s", CoreValues.playerCurrentHP + "\n");
            f.format("%s", CoreValues.playerCurrentSTA + "\n");
            f.format("%s", CoreValues.playerCurrentSTR + "\n");
            f.format("%s", CoreValues.playerCurrentLUC + "\n");
            
            f.close();
            
        } catch(Exception e) {
            System.out.println("[LOG] Error with in createUpdateTheStatsSheet()");
        }
        
    }
}