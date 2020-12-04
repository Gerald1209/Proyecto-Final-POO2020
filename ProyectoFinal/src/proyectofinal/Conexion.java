
package proyectofinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    private Connection cn=null;
    public Conexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
      cn = DriverManager.getConnection("jdbc:sqlserver://165.98.12.158:1432;databaseName=PasteleriaBD;user=poo2;password=poo2");
    }
    public Connection getConexion()
    {
        return cn;
    }
    public void cerrar() throws SQLException
    {
        cn.close();
    }
}
