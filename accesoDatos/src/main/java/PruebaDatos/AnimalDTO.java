package PruebaDatos;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class AnimalDTO {
	
	//Entorno:
	@Id
	private long id;
	private String nombre;
	private String color;
	private String extremidades;
	private String patat;
	
	public boolean esAnimalDeGranja() {
		if(this.nombre == "pollo") {
			return true;
		}
		return false;
	}
}
