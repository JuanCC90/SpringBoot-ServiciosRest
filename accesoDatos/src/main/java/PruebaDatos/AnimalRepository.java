package PruebaDatos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AnimalRepository extends CrudRepository<Animal, Long> {
	
	List<Animal> findByNombre(String nombre);
	List<Animal> getById(String id);
	List<Animal> findAll();	
	
}
