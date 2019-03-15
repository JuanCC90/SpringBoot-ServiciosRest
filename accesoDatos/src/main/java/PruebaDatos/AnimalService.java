package PruebaDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

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
	
	public List<Animal> getAll(){
		List<Animal> animals = new ArrayList<>();
		for (Animal a : animalRepo.findAll()) {
			animals.add(a);
		}
		return animals;
	}
	
	public List<Animal> setAnimal(Animal nuAnimal) {
		animalRepo.save(nuAnimal);
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
