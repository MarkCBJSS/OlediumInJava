package characterManagement;

import java.util.Scanner;

import gameText.SplashScreens;
import olediuminjava.CoreValues;
import helpers.CharacterStatMaker;
import helpers.LogNote;
import characterManagement.ShowStatsInGame;

public class CreatePlayer {
        
    public static String generateNewPlayerCharacter() {    
        System.out.println(LogNote.log011);
        SplashScreens.buildAHeroText();
    
    // Get the player character name    
        Scanner getPlayerName = new Scanner(System.in);
        System.out.println("\n    What's your Hero called?");
        CoreValues.thePlayerName = getPlayerName.nextLine();
      
    // Generate starting stats
        CharacterStatMaker.generatePlayerHP();
        CharacterStatMaker.generatePlayerSTR();
        CharacterStatMaker.generatePlayerSTA();          
        CharacterStatMaker.generatePlayerLUC();
    
    // Generate the Character Sheet with the name and stats    
        CreateUpdateCharacterSheet.createUpdateTheCharacterSheet();
        ShowStatsInGame.showCharacterInfo();
    
    // Return the player character name    
        return CoreValues.thePlayerName;
    }
    
}