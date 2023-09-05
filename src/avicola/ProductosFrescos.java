package avicola;

import java.time.LocalDate;

public class ProductosFrescos {
	private String nombre;
	private LocalDate fechaVencimiento;
	private int numeroLote;
	private LocalDate fechaEnvasado;
	private Granja granjaOrigen;
	public ProductosFrescos(String nombre ,LocalDate fechaVencimiento, int numeroLote, LocalDate fechaEnvasado, Granja granjaOrigen) {
		this.fechaVencimiento = fechaVencimiento;
		this.numeroLote = numeroLote;
		this.fechaEnvasado = fechaEnvasado;
		this.granjaOrigen = granjaOrigen;
		this.nombre = nombre;
	}
	public void obtenerEtiqueta() {
		System.out.println("////////////////////");
		System.out.println(this.getNombre());
		System.out.println("emvasado "+this.getFechaEnvasado());
		System.out.println("vencimiento: "+this.getFechaVencimiento());
		System.out.println("Granja de origen: " + this.getGranjaOrigen().getNombre());
		System.out.println("numero de lote: "+this.getNumeroLote());
	
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public Granja getGranjaOrigen() {
		return granjaOrigen;
	}
	public void setGranjaOrigen(Granja granjaOrigen) {
		this.granjaOrigen = granjaOrigen;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}
