package slaughterHouse.shared.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.shared.model.ProductEntity;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<ProductEntity> findProductsByType(String type);
}
