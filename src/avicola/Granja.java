package avicola;

public class Granja {
	private String nombre;
	private String localidad;
	
	public Granja(String nombre , String localidad) {
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
}
