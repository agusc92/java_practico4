package avicola;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Granja granja = new Granja("Ranco de poppy","quequen");
		ProductosFrescos producto1 = new ProductosFrescos("melon",LocalDate.of(2023,5,12),239,
										LocalDate.of(2023,12,20),granja);
		ProductosFrescos producto2 = new ProductoCongeladoAgua("pescado",LocalDate.of(2023,5,12),239,
				LocalDate.of(2023,12,20),granja,938,-5,13);
		ProductosFrescos producto3 = new ProductoCongeladoNitrogeno("sandia",LocalDate.of(2023,5,12),239,
				LocalDate.of(2023,12,20),granja,769,-25,27);
		ProductosFrescos producto5 = new ProductoCongeladoAire("pollo",LocalDate.of(2023,5,12),239,
				LocalDate.of(2023,12,20),granja,769,-25,27,30.4,13.2,38.7);
		ProductosFrescos producto4 = new ProductoRefrijerado("tomate",LocalDate.of(2023,5,12),239,
				LocalDate.of(2023,12,20),granja,453,15);
		
		producto4.obtenerEtiqueta();
	}
	
	

}
