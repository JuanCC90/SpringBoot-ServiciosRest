package PruebaDatos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

	@Autowired
	private AnimalService aniServi;

	// Devuelve todos los elementos de la base de datos
	@RequestMapping("/animals")
	public List<AnimalDTO> getAll() {
		return aniServi.getAll();
	}

	// Metodo para añadir elementos a la BD
	@PostMapping("/animals/post")
	public List<Animal> nuAnimal(@RequestBody AnimalDTO nuAnimal) {
		List<Animal> animals = aniServi.setAnimal(nuAnimal);
		return animals;
	}

	// Buscar animal por id
	@GetMapping("/animals/get/{nId}")
	public Animal busqueda(@PathVariable("nId") Long nId) {
		return aniServi.busca(nId);
	}

	// Actualizar animal por id
	@PutMapping("/animals/put/{nId}")
	public Animal replaceAnimal(@RequestBody Animal newAnimal, @PathVariable Long nId) {

		return aniServi.actualizaAnimal(newAnimal, nId);
	}

	// Borra animal por id
	@DeleteMapping("/animals/delete/{nId}")
	public List<Animal> deleteAnimal(@PathVariable Long nId) {
		return aniServi.borraAnimal(nId);
	}

}
