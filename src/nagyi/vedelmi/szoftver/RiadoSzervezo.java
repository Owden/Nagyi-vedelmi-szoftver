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
public class RiadoSzervezo {
    
    private Ertesito nagyiErtesito;
    private Ertesito vadaszErtesito;
    private NagyiErtesitoAblakUI nagyiErtesitoUI;
    private LogoloInterface logolas;
    
    public RiadoSzervezo(LogoloInterface logolas)  {
        this.nagyiErtesito = new Ertesito(true);
        this.vadaszErtesito = new Ertesito(false);
        this.nagyiErtesitoUI = new NagyiErtesitoAblakUI();
        this.logolas = logolas;
    }

    /**
     * Riadó fújása.
     * @param farkasIranya A farkas érkezési iránya. 
     */
    public void riado(String farkasIranya) {        
        this.nagyiErtesito.ertesitsd(farkasIranya);
        String uzenet = this.nagyiErtesito.getUzenet();
        this.nagyiErtesitoUI.setUzenet(uzenet);
        this.nagyiErtesitoUI.setVisible(true);
        this.logolas.logold(uzenet);

        this.vadaszErtesito.ertesitsd(farkasIranya);
        uzenet = this.vadaszErtesito.getUzenet(); 
        this.logolas.logold(uzenet);
    }
    
}
