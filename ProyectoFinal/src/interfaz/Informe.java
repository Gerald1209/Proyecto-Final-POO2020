package interfaz;


import javax.swing.JLabel;
import javax.swing.JTable;
import proyectofinal.Pasteleria;

public class Informe extends javax.swing.JInternalFrame {

    Pasteleria past = null;
    /**
     * Creates new form Informe
     */
    
    
    public Informe() {
        initComponents();
                
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spInforme = new javax.swing.JScrollPane();
        tInforme = new javax.swing.JTable();
        lTotal = new javax.swing.JLabel();
        lCantidad = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 248, 239));
        setClosable(true);
        setMaximizable(true);
        setTitle("Informe");

        tInforme.setBackground(new java.awt.Color(255, 248, 239));
        tInforme.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        tInforme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tInforme.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tInforme.setRowHeight(20);
        tInforme.setRowMargin(3);
        spInforme.setViewportView(tInforme);

        lTotal.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        lTotal.setText("Total");

        lCantidad.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(spInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lCantidad;
    private javax.swing.JLabel lTotal;
    private javax.swing.JScrollPane spInforme;
    private javax.swing.JTable tInforme;
    // End of variables declaration//GEN-END:variables

    public JTable gettInforme() {
        return tInforme;
    }

    public void settInforme(JTable tInforme) {
        this.tInforme = tInforme;
    }

    public JLabel getlCantidad() {
        return lCantidad;
    }

    

    

   
    
 
}
