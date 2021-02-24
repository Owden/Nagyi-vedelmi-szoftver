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
public class NagyiErtesito {
    String uzenet;
    
    public NagyiErtesito() {
        
    }
    
    public void ertesitsd(String farkasIranya){
        this.uzenet = "Beütött a baj " +farkasIranya+ "i irányból!";
        
        System.out.println(this.uzenet);
    }
    
    public String getUzenet(){
        return this.uzenet;
    }
    
}
