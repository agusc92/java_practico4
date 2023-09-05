package sueldo;

import java.util.ArrayList;

public class EmpleadoComision extends Empleado {
	private ArrayList<Double>  ventas ;
	private double comision;
	
	public EmpleadoComision (double sueldoFijo , String nombre , double comision, ArrayList<Double> ventas) {
		super(sueldoFijo , nombre);
		this.ventas = ventas;
		this.comision = comision;
	}
	
	public double calcularSueldo() {
		double aux = 0;
		for(int i = 0;i<ventas.size();i++) {
			aux+=ventas.get(i);
		}
		double result = super.calcularSueldo() + (aux/ventas.size())*comision;
		return result;
	}
	public void agregarVenta(double venta) {
		this.ventas.add(venta);
	}
	public ArrayList<Double> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Double> ventas) {
		this.ventas = ventas;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	
}
