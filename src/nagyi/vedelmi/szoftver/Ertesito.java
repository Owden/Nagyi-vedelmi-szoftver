/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

/**
 *
 * @author Pesta
 */
public class Ertesito {    
    boolean nagyiErtesito;
    
    public Ertesito(boolean nagyiErtesito) {
        this.nagyiErtesito = nagyiErtesito;
    }
    
    public String uzenetLetrehozas(String farkasIranya){
        String uzenet;
        if (this.nagyiErtesito)
            uzenet = "Beütött a baj " +farkasIranya+ "i irányból!";
        else
            uzenet = "A Nagyinál beütött a baj " +farkasIranya+ "i irányból!";            
        return uzenet;
    }
}
