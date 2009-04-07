/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jeasyedit;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *This is the parser class for the text object...
 * @author patrik
 */
public class TextParser {
    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    
    public String readFromFile(){
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            String strM = null;
            int i =0;
        
            while ((str = in.readLine()) != null) {
                strM +=  str;
                i++;
                
            }
            
            in.close();
            
            return strM;
     
        } catch (IOException e) {
            return null;
        }
    }
    
    
    
    
}
