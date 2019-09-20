package helpers;

import java.io.IOException;

public class FileData {

    public static void getFileData() throws IOException {
        
        String file_name = "/Users/mark.crowther/dev/java/textFiles/src/textfiles/test.txt";
        
        try {
            ReadFile file = new ReadFile(file_name);
            String[] arryLines = file.OpenFile();
            
            int i;
            for (i = 0; i < arryLines.length; i++) {
                System.out.println(arryLines[i]);
            }
            
        }
        catch (IOException e) {
            System.out.println(e.getMessage() );
        }
        
    }
    
}