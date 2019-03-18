package PruebaDatos;

import org.springframework.data.annotation.Id;

import lombok.Data;

import PruebaDatos.Animal;
import PruebaDatos.ControladorRest;

@Data
public class AnimalDTO {
	
	//Entorno:
	@Id
	private long id;
	private String nombre;
	private String color;
	private String extremidades;
	
	
	public boolean esAnimalDeGranja() {
		if(this.nombre == "pollo") {
			return true;
		}
		return false;
	}
	
	
	
}
