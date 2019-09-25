package characterManagement;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import gameText.SplashScreens;
import olediuminjava.CoreValues;
import helpers.CharacterStatMaker;
import helpers.LogNote;

public class CreatePlayer {
        
    public static String generateNewPlayerCharacter() {    
        System.out.println(LogNote.log011);
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
    
    // Generate the Character Sheet with the name and stats    
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
    
    // Return the player character name    
        return CoreValues.thePlayerName;
    }
    
    public static void createInventory() {
        HashMap<String, String> playerInventory = new HashMap<>(); 

          // 2 Adding values to HashMap as ("keys", "values") 
            playerInventory.put("Head", "One"); 
            playerInventory.put("Neck", "Two");
            playerInventory.put("Chest","Rough Cotton Shirt");
        
        System.out.println(playerInventory);
    }
    
}