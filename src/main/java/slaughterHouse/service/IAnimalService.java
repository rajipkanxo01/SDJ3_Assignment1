package slaughterHouse.service;

import org.springframework.stereotype.Service;
import slaughterHouse.model.Animal;

import java.time.LocalDate;
import java.util.Date;
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

    //Update
    Animal updateAnimalInformation(Long id, Animal animal);

    //Delete
    void removeAnimal(Long id);
}
