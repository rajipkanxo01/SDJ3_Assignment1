package slaughterHouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import slaughterHouse.model.Animal;
import slaughterHouse.service.IAnimalService;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private IAnimalService animalService;

    @PostMapping
    public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal) {
        try {
            Animal createdAnimals = animalService.addAnimal(animal);
            return new ResponseEntity<>(createdAnimals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Animal>> getAllAnimals() {
        try {
            return new ResponseEntity<>(animalService.getAllAnimals(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{registrationNumber}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long registrationNumber) {
        try {
            return new ResponseEntity<>(animalService.getAnimalById(registrationNumber), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/origin/{origin}")
    public ResponseEntity<List<Animal>> getAnimalsByOrigin(@PathVariable("origin") String origin) {
        try {

            return new ResponseEntity<>(animalService.getAnimalByOrigin(origin), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<Animal>> getAnimalByDate(@PathVariable("date") String date) {
        try {
            return new ResponseEntity<>(animalService.getAnimalByDate(LocalDate.parse(date)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Animal>> getAnimalByType(@PathVariable String type) {
        try {
            return ResponseEntity.ok(animalService.getAnimalByType(type));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{registrationNumber}")
    public ResponseEntity<Animal> updateAnimals(@PathVariable Long registrationNumber, @RequestBody Animal animal) {
        try {
            return ok(animalService.updateAnimalInformation(registrationNumber, animal));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{registrationNumber}")
    public ResponseEntity<String> deleteAnimal(@PathVariable Long registrationNumber) {
        try {
            return ResponseEntity.ok(animalService.removeAnimal(registrationNumber));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
