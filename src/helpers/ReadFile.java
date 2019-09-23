// This file is used by helpers/FileData.java

package helpers;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import olediuminjava.CoreValues;

public class ReadFile {
    
    private String path;
    
    public ReadFile(String file_path) {
        path = file_path;
    }
    
    // Opens the file, reads the lines in and stores them in an array
    // called textdata.
    public String[] OpenFile() throws IOException {
        
        // FileReader takes in bytes (single characters) so we wrap it
        // with BufferedReader which lets us work with complete lines
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        
        // the lines that are read in are stored in an array called textData
        // the size of the array is set to the number of lines in readLines()
        int numberOfLines = readLines();
        String[] textData = new String[numberOfLines];
        System.out.println("[LOG] I set the textData string array to the lines in the Statsfile");
        
        // To iterate over the text file and get each lines stored in the 
        // array we need to have a loop
        int i;
        
        for (i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        
        // Before we close the file, write the recovered values into the active variables
        CoreValues.thePlayerName = textData[0];
        //CoreValues.playerCurrentHp = textData[1];
        

        // Close the file to flush the temporary memory
        textReader.close();
        return textData;
    }
    
    int readLines() throws IOException {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        
        String aLine;
        int numberOfLines = 0;
        
        while ((aLine = bf.readLine()) != null) {
            numberOfLines++;
        }
        
        bf.close();
        
        return numberOfLines;
    }
    
}