package avicola;
import java.time.LocalDate;
public class ProductoCongeladoNitrogeno extends ProductoRefrijerado {
	private double tiempoExposicion;
	public ProductoCongeladoNitrogeno(String nombre, LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,
			Granja granjaOrigen, int codigoSupervision, double temperatura, double tiempoExposicion) {
		super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoSupervision, temperatura);
		this.tiempoExposicion = tiempoExposicion;
	}
	public void obtenerEtiqueta() {
		super.obtenerEtiqueta();
		System.out.println("tiempo de exposicion: "+this.getTiempoExposicion()+"seg");
	}
	public double getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(double tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
	

}
