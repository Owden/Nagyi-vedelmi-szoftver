/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import java.util.Scanner;

/**
 *
 * @author Pesta
 */
public class Beolvasas {
    
    Scanner consolInput;
    
    public Beolvasas(Scanner konzol) {        
        this.consolInput = konzol;        
    }
        
    public String getFarkasIrany() {
        System.out.println("Merről jön a Farkas?");
        
        return consolInput.nextLine();
    }
    
}
