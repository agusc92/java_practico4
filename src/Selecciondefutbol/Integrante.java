package Selecciondefutbol;

import java.time.LocalDate;

public class Integrante {
	private String nombre;
	private String apellido;
	private int numeroPasaporte;
	private LocalDate fechaNacimiento;
	private String roll;
	private boolean concentracion ,  paisOrigen;
	
	public Integrante(String nombre , String apellido , int pasaporte , LocalDate fecha , String roll) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroPasaporte = pasaporte;
		this.fechaNacimiento = fecha;
	}

	public String obtenerEstado() {
		String estado;
		if(paisOrigen) {
			estado = "En pais de origen";
		}else {
			estado = "viajando";
		}
		if(concentracion) {
			estado += " y en concentracion";
		}
		return estado;
	}
	
	public boolean disponible() {
		return paisOrigen && !concentracion;
	}
	
	
	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(int numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public boolean isConcentracion() {
		return concentracion;
	}
	public void setConcentracion(boolean concentracion) {
		this.concentracion = concentracion;
	}
	
	public boolean isPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(boolean paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
}
