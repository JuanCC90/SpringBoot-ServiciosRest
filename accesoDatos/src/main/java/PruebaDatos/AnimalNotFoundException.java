package PruebaDatos;

public class AnimalNotFoundException extends RuntimeException {
	
	AnimalNotFoundException(long nId){
		super("No se ha encontrado al animal con id: "+nId);
	}

}
