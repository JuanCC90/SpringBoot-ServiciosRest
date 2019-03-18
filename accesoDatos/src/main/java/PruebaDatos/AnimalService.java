package PruebaDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@Transactional
public class AnimalService {
	
	@Autowired
	private AnimalRepository animalRepo;
	
	
	public List<AnimalDTO> getAll(){
		
		ModelMapper mapper = new ModelMapper();
		
		List<AnimalDTO> animals = new ArrayList<>();
		for (Animal a : animalRepo.findAll()) {
			AnimalDTO dto = mapper.map(a, AnimalDTO.class);
			animals.add(dto);
		}
		return animals;
	}
	
	public List<Animal> setAnimal(AnimalDTO nuAnimal) {
		ModelMapper mapper = new ModelMapper();
		Animal animal = mapper.map(nuAnimal, Animal.class);
		animalRepo.save(animal);
		List<Animal> animals = new ArrayList<>();
		for (Animal a : animalRepo.findAll()) {
			animals.add(a);
		}
		return animals;
	}
	
	public Animal busca(Long nId) {
		return animalRepo.findById(nId).orElseThrow(() -> new AnimalNotFoundException(nId));
	}

	public Animal actualizaAnimal(Animal nuAnimal, long id){
		nuAnimal.setId(id);
		if(animalRepo.findById(id)!=null) {
			animalRepo.save(nuAnimal);
		}
		return animalRepo.findById(id).get(); 	
	}
	
	public List<Animal> borraAnimal(long nId){
		animalRepo.deleteById(nId);
		return animalRepo.findAll();
		
	}
	
}
