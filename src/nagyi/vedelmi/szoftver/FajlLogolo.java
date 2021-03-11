/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pesta
 */
public class FajlLogolo implements LogoloInterface {
    File logFile;
    FileWriter logFileIro;
        
    /**
     * 
     * @param logFile A file amibe a logolás történik!
     */
    public FajlLogolo(File logFile) {
        this.logFile = logFile;
        try {
            logFile.createNewFile();
        }
        catch (IOException ex) {
        }
    }  
    
    public void logold(String uzenet) {
        if (this.logFile.isFile()) {
            DateTimeFormatter idoFormazo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime most = LocalDateTime.now();
            try {
                this.logFileIro = new FileWriter(logFile.getName(), true);
                this.logFileIro.append(idoFormazo.format(most) + "\t" + uzenet + "\n");
                this.fajlBezaras();
            }
            catch (IOException ex) {
            }
        }
    }
    
    private void fajlBezaras() {
        if (this.logFileIro != null) {
            try {
                this.logFileIro.close();
            } 
            catch (IOException ex) {
            }
        }
    }
}
