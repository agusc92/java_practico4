package Selecciondefutbol;

import java.time.LocalDate;
import java.util.ArrayList;

public class Club {
	private ArrayList<Integrante> integrantes;
	
	public Club() {
		this.integrantes = new ArrayList<Integrante>();
	}
	
	public void agregarIntegrante(Integrante integrante) {
		this.integrantes.add(integrante);
	}
	
	public void agregarIntegrantes(ArrayList<Integrante> integrantes) {
		this.integrantes.addAll(integrantes);
	}
	public  Club(ArrayList<Integrante> integrantes) {
		this.integrantes = integrantes;
	}
	public ArrayList<Integrante> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<Integrante> integrantes) {
		this.integrantes = integrantes;
	}
	
	public static void main(String[] Args) {
		Club sanlorenzo = new Club();
		Futbolista lorenzo = new Futbolista("Lorenzo" , "fernandez" , 235 ,  LocalDate.of(2030 , 04 , 23) 
								,"Futbolista" , "derecho" ,"delantero" , 6);
		Integrante lorenzo2 = new Integrante("Lorenzo2" , "fernandez" , 23521 ,  LocalDate.of(2032 , 04 , 23) 
				,"Cuerpo Tecnico" );
		Futbolista lorenzo3 = new Futbolista("Lorenzo3" , "fernandez" , 23543 ,  LocalDate.of(2031 , 04 , 23) 
				,"Futbolista" , "izquierdo" ,"defensa" , 6);
		Integrante lorenzo4 = new Integrante("Lorenzo4" , "fernandez" , 235 ,  LocalDate.of(2030 , 04 , 23) 
				,"Masajista");
		Futbolista lorenzo5 = new Futbolista("Lorenzo5" , "fernandez" , 235 ,  LocalDate.of(2030 , 04 , 23) 
				,"Futbolista" , "derecho" ,"delantero" , 65);
		lorenzo.setPaisOrigen(true);
		lorenzo2.setPaisOrigen(true);
		lorenzo2.setConcentracion(true);
		
		sanlorenzo.agregarIntegrante(lorenzo);
		sanlorenzo.agregarIntegrante(lorenzo2);
		sanlorenzo.agregarIntegrante(lorenzo3);
		sanlorenzo.agregarIntegrante(lorenzo4);
		sanlorenzo.agregarIntegrante(lorenzo5);
		
		for(int i =0 ; i<sanlorenzo.getIntegrantes().size();i++) {
			System.out.println(sanlorenzo.getIntegrantes().get(i).getNombre() +" "+ 
					sanlorenzo.getIntegrantes().get(i).getApellido()+" " +
					sanlorenzo.getIntegrantes().get(i).obtenerEstado() + " " +
					sanlorenzo.getIntegrantes().get(i).disponible());
		}
	}		
	}


