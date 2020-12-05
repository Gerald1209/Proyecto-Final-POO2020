package proyectofinal;


import interfaz.Informe;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    	/*public void finalize() throws Throwable {

	}*/
        
        //Hice otra funcion para la fecha porque estaba muy largo todo
        public void obtenerFechas(){
            
            inicio =JOptionPane.showInputDialog(null, "Ingrese la Fecha Inicial"
                    + "\n  yyyy-MM-dd", JOptionPane.QUESTION_MESSAGE);
            end = JOptionPane.showInputDialog(null, "Ingrese la Fecha Final"
                    + "\n  yyyy-MM-dd", JOptionPane.QUESTION_MESSAGE);
            
            try {
                SimpleDateFormat fechas = new SimpleDateFormat("yyyy-MM-dd");
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
                +inicio+"' and fechaVenta <= '" + end+"'";
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Fecha de Venta");
            modelo.addColumn("Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Monto Final");
            
            inf.setModel(modelo);
            
            String [] datos = new String [4];
            
            
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrarInforme);
            
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);
            }
            
            inf.setModel(modelo);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    }
        
        public float total(){
            final String mostrarTotal = "Select SUM(montoFinal) Total from Informe where fechaVenta >= '"+ inicio +"' and fechaVenta  <= '"+end+"'";
            //float [] total = new float [2];
            float total;
            
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrarTotal);
            total  = rs.getFloat(1);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
        }
        
        
}