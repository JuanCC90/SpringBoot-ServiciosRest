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
	public List<AnimalDTO> nuAnimal(@RequestBody AnimalDTO nuAnimal) {
		List<AnimalDTO> animals = aniServi.setAnimal(nuAnimal);
		return animals;
	}

	// Buscar animal por id
	@GetMapping("/animals/get/{nId}")
	public List<AnimalDTO> busqueda(@PathVariable("nId") Long nId) {
		List<AnimalDTO> animals= aniServi.busca(nId);
		return animals;
	}

	// Actualizar animal por id
	@PutMapping("/animals/put/{nId}")
	public List<AnimalDTO> replaceAnimal(@RequestBody Animal newAnimal, @PathVariable Long nId) {
		List<AnimalDTO> animals= aniServi.actualizaAnimal(nuAnimal, id);
		return animals;
	}

	// Borra animal por id
	@DeleteMapping("/animals/delete/{nId}")
	public List<AnimalDTO> deleteAnimal(@PathVariable Long nId) {
		List <AnimalDTO> animals=aniServi.borraAnimal(nId);
		return animals;
	}

}
