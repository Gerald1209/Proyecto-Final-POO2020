package proyectofinal;

import interfaz.Kelani;

public class ProyectoFinal {

    public static void main(String[] args) {
        Kelani kelani = new Kelani();
        kelani.setVisible(true);
        
        Pasteleria p = new Pasteleria();
        p.generarInformeVenta();
    }
    
}
