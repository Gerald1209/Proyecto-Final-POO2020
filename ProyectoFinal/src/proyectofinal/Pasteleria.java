package proyectofinal;


import interfaz.Informe;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Pasteleria extends Conexion{

    Connection conn;
    
    public Informe inform;
    
    public Venta m_Venta;
    
    private String inicio;
    private String end;
    
    private Date primera;
    private Date ultima;
    
    final String mostrarCiudad = "Select * from Registro";
    
        /*
        ArrayList<Date> fecha = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Float> monto = new ArrayList<>();
             
        final String mostrarFecha = "Select fechaVenta from Registro where fechaVenta between "
                +"'"+inicio+"' "+" and '" +"'"+ end+"'";
        
        final String mostrarNombre = "Select nombre from Registro where Proyecto_Final.fechaVenta between "
                +"'"+inicio+"' "+" and '" +"'"+ end+"'";
        
        final String mostrarMonto = "Select montoFinal from Registro where Proyecto_Final.fechaVenta between "
                +"'"+inicio+"' "+" and '" +"'"+ end+"'";
*/
	public Pasteleria(){
            
	}

    	public void finalize() throws Throwable {

	}
        
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

	public void generarInformeVenta(){
            Connection conn = this.obtenerConexion();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(mostrarCiudad);
            
            ResultSetMetaData metaData = rs.getMetaData();
            int numDeColumna = metaData.getColumnCount();
            
            System.out.println("Registro");
            for(int i =1; i <= numDeColumna; i++){
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                
            }
            System.out.println("");
            while (rs.next()){
                for(int i= 1; i<= numDeColumna; i++){
                    System.out.printf("%-8s \t", rs.getObject(i));
                    
                }
                System.out.println("");
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Pasteleria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	

	public void vender(){

	}

       
}