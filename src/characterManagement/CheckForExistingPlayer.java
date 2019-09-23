package characterManagement;

import java.io.File;
import java.io.IOException;

import helpers.FileData;
import helpers.LogNote;
import olediuminjava.CoreValues;

public class CheckForExistingPlayer {
    
    public static void hasThePlayerPlayedBefore() throws IOException {
        
       // Load any existing file into tempFile 
        File tempFile = new File("statsSheet.log");
       
       // Check if a file was loaded into tempFile
        if (tempFile.isFile()) {
            CoreValues.returningPlayerStatus = true;
            System.out.println(LogNote.log012);
            FileData.getStatSheetData();
        } else {
            CoreValues.returningPlayerStatus = false;
            System.out.println(LogNote.log013);            
          }
       
    }
      
}