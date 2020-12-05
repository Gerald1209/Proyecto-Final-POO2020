package interfaz;


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
        tInforme.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tInforme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tInforme.setRowMargin(3);
        spInforme.setViewportView(tInforme);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spInforme)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane spInforme;
    private javax.swing.JTable tInforme;
    // End of variables declaration//GEN-END:variables

    public JTable gettInforme() {
        return tInforme;
    }

    public void settInforme(JTable tInforme) {
        this.tInforme = tInforme;
    }

    

   
    
 
}
