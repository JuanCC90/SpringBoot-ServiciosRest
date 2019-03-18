package PruebaDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;

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
	
	public List<AnimalDTO> setAnimal(AnimalDTO nuAnimal) {
		ModelMapper mapper = new ModelMapper();
		Animal animal = mapper.map(nuAnimal, Animal.class);
		animalRepo.save(animal);
		List<AnimalDTO> animals= new ArrayList<>();
		for(Animal a:animalRepo.findAll()) {
			AnimalDTO dto = mapper.map(a, AnimalDTO.class);
			animals.add(dto);
		}
		return animals;
	}
	
	public List<AnimalDTO> busca(Long nId) {
		ModelMapper mapper = new ModelMapper();
		Animal animal=mapper.map(nId, Animal.class);
		animalRepo.findById(nId);
		List<AnimalDTO> animals = new ArrayList<>();
		for(Animal a:animalRepo.findById(nId)) {
			AnimalDTO dto =  mapper.map(a, AnimalDTO.class);
			animals.add(dto);
		}
		return animals;
	}

	public List<AnimalDTO> actualizaAnimal(Animal nuAnimal, long id){
		nuAnimal.setId(id);
		if(animalRepo.findById(id)!=null) {
			animalRepo.save(nuAnimal);
		}
		return animalRepo.findById(id).get(); 	
	}
	
	public List<AnimalDTO> borraAnimal(long nId){
		ModelMapper mapper = new ModelMapper();
		animalRepo.deleteById(nId);
		List<AnimalDTO> animals = new ArrayList<>();
		for(Animal a:animalRepo.findAll()) {
			AnimalDTO dto= mapper.map(a, AnimalDTO.class);
			animals.add(dto);
		}
		return animals;
		
	}
	
}
