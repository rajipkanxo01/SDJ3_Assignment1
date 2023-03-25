package slaughterHouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterHouse.exception.AnimalNotFoundException;
import slaughterHouse.model.Animal;
import slaughterHouse.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService implements IAnimalService {

    private AnimalRepository animalRepository;

    //    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;

        addAnimal(new Animal(20, LocalDate.of(2023, 1, 10), "ArlaFoods", "Goat"));

    }

    @Override
    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id).orElseThrow(() -> new AnimalNotFoundException(id));
    }

    @Override
    public List<Animal> getAnimalByDate(LocalDate date) {
        return animalRepository.findByArrivalDate(date);
    }

    @Override
    public List<Animal> getAnimalByOrigin(String originOfAnimal) {
        return animalRepository.findByOrigin(originOfAnimal);
    }

    @Override
    public List<Animal> getAnimalByType(String type) {
        return animalRepository.findByType(type);
    }


    @Override
    public Animal updateAnimalInformation(Long registrationNumber, Animal newAnimal) {
        Optional<Animal> existingUser = Optional.ofNullable(animalRepository.findById(registrationNumber).orElseThrow(() -> new AnimalNotFoundException(registrationNumber)));
        existingUser.map(animal -> {
            animal.setOrigin(newAnimal.getOrigin());
            animal.setArrivalDate(newAnimal.getArrivalDate());
            animal.setWeight(newAnimal.getWeight());
            animal.setType(newAnimal.getType());
            System.out.println(animalRepository.save(animal));
            return animalRepository.save(animal);
        });
        return null;
    }

    @Override
    public String removeAnimal(Long id) {
        String response = "Animal with " + id + " successfully deleted";
        animalRepository.delete(getAnimalById(id));
        return response;
    }
}
