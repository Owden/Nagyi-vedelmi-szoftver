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
public class FarkasTamadasIranyUI extends javax.swing.JFrame {

    /**
     * Creates new form FarkasTamadasIranyUI
     */
    public FarkasTamadasIranyUI() {
        initComponents();
        this.iranyGombPanel.setAlignmentX(CENTER_ALIGNMENT);
        this.iranyGombPanel.setAlignmentY(CENTER_ALIGNMENT);
        this.riadoSzervezo = new RiadoSzervezo();
    }
    
    /* */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        iranyGombPanel = new javax.swing.JPanel();
        tavtarto = new javax.swing.JPanel();
        delGomb = new javax.swing.JButton();
        keletGomb = new javax.swing.JButton();
        eszakGomb = new javax.swing.JButton();
        nyugatGomb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        iranyGombPanel.setAutoscrolls(true);

        javax.swing.GroupLayout tavtartoLayout = new javax.swing.GroupLayout(tavtarto);
        tavtarto.setLayout(tavtartoLayout);
        tavtartoLayout.setHorizontalGroup(
            tavtartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );
        tavtartoLayout.setVerticalGroup(
            tavtartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        delGomb.setText("dél");
        delGomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iranyGombMouseClicked(evt);
            }
        });

        keletGomb.setText("kelet");
        keletGomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iranyGombMouseClicked(evt);
            }
        });

        eszakGomb.setText("észak");
        eszakGomb.setMaximumSize(new java.awt.Dimension(500, 1000));
        eszakGomb.setMinimumSize(new java.awt.Dimension(300, 60));
        eszakGomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iranyGombMouseClicked(evt);
            }
        });

        nyugatGomb.setText("nyugat");
        nyugatGomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iranyGombMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout iranyGombPanelLayout = new javax.swing.GroupLayout(iranyGombPanel);
        iranyGombPanel.setLayout(iranyGombPanelLayout);
        iranyGombPanelLayout.setHorizontalGroup(
            iranyGombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iranyGombPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nyugatGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iranyGombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eszakGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delGomb)
                    .addGroup(iranyGombPanelLayout.createSequentialGroup()
                        .addComponent(tavtarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keletGomb)))
                .addContainerGap())
        );

        iranyGombPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {delGomb, eszakGomb, keletGomb, nyugatGomb, tavtarto});

        iranyGombPanelLayout.setVerticalGroup(
            iranyGombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iranyGombPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eszakGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(iranyGombPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tavtarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keletGomb)
                    .addComponent(nyugatGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delGomb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        iranyGombPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {delGomb, eszakGomb, keletGomb, nyugatGomb, tavtarto});

        getContentPane().add(iranyGombPanel);

        pack();
    }// </editor-fold>                        
       
    private void iranyGombMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.riadoSzervezo.riado(((javax.swing.JButton) evt.getSource()).getText());
    }  
    
    private RiadoSzervezo riadoSzervezo;
    // Variables declaration - do not modify                     
    private javax.swing.JButton delGomb;
    private javax.swing.JButton eszakGomb;
    private javax.swing.JPanel iranyGombPanel;
    private javax.swing.JButton keletGomb;
    private javax.swing.JButton nyugatGomb;
    private javax.swing.JPanel tavtarto;
    // End of variables declaration                   
}
