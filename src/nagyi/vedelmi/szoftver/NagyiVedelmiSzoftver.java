/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import java.io.IOException;

/**
 *
 * @author Pesta
 */
public class NagyiVedelmiSzoftver {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        NagyiErtesitoAblakUI nagyiErtesitoUI = new NagyiErtesitoAblakUI();               
        Beolvasas beolvasas = new Beolvasas();
        Ertesito nagyiErtesito = new Ertesito(true);
        Ertesito vadaszErtesito = new Ertesito(false);
        Logolo logolas = new Logolo();        

        String farkasIranya = beolvasas.getFarkasIrany();
                
        nagyiErtesito.ertesitsd(farkasIranya);
        String uzenet = nagyiErtesito.getUzenet();
        nagyiErtesitoUI.setUzenet(uzenet);
        nagyiErtesitoUI.setVisible(true);
        logolas.logold(uzenet);
        
        vadaszErtesito.ertesitsd(farkasIranya);
        uzenet = vadaszErtesito.getUzenet(); 
        logolas.logold(uzenet);

        logolas.fajlBezaras();
    }
}
