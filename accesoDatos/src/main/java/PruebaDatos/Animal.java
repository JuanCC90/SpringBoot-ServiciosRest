package PruebaDatos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	//Entorno:
	
	@Id
	private long id;
	private String nombre;
	private String color;
	private String extremidades;
	
	//Constructores:
	protected Animal() {
		
	}
	
	public Animal(long id, String nombre, String color, String nExtremidades) {
		this.id = id;
		this.nombre=nombre;
		this.color=color;
		this.extremidades=nExtremidades;	
	}
	
	public Animal(String nombre, String color, String nExtremidades) {
		this.nombre=nombre;
		this.color=color;
		this.extremidades=nExtremidades;	
	}
	
	//Metodos-Funciones:
	public long getId() {
		return id;
	}
	
	public void setId(long nId) {
		this.id=nId;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getExtremidades() {
		return extremidades;
	}
	
	public void setExtremidades(String nExtremidades) {
		this.extremidades=nExtremidades;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Customer[nId=%d, nombre='%s', color='%s', nExtremidades='%d']",
				id,nombre,color,extremidades);
	}

}
