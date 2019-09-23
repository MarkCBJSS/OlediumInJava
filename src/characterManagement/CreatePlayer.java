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
      
        // Generate starting stats and instance of the player
        CharacterStatMaker.generatePlayerHP();
        System.out.println("[LOG] Generated Player HP: " + CoreValues.playerCurrentHp + ".");
        
        // Set-up an instance of the Character Inventory
        
        // Set-up an instance of the Character Backpack
        
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
        
        return CoreValues.thePlayerName;
    }
    
}