package proyectofinal;
import java.util.Date;



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

	public void finalize() throws Throwable {

	}

	public float calcularMontoFinal(){
            return 0;
		
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