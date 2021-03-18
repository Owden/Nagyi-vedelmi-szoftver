/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import java.io.File;
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
        //LogoloInterface logolo = new FajlLogolo(new File("Farkastamadasok.txt"));
        LogoloInterface logolo = new KonzolLogolo();
        Ertesito nagyiErtesito = new Ertesito(true);
        Ertesito vadaszErtesito = new Ertesito(false);
        NagyiErtesitoAblakUI nagyiErtesitoUI = new NagyiErtesitoAblakUI();
        RiadoSzervezo riadoSzervezo = new RiadoSzervezo(logolo, nagyiErtesito, vadaszErtesito, nagyiErtesitoUI);
        FarkasTamadasIranyUI farkasTamadasUI = new FarkasTamadasIranyUI(riadoSzervezo);
        farkasTamadasUI.setVisible(true);       
    }
}
