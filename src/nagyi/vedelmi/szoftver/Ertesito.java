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
    String uzenet;
    boolean nagyiErtesito;
    
    public Ertesito(boolean nagyiErtesito) {
        this.nagyiErtesito = nagyiErtesito;
    }
    
    public void ertesitsd(String farkasIranya){
        if (this.nagyiErtesito)
            this.uzenet = "Beütött a baj " +farkasIranya+ "i irányból!";
        else
            this.uzenet = "A Nagyinál beütött a baj " +farkasIranya+ "i irányból!";
        
        System.out.println(this.uzenet);
    }
    
    public String getUzenet(){
        return this.uzenet;
    }
    
}
