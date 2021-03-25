/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagyi.vedelmi.szoftver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Pesta
 */
public class NagyiVedelmiSzoftver {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        FileInputStream konfigFajl = new FileInputStream("config.properties");
        Properties konfigTulajdonsagok = new Properties();
        konfigTulajdonsagok.load(konfigFajl);
        LogoloInterface logolo;
        
        if(konfigTulajdonsagok.getProperty("Logolás-konfigurálása").equals("Konzol")) {
            logolo = new KonzolLogolo();
        }
        else if(konfigTulajdonsagok.getProperty("Logolás-konfigurálása").equals("Fájl")){
            logolo = new FajlLogolo(new File(konfigTulajdonsagok.getProperty("Logoló-fájl")));
        }
        else {
            throw new Exception("Nincs \"" + konfigTulajdonsagok.getProperty("Logolás-konfigurálása") + "\" logolási típus!");
        }
       
        Ertesito nagyiErtesito = new Ertesito(true);
        Ertesito vadaszErtesito = new Ertesito(false);
        NagyiErtesitoAblakUI nagyiErtesitoUI = new NagyiErtesitoAblakUI();
        RiadoSzervezo riadoSzervezo = new RiadoSzervezo(logolo, nagyiErtesito, vadaszErtesito, nagyiErtesitoUI);
        FarkasTamadasIranyUI farkasTamadasUI = new FarkasTamadasIranyUI(riadoSzervezo);
        farkasTamadasUI.setVisible(true);       
    }
}
