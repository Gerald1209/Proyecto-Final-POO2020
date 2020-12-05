package interfaz;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;



public class Informe extends javax.swing.JInternalFrame {

    /**
     * Creates new form Informe
     */
    
    
    public Informe() {
        initComponents();
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lFecha = new javax.swing.JLabel();
        lProducto = new javax.swing.JLabel();
        lMonto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 248, 239));
        setClosable(true);
        setMaximizable(true);
        setTitle("Informe");

        lFecha.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lFecha.setText("Fecha");

        lProducto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lProducto.setText("Producto");

        lMonto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lMonto.setText("Monto de Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lMonto)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFecha)
                    .addComponent(lProducto)
                    .addComponent(lMonto))
                .addContainerGap(473, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lFecha;
    private javax.swing.JLabel lMonto;
    private javax.swing.JLabel lProducto;
    // End of variables declaration//GEN-END:variables

   
    private class past {

        

        public past() {
        }
    }
 
}
