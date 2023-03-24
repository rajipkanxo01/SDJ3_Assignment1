package slaughterHouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import slaughterHouse.exception.AnimalNotFoundException;
import slaughterHouse.model.Animal;
import slaughterHouse.repository.AnimalRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService implements IAnimalService {

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
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
    public Animal updateAnimalInformation(Long id, Animal animal) {
        return null;
    }

    @Override
    public void removeAnimal(Long id) {
    }
}
