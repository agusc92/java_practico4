package avicola;

import java.time.LocalDate;

public class ProductoCongeladoAire extends ProductoRefrijerado {
private double oxigeno;
private double nitrogeno;
private double carbono;
private double vapor;
	public ProductoCongeladoAire(String nombre, LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado,
			Granja granjaOrigen, int codigoSupervision, double temperatura,double oxigeno,
			double nitrogeno, double carbono, double vapor) {
		super(nombre, fechaVencimiento, numeroLote, fechaEnvasado, granjaOrigen, codigoSupervision, temperatura);
		this.oxigeno = oxigeno;
		this.nitrogeno = nitrogeno;
		this.carbono = carbono;
		this.vapor = vapor;
	}
	public void obtenerEtiqueta() {
		super.obtenerEtiqueta();
		System.out.println("oxigeno: "+this.getOxigeno()+"%");
		System.out.println("nitrogeno: "+this.getNitrogeno()+"%");
		System.out.println("dioxido de carbono: "+this.getCarbono()+"%");
		System.out.println("vapor de agua: "+this.getVapor()+"%");
	}
	public double getOxigeno() {
		return oxigeno;
	}
	public void setOxigeno(double oxigeno) {
		this.oxigeno = oxigeno;
	}
	public double getNitrogeno() {
		return nitrogeno;
	}
	public void setNitrogeno(double nitrogeno) {
		this.nitrogeno = nitrogeno;
	}
	public double getCarbono() {
		return carbono;
	}
	public void setCarbono(double carbono) {
		this.carbono = carbono;
	}
	public double getVapor() {
		return vapor;
	}
	public void setVapor(double vapor) {
		this.vapor = vapor;
	}

}
