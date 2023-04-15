package slaughterHouse.restAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterHouse.restAPI.exception.AnimalNotFoundException;
import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.restAPI.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService implements IAnimalService {
    private AnimalRepository animalRepository;

        @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;

        addAnimal(new AnimalEntity(20, LocalDate.of(2023, 1, 10), "ArlaFoods", "Goat"));

    }

    @Override
    public AnimalEntity addAnimal(AnimalEntity animalEntity) {
        return animalRepository.save(animalEntity);
    }

    @Override
    public List<AnimalEntity> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public AnimalEntity getAnimalById(Long id) {
        return animalRepository.findById(id).orElseThrow(() -> new AnimalNotFoundException(id));
    }

    @Override
    public List<AnimalEntity> getAnimalByDate(LocalDate date) {
        return animalRepository.findByArrivalDate(date);
    }

    @Override
    public List<AnimalEntity> getAnimalByOrigin(String originOfAnimal) {
        return animalRepository.findByOrigin(originOfAnimal);
    }

    @Override
    public List<AnimalEntity> getAnimalByType(String type) {
        return animalRepository.findByType(type);
    }


    @Override
    public AnimalEntity updateAnimalInformation(Long registrationNumber, AnimalEntity newAnimalEntity) {
        Optional<AnimalEntity> existingUser = Optional.ofNullable(animalRepository.findById(registrationNumber).orElseThrow(() -> new AnimalNotFoundException(registrationNumber)));
        existingUser.map(animal -> {
            animal.setOrigin(newAnimalEntity.getOrigin());
            animal.setArrivalDate(newAnimalEntity.getArrivalDate());
            animal.setWeight(newAnimalEntity.getWeight());
            animal.setType(newAnimalEntity.getType());
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
