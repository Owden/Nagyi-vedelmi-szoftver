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
    
    public RiadoSzervezo(LogoloInterface logolas, Ertesito nagyiErtesito, Ertesito vadaszErtesito, NagyiErtesitoAblakUI nagyiErtesitoUI)  {
        this.nagyiErtesito = nagyiErtesito;
        this.vadaszErtesito = vadaszErtesito;
        this.nagyiErtesitoUI = nagyiErtesitoUI;
        this.logolas = logolas;
    }

    /**
     * Riadó fújása.
     * @param farkasIranya A farkas érkezési iránya. 
     */
    public void riado(String farkasIranya) {        
        String uzenet = this.nagyiErtesito.uzenetLetrehozas(farkasIranya);
        this.nagyiErtesitoUI.setUzenet(uzenet);
        this.nagyiErtesitoUI.setVisible(true);
        this.logolas.logold(uzenet);

        uzenet = this.vadaszErtesito.uzenetLetrehozas(farkasIranya);
        this.logolas.logold(uzenet);
    }
    
}
