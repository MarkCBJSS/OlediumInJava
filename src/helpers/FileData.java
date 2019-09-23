package helpers;

import characterManagement.ShowStatsInGame;
import java.io.IOException;

public class FileData {

    public static void getStatSheetData() throws IOException {
        
        String file_name = "statsSheet.log";
        System.out.println(LogNote.log014);
        
        try {
            ReadFile file = new ReadFile(file_name);
            String[] arryLines = file.OpenFile();
            
            int i;
            for (i = 0; i < arryLines.length; i++) {
            }
                ShowStatsInGame.showCharacterInfo();
                System.out.println(LogNote.log015);
        }
        catch (IOException e) {
            System.out.println(e.getMessage() );
        }
        
    }
    
}