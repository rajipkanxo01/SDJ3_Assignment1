package slaughterHouse.exception;

public class AnimalNotFoundException extends RuntimeException{
    public AnimalNotFoundException(Long id) {
        super("Animal with id:  " + id + " not found");
    }
}
