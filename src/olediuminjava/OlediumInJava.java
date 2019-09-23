package olediuminjava;

import java.io.IOException;

import gameText.SplashScreens;
import gameText.BackStory;
import helpers.KeyCommands;
import characterManagement.CheckForExistingPlayer;
import characterManagement.CreatePlayer;


public class OlediumInJava {

    public static void main(String[] args) throws IOException{
        //SplashScreens.splashTitle();
        //SplashScreens.mountainImage();
        
        // If there's a Character Sheet, the player played before
        // If they 'lost' it, then we have to start a new game anyway
        CheckForExistingPlayer.hasThePlayerPlayedBefore();
        
        // Omit the backstory if the player has played before
        if (CoreValues.returningPlayerStatus == true) {
            System.out.println("Welcome back, " + CoreValues.thePlayerName);
            System.out.println("");
            
        } else { // The player is new so they get backstory            
            CreatePlayer.generateNewPlayerCharacter();
            
            BackStory.backStory();
            KeyCommands.waitForEnterKey();

            BackStory.gameStartText();
            BackStory.onYourOwn();
        }
       
        // Run the Game now we have our Player created / loaded in
        RunTheGame.gameFlow();
    }
    
}