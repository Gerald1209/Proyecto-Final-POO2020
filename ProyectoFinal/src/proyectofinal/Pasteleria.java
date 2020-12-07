package proyectofinal;


import interfaz.Informe;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Pasteleria extends Conexion{

    Connection cn;
    
    private PreparedStatement insertarRegistro;
    final String mostrarVenta = "Select * from Informe";
    
    Informe inform;
    
    public Venta m_Venta;
    
    private String inicio;
    private String end;
    
    private Date primera;
    private Date ultima;
    
    private float total=0;
    
        
	public Pasteleria()throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
        {
            
            
        try {
           cn= this.getConexion();
            insertarRegistro = cn.prepareStatement("insert into Informe(fechaVenta, nombre, cantidad, precio, montoFinal) values(?, ?, ?, ?, ?)");
         } catch (SQLException ex) {
            Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
            }
	}

        
        public int registrarVenta(Date fechaVenta, String nombre, int cantidad, float precio, float montoFinal){
            int result = 0;
            try {
                insertarRegistro.setDate(1, (java.sql.Date) fechaVenta);
                insertarRegistro.setString(2, nombre);
                insertarRegistro.setInt(3, cantidad);
                insertarRegistro.setFloat(4, precio);
                insertarRegistro.setFloat(5, montoFinal);
                result = insertarRegistro.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
              }
                
        return result;
    }

    
        
        //Hice otra funcion para la fecha porque estaba muy largo todo
        SimpleDateFormat fechas = new SimpleDateFormat("yyyy-MM-dd");
        public void obtenerFechas(){
            
            inicio =JOptionPane.showInputDialog(null, "Ingrese la Fecha Inicial"
                    + "\n  yyyy-MM-dd", JOptionPane.QUESTION_MESSAGE);
            end = JOptionPane.showInputDialog(null, "Ingrese la Fecha Final"
                    + "\n  yyyy-MM-dd", JOptionPane.QUESTION_MESSAGE);
            
            try {
                //SimpleDateFormat fechas = new SimpleDateFormat("yyyy-MM-dd");
                primera = fechas.parse(inicio);
                ultima = fechas.parse(end);
            } 
            catch (ParseException ex) 
            {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto","Error" , JOptionPane.ERROR_MESSAGE);
            obtenerFechas();
            }
        
        }

	public void generarInformeVenta(javax.swing.JTable inf){
            
            Connection cn = this.getConexion();
            final String mostrarInforme = "Select fechaVenta, nombre, cantidad, montoFinal from Informe where fechaVenta >= '"
                +inicio+"' and fechaVenta <= '" + end+"' order by fechaVenta ASC";
                        
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Fecha de Venta");
            modelo.addColumn("Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Monto Final");
            
            
            
            inf.setModel(modelo);
            
            String [] datos = new String [4];
            
            
        try {
            Statement st = cn.createStatement();
            ResultSet rs=st.executeQuery(mostrarInforme);
            
            while(rs.next()){
                int j=1;
                for(int i= 0; i<4;i++){
                    datos[i] = rs.getString(j);
                    j++;
                }
                modelo.addRow(datos);
                total += rs.getFloat(4);
            }
           
            inf.setModel(modelo);
            TableColumnModel columnModel = inf.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(100);
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(2).setPreferredWidth(70);
            columnModel.getColumn(3).setPreferredWidth(70);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    }
 
        public float getTotal() {
            return total;
        }   
}