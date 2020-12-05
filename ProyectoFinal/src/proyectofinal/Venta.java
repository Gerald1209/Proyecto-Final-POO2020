package proyectofinal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 * @author Marlon Ramirez
 * @version 1.0
 * @created 25-Nov-2020 4:52:34 PM
 */
public class Venta {

	private int cantidad;
	private Date fechaVenta;
	private float montoFinal;
	private int numeroPedido;
        private String nombre;
	private float precio;

	public Venta(){

	}
        
        public Venta(String fechaVenta, String nombre, int cantidad) {
            try {
                SimpleDateFormat fechas = new SimpleDateFormat("yyyy-MM-dd");
                this.fechaVenta = fechas.parse(fechaVenta);
                
            } 
            catch (ParseException ex) 
            {
            JOptionPane.showMessageDialog(null, "Formato Incorrecto","Error" , JOptionPane.ERROR_MESSAGE);
            }
            
            this.nombre = nombre;
            this.cantidad = cantidad;
            
            //calcularMontoFinal();
    }

   /* public Venta(Date text, String toString, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

	public void finalize() throws Throwable {

	}

	public void calcularMontoFinal(){
            //this.montoFinal = this.cantidad * this.precio;
		
	}
        
       public void calcularPrecio(){
           if(nombre.equalsIgnoreCase(""))
                this.precio = ;
		
	}

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(float montoFinal) {
        this.montoFinal = montoFinal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}