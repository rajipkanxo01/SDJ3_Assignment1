package slaughterHouse.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import slaughterHouse.shared.model.AnimalEntity;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
    List<AnimalEntity> findByOrigin(String origin);

    List<AnimalEntity> findByArrivalDate(LocalDate arrivalDate);

    List<AnimalEntity> findByType(String type);
}

