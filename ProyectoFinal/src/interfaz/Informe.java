package interfaz;

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

        pProducto = new javax.swing.JPanel();
        pCosto = new javax.swing.JPanel();
        lFecha = new javax.swing.JLabel();
        lProducto = new javax.swing.JLabel();
        lMonto = new javax.swing.JLabel();
        taFecha = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 248, 239));
        setClosable(true);
        setMaximizable(true);
        setTitle("Informe");

        pProducto.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout pProductoLayout = new javax.swing.GroupLayout(pProducto);
        pProducto.setLayout(pProductoLayout);
        pProductoLayout.setHorizontalGroup(
            pProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        pProductoLayout.setVerticalGroup(
            pProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        pCosto.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout pCostoLayout = new javax.swing.GroupLayout(pCosto);
        pCosto.setLayout(pCostoLayout);
        pCostoLayout.setHorizontalGroup(
            pCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pCostoLayout.setVerticalGroup(
            pCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lFecha.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lFecha.setText("Fecha");

        lProducto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lProducto.setText("Producto");

        lMonto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lMonto.setText("Monto de Compra");

        taFecha.setBackground(new java.awt.Color(255, 204, 204));
        taFecha.setColumns(20);
        taFecha.setRows(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(taFecha))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lFecha;
    private javax.swing.JLabel lMonto;
    private javax.swing.JLabel lProducto;
    private javax.swing.JPanel pCosto;
    private javax.swing.JPanel pProducto;
    public javax.swing.JTextArea taFecha;
    // End of variables declaration//GEN-END:variables

    public void setTaFecha(JTextArea taFecha) {
        this.taFecha = taFecha;
    }
 
}
