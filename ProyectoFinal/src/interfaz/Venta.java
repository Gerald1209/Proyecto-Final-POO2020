/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Marlon Ramirez
 */
public class Venta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollBar1 = new javax.swing.JScrollBar();
        jSpinner1 = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBox2 = new javax.swing.JComboBox<>();
        jProgressBar2 = new javax.swing.JProgressBar();
        lProducto = new javax.swing.JLabel();
        lFecha1 = new javax.swing.JLabel();
        lCantidad = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();
        bIngresar = new javax.swing.JButton();
        cbProducto = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sMes = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        sAno = new javax.swing.JSpinner();
        sDia = new javax.swing.JSpinner();
        lMes = new javax.swing.JLabel();
        lDia = new javax.swing.JLabel();
        lAno = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 248, 239));
        setClosable(true);
        setTitle("Venta");

        lProducto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lProducto.setText("Producto Vendido:");

        lFecha1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lFecha1.setText("Fecha de Venta:");

        lCantidad.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        lCantidad.setText("Cantidad:");

        bIngresar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        bIngresar.setForeground(new java.awt.Color(58, 38, 29));
        bIngresar.setText("Ingresar");

        cbProducto.setBackground(new java.awt.Color(255, 248, 239));
        cbProducto.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        cbProducto.setForeground(new java.awt.Color(58, 38, 29));
        cbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastel de Zanahoria", "Pastel de Fresas con Crema", "Pastel de Red Velvet", "Pastel de Moka", "Pastel de Chocolate", "Galleta Chocolate Chips", "Galleta de Avena", "Galleta de Red Velvet", "Pay de Limón", "Pay de Manzana", "Tartaleta de Frutas", "Brownie und.", "Torre de Brownies", "Tres Leches", "Cheesecake Clasico", "Cheesecake Calala" }));

        jPanel1.setBackground(new java.awt.Color(255, 248, 239));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("/");

        sMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("/");

        sAno.setModel(new javax.swing.SpinnerNumberModel(2020, 2020, null, 1));

        sDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        sDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lMes.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        lMes.setText("Mes");

        lDia.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        lDia.setText("Día");

        lAno.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        lAno.setText("Año");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(lDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sMes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAno)
                    .addComponent(sAno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMes)
                    .addComponent(lDia)
                    .addComponent(lAno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sDia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lFecha1)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lProducto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(62, 62, 62)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCantidad)
                    .addComponent(cbProducto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(bIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lProducto)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCantidad)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIngresar;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lAno;
    private javax.swing.JLabel lCantidad;
    private javax.swing.JLabel lDia;
    private javax.swing.JLabel lFecha1;
    private javax.swing.JLabel lMes;
    private javax.swing.JLabel lProducto;
    private javax.swing.JSpinner sAno;
    private javax.swing.JSpinner sDia;
    private javax.swing.JSpinner sMes;
    private javax.swing.JTextField tfCantidad;
    // End of variables declaration//GEN-END:variables
}
