package interfaz;

import javax.swing.JFrame;

public class Kelani extends javax.swing.JFrame {
    
    Venta venta = new Venta();
    Informe inform = new Informe();
    Acerca info = new Acerca();

    public Kelani() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //dpPanel.setMaximumSize(maximumSize);
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        dpPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mVenta = new javax.swing.JMenu();
        mInforme = new javax.swing.JMenu();
        mAcerca = new javax.swing.JMenu();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kelani");
        setBackground(new java.awt.Color(255, 248, 239));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dpPanel.setBackground(new java.awt.Color(255, 248, 239));
        dpPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dpPanel.setName(""); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Marlon Ramirez\\Downloads\\WhatsApp Image 2020-11-24 at 6_opt.jpg")); // NOI18N

        dpPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpPanelLayout = new javax.swing.GroupLayout(dpPanel);
        dpPanel.setLayout(dpPanelLayout);
        dpPanelLayout.setHorizontalGroup(
            dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        dpPanelLayout.setVerticalGroup(
            dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 248, 239));
        jMenuBar1.setForeground(new java.awt.Color(255, 248, 239));

        mVenta.setBackground(new java.awt.Color(255, 248, 239));
        mVenta.setForeground(new java.awt.Color(58, 38, 29));
        mVenta.setText("Venta     ");
        mVenta.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        mVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mVentaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mVenta);

        mInforme.setBackground(new java.awt.Color(255, 248, 239));
        mInforme.setForeground(new java.awt.Color(58, 38, 29));
        mInforme.setText("Informe      ");
        mInforme.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        mInforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mInformeMouseClicked(evt);
            }
        });
        jMenuBar1.add(mInforme);

        mAcerca.setBackground(new java.awt.Color(255, 248, 239));
        mAcerca.setForeground(new java.awt.Color(58, 38, 29));
        mAcerca.setText("Acerca de...");
        mAcerca.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        mAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mAcercaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mAcerca);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mVentaMouseClicked
        this.dpPanel.add(this.venta);
        this.venta.setVisible(true);
    }//GEN-LAST:event_mVentaMouseClicked

    private void mInformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mInformeMouseClicked
        this.dpPanel.add(this.inform);
        this.inform.setVisible(true);
    }//GEN-LAST:event_mInformeMouseClicked

    private void mAcercaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mAcercaMouseClicked
        this.dpPanel.add(this.info);
        this.info.setVisible(true);
    }//GEN-LAST:event_mAcercaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kelani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kelani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kelani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kelani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kelani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mAcerca;
    private javax.swing.JMenu mInforme;
    private javax.swing.JMenu mVenta;
    // End of variables declaration//GEN-END:variables
}