package slaughterHouse.service;

import org.springframework.stereotype.Service;
import slaughterHouse.model.Animal;

import java.time.LocalDate;
import java.util.List;

@Service
public interface IAnimalService {

    //Create
    Animal addAnimal(Animal animal);

    //Read
    List<Animal> getAllAnimals();

    Animal getAnimalById(Long id);

    List<Animal> getAnimalByDate(LocalDate date);

    List<Animal> getAnimalByOrigin(String originOfAnimal);

    List<Animal> getAnimalByType(String type);

    //Update
    Animal updateAnimalInformation(Long id, Animal animal);

    //Delete
    String removeAnimal(Long id);
}
