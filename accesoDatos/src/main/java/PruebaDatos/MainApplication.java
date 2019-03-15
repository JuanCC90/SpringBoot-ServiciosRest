package PruebaDatos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {
	private static final Logger log= LoggerFactory.getLogger(MainApplication.class);
	
	public static void main(String []args) {
		SpringApplication.run(MainApplication.class);
	}
	
//	@Bean
//	public CommandLineRunner demo(animalRepository repository) {
//		return (args) -> {
//			repository.save(new animal("Perro","Blanco",(short)4));
//			repository.save(new animal("Gato","Negro",(short)4));
//			repository.save(new animal("Vaca","Manchas",(short)4));
//			repository.save(new animal("Pajaro","Amarillo",(short)2));
//			repository.save(new animal("Pajaro","Verde",(short)2));
//			repository.save(new animal("Rata","Gris",(short)4));
//			repository.save(new animal("Caballo","Marron",(short)4));
//			
//			
//			//Mostrar Todos Animales
//			log.info("Mostrar todos los animales con findAll: ");
//			for(animal animales: repository.findAll()) {
//				log.info(animales.toString());				
//			}
//			log.info(" ");
//			
//			//Recuperar Animales Individualmente por num Ident.
//			repository.findById(2L).ifPresent(animales ->{
//				log.info("Animal encontrado por numId(x): ");
//				log.info(animales.toString());
//				log.info(" ");
//			});
//			
//			//Animales encontrados por nombre
//			log.info("Animal encontrado por Nombre('Pajaro'): ");
//			repository.findByNombre("Pajaro").forEach(pajaro -> {
//				log.info(pajaro.toString());
//			});
//			log.info(" ");
//			
//			//Cuenta cuantos animales tenemos
//			log.info("Numero de animales que hay en el repositorio: ");
//			long numAnim = repository.count();
//			log.info("El numero de animales en la lista es de: "+numAnim);
//			log.info(" ");
//			
//			//Borraremos todos los animales para hacer la prueba
//			log.info("Vamos a borrar un animal");
//			repository.deleteAll();
//			log.info(" ");
//			
//			
//			//Mostrar Todos Animales
//			log.info("Mostrar todos los animales con findAll: ");
//			for(animal animales: repository.findAll()) {
//				log.info(animales.toString());				
//			}
//			log.info(" ");
//			
//	};

//}
}
