/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter; 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

/**
 *
 * @author Pesta
 */
public class NagyiVedelmiSzoftver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consolInput = new Scanner(System.in);
        System.out.println("Merről jön a Farkas?");
        
        String farkasIranya = consolInput.nextLine();
        
        String uzenet = "Beütött a baj " +farkasIranya+ "i irányból!";

        System.out.println(uzenet);
        
        try {
            File logFile = new File("Farkastamadasok.txt");
            logFile.createNewFile(); 

            DateTimeFormatter idoFormazo = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
            LocalDateTime most = LocalDateTime.now();  
            
            FileWriter logFileIro = new FileWriter(logFile.getName(), true);            
            logFileIro.append(idoFormazo.format(most) + "\t" + uzenet + "\n");
            logFileIro.close();
            
        } 
        catch (IOException e) {
            System.out.println("Nem sikerült lejegyezni, emlékezz rá!");
            e.printStackTrace();
        }       
    }
    
}