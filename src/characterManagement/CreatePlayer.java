package characterManagement;

import java.util.Scanner;

import gameText.SplashScreens;
import olediuminjava.CoreValues;
//import characterManagement.CreateUpdateCharacterSheet;
import helpers.CharacterStatMaker;
import helpers.LogNote;

public class CreatePlayer {
    
    public static String generateNewPlayerCharacter() {    
        System.out.println("[LOG] Moved to generateNewPlayerCharacter()");
        SplashScreens.buildAHeroText();
    
    // Get the player character name    
        Scanner getPlayerName = new Scanner(System.in);
        System.out.println("\n    What's your Hero called?");
        CoreValues.thePlayerName = getPlayerName.nextLine();
        System.out.println(LogNote.log000);
      
    // Generate starting stats
        CharacterStatMaker.generatePlayerHP();
        System.out.println(LogNote.log001);

        CharacterStatMaker.generatePlayerSTR();
        System.out.println(LogNote.log002);

        CharacterStatMaker.generatePlayerSTA();
        System.out.println(LogNote.log003);       
        
        CharacterStatMaker.generatePlayerLUC();
        System.out.println(LogNote.log004);
        
    // Set-up an instance of the Character Inventory
        
    // Set-up an instance of the Character Backpack
    
    // Generate the Character Sheet with the name and stats    
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
    
    // Return the player character name    
        return CoreValues.thePlayerName;
    }
    
}