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

/**
 *
 * @author Pesta
 */
public class Logolo {
    FileWriter logFileIro;
        
    public Logolo() throws IOException {
        File logFile = new File("Farkastamadasok.txt");
        logFile.createNewFile();
        this.logFileIro = new FileWriter(logFile.getName(), true);
    }
    
    public void logold(String uzenet) throws IOException {
        DateTimeFormatter idoFormazo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime most = LocalDateTime.now();
        try {
            this.logFileIro.append(idoFormazo.format(most) + "\t" + uzenet + "\n");
        }
        catch (IOException ex) {
            this.logFileIro.append(idoFormazo.format(most) + "\t" + uzenet + "\n");
        }
    }
    
    public void fajlBezaras() throws IOException {
        this.logFileIro.close();
    }
}
