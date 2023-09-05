package Selecciondefutbol;

import java.time.LocalDate;

public class Futbolista extends Integrante {
	private String posicion;
	private String pie;
	private int cantidadGoles;
	
	
	public Futbolista(String nombre , String apellido , int pasaporte , LocalDate fecha ,
						String roll , String pie , String posicion , int cantidadGoles) {
		super(nombre , apellido , pasaporte , fecha, roll);
		this.pie = pie;
		this.posicion = posicion;
		this.cantidadGoles = cantidadGoles;
	}
	
	
	
	public String getPosicion() {
		return posicion;
	}



	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}



	public String getPie() {
		return pie;
	}
	public void setPie(String pie) {
		this.pie = pie;
	}
	public int getCantidadGoles() {
		return cantidadGoles;
	}
	public void setCantidadGoles(int cantidadGoles) {
		this.cantidadGoles = cantidadGoles;
	}
	
	
	
	
}
