package characterManagement;

import java.util.Scanner;

import gameText.SplashScreens;
import olediuminjava.CoreValues;
//import characterManagement.CreateUpdateCharacterSheet;
import helpers.CharacterStatMaker;

public class CreatePlayer {
    
    public static String generateNewPlayerCharacter() {    
        System.out.println("[LOG] Moved to generateNewPlayerCharacter()");
        SplashScreens.buildAHeroText();
        
        Scanner getPlayerName = new Scanner(System.in);
        System.out.println("\n    What's your Hero called?");
        CoreValues.thePlayerName = getPlayerName.nextLine();
        System.out.println("[LOG] Got the chacter name of: " + CoreValues.thePlayerName);
      
        // Generate starting stats
        CharacterStatMaker.generatePlayerHP();
        System.out.println("[LOG] Generated Player HP: " + CoreValues.playerCurrentHP + ".");

        CharacterStatMaker.generatePlayerSTR();
        System.out.println("[LOG] Generated Player STR: " + CoreValues.playerCurrentSTR + ".");

        CharacterStatMaker.generatePlayerSTA();
        System.out.println("[LOG] Generated Player STA: " + CoreValues.playerCurrentSTA + ".");        
        
        CharacterStatMaker.generatePlayerLUC();
        System.out.println("[LOG] Generated Player LUC: " + CoreValues.playerCurrentLUC + ".");
        
        // Set-up an instance of the Character Inventory
        
        // Set-up an instance of the Character Backpack
        
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
        
        return CoreValues.thePlayerName;
    }
    
}