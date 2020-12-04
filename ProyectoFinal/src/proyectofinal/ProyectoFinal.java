package proyectofinal;

import interfaz.Kelani;
import java.sql.SQLException;

public class ProyectoFinal {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException
    {
        Kelani kelani = new Kelani();
        kelani.setVisible(true);
        
        Pasteleria p = new Pasteleria();
        p.generarInformeVenta();
    }
    
}
