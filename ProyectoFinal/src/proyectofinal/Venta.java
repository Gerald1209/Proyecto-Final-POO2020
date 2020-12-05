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
            this.montoFinal = this.cantidad * this.precio;
		
	}
        
       public void calcularPrecio(){
                    
           switch(nombre){
                case "Pastel de Zanahoría": this.precio = 25;
                                            break;
                case "Pastel de Fresas con Crema": this.precio = 25;
                                            break;                            
                case "Pastel de Red Velvet": this.precio = 25;
                                            break;
                case "Pastel de Moka": this.precio = 27;
                                            break;  
                case "Pastel de Chocolate": this.precio = 23;
                                            break;                            
		case "Galleta de Chocolate Chips": this.precio = 2.5f;
                                            break;
                case "Galleta de Avena": this.precio = 1;
                                            break; 
                case "Galleta de Red Velvet": this.precio = 2;
                                            break;   
                case "Pay de Limón": this.precio = 18;
                                            break; 
                case "Pay de Manzana": this.precio = 20;
                                            break; 
                case "Tartaleta de Frutas": this.precio = 18;
                                            break;  
                case "Brownie und.": this.precio = 1.5f;
                                            break;
                case "Torre de Brownies": this.precio = 14;
                                            break;
                case "Tres Leches": this.precio = 18;
                                            break;
                case "Chesecake Clasíco": this.precio = 22;
                                            break; 
                case "Chesecake Calala": this.precio = 26;
                                            break;                             
            }
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