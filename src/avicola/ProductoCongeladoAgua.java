package avicola;

import java.time.LocalDate;

public class ProductoCongeladoAgua extends ProductoRefrijerado {
	private double gramosSal;
	public ProductoCongeladoAgua(String nombre, LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,
			Granja granjaOrigen, int codigoSupervision, double temperatura,double gramosSal) {
		super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoSupervision, temperatura);
		this.gramosSal = gramosSal;
	}
	public void obtenerEtiqueta() {
		super.obtenerEtiqueta();
		System.out.println("gramos de sal por litros de agua: "+this.getGramosSal()+"gr");
	}
	public double getGramosSal() {
		return gramosSal;
	}
	public void setGramosSal(double gramosSal) {
		this.gramosSal = gramosSal;
	}

}
