package slaughterHouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import slaughterHouse.model.Animal;
import slaughterHouse.service.IAnimalService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping()
public class AnimalController {
    @Autowired
    private IAnimalService animalService;

    @PostMapping("/animals")
    public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal) {
        try {
            Animal createdAnimals = animalService.addAnimal(animal);
            System.out.println("Post: " + createdAnimals);
            return new ResponseEntity<>(createdAnimals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals")
    public ResponseEntity<List<Animal>> getAllAnimals() {
        try {
            System.out.println("Get: " + animalService.getAllAnimals().size());
            return new ResponseEntity<>(animalService.getAllAnimals(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals/{registrationNumber}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long registrationNumber) {
        try {
            return new ResponseEntity<>(animalService.getAnimalById(registrationNumber), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals/origin/{origin}")
    public ResponseEntity<List<Animal>> getAnimalsByOrigin(@PathVariable("origin") String origin) {
        try {

            return new ResponseEntity<>(animalService.getAnimalByOrigin(origin), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animals/date/{date}")
    public ResponseEntity<List<Animal>> getAnimalByDate(@PathVariable("date") String date) {
        try {

            return new ResponseEntity<>(animalService.getAnimalByDate(LocalDate.parse(date)), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
