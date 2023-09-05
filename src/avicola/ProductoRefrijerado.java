package avicola;

import java.time.LocalDate;

public class ProductoRefrijerado extends ProductosFrescos {
	private int codigoSupervision;
	private double temperatura;
	public ProductoRefrijerado(String nombre,LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,
			Granja granjaOrigen,int codigoSupervision,double temperatura) {
		super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen);
		this.codigoSupervision = codigoSupervision;
		this.temperatura = temperatura;
	}
	public void obtenerEtiqueta() {
		super.obtenerEtiqueta();
		System.out.println("codigo de supervision: "+this.getCodigoSupervision());
		System.out.println("temperatura recomendada para mantenimiento: "+this.getTemperatura()+"°");
	}
	public int getCodigoSupervision() {
		return codigoSupervision;
	}
	public void setCodigoSupervision(int codigoSupervision) {
		this.codigoSupervision = codigoSupervision;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}


}
