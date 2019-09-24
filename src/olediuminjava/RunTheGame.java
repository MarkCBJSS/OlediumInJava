package olediuminjava;

import static helpers.KeyCommands.whatDoYouWantToDoNext;
import gameText.HelpFile;
import characterManagement.ShowStatsInGame;
import characterManagement.PlayerInventoryMap;
import helpers.LogNote;

public class RunTheGame {
    
    public static void gameFlow() {
        
        while (CoreValues.isPlayerAlive == true) {
                                       
            whatDoYouWantToDoNext();

            // Case statement to direct the game given whatever theNextAction is
            // TODO : Could be converted to an ENUM
            switch (CoreValues.theNextAction) {
                case "h":
                case "help":
                    HelpFile.helpText();
                    System.out.println(LogNote.log006);
                    break;
                case "c":
                case "char":
                    ShowStatsInGame.showCharacterInfo();
                    //TODO: Show Inventory
                    break;
                case "q": 
                case "quit":
                    olediuminjava.EndTheGame.recordStatsAndQuit();                
                    break;
                case "a":
                case "attack":
                    System.out.println(LogNote.log007);
                    break;                    
                case "f":
                case "flee":
                    System.out.println(LogNote.log008);                    
                    break;
                case "s":
                case "search":
                    System.out.println(LogNote.log009);                       
                    break;                    
                default:
                    System.out.println(LogNote.log010);                       
                    break;
            }
        }

    }
    
}