package characterManagement;

import java.io.File;
import java.io.IOException;

import helpers.FileData;
import olediuminjava.CoreValues;

public class CheckForExistingPlayer {
    
    public static void hasThePlayerPlayedBefore() throws IOException {
        
       // Load any existing file into tempFile 
        File tempFile = new File("statsSheet.log");
       
       // Check if a file was loaded into tempFile
        if (tempFile.isFile()) {
            CoreValues.returningPlayerStatus = true;
            System.out.println("[LOG] A Stat Log Sheet already exists");
            FileData.getStatSheetData();
        } else {
            CoreValues.returningPlayerStatus = false;
            System.out.println("[LOG] There's no Stats Log Sheet");
          }
       
    }
      
}