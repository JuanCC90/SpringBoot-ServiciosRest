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
	
	
	/*public boolean esAnimalDeGranja() {
		if(this.nombre == "pollo") {
			return true;
		}
		return false;
	}*/
	
	public void setId(long id) {
		this.id=id;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setString(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setExtremidades(String extremidades) {
		this.extremidades=extremidades;
	}
	
	public String getExtremidades() {
		return this.extremidades;
	}
	
}
