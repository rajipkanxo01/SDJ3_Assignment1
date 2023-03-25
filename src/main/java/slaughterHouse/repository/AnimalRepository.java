package slaughterHouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import slaughterHouse.model.Animal;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByOrigin(String origin);

    List<Animal> findByArrivalDate(LocalDate arrivalDate);

    List<Animal> findByType(String type);
}

