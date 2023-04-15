package slaughterHouse.shared.service.Animal;

import org.springframework.stereotype.Service;
import slaughterHouse.shared.model.AnimalEntity;

import java.time.LocalDate;
import java.util.List;

@Service
public interface IAnimalService {

    //Create
    AnimalEntity addAnimal(AnimalEntity animalEntity);

    //Read
    List<AnimalEntity> getAllAnimals();

    AnimalEntity getAnimalById(Long id);

    List<AnimalEntity> getAnimalByDate(LocalDate date);

    List<AnimalEntity> getAnimalByOrigin(String originOfAnimal);

    List<AnimalEntity> getAnimalByType(String type);

    //Update
    AnimalEntity updateAnimalInformation(Long id, AnimalEntity animalEntity);

    //Delete
    String removeAnimal(Long id);
}
