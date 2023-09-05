package sueldo;

import java.util.ArrayList;

public class Empresa {
	private ArrayList <Empleado> empleados = new ArrayList<Empleado>();
	private int diasHabiles = 6;
	public void calcularSueldoDiario(Empleado empleado) {
		System.out.println("el empleado "+empleado.getNombre() +
							 " gana diariamente " +empleado.calcularSueldo());
	}
	
	public void calcularSueldoSemanal(Empleado empleado) {
		
		
		
		System.out.println("el empleado "+empleado.getNombre() +
				 "gana semanalmente " +empleado.getSueldoFijo()*diasHabiles);
		
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		ArrayList<Double> list = new ArrayList<Double>() ;
		list.add(50.0);
		list.add(50.0);
		list.add(50.0);
		list.add(50.0);
		list.add(50.0);
		empresa.agregarEmpleado(new Empleado(90000 ,"juan" ));
		empresa.agregarEmpleado(new Empleado(80000 ,"pedro" ));
		empresa.agregarEmpleado(new EmpleadoExtra(800000 ,"martin",20,800 ));
		empresa.agregarEmpleado(new EmpleadoComision(800000 ,"ricardo",0.5,list ));
		empresa.agregarEmpleado(new EmpleadoExtra(800000 ,"marcelo",15,740 ));
		empresa.agregarEmpleado(new EmpleadoComision(800000 ,"daniel",2, list ));

		for(int i = 0;i<empresa.getEmpleados().size();i++) {
			empresa.calcularSueldoDiario(empresa.getEmpleados().get(i));		
			}
		for(int i = 0;i<empresa.getEmpleados().size();i++) {
			empresa.calcularSueldoSemanal(empresa.getEmpleados().get(i));		
			}
		
	}
	
	

}
