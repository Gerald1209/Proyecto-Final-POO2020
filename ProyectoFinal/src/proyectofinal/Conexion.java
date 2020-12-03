
package proyectofinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author @soy_megh
 */
public class Conexion {
 private static final String SERVIDOR = "MARLIE\\SQLEXPRESS";
    private static final String USUARIO = "sa";
    private static final String PW = "123";
    private static final String NOMBREBD = "Proyecto_Final";
    private static final String PUERTO = "1433";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection obtenerConexion(){
        try{
            String conexionUrl = "jdbc:sqlserver://" + SERVIDOR +": " + PUERTO + "; Databasename= " + NOMBREBD +"; user= " + USUARIO + "; password = " + PW + ";";
            Class.forName(DRIVER);
            
            return (DriverManager.getConnection(conexionUrl));
        
        }catch(ClassNotFoundException | SQLException ex){
            ex.printStackTrace();
        }
        
        return null;
    }
    
    
    public void close(Connection conn){
        try{
           conn.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}