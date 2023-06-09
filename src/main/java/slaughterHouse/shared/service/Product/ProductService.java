package slaughterHouse.shared.service.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.shared.model.ProductEntity;
import slaughterHouse.shared.repository.ProductRepository;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity createProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity findProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new NoSuchElementException
                ("Product with id " + id + " not found"));
    }

    @Override
    public List<ProductEntity> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductEntity> findProductsByType(String type) {
        return productRepository.findByProductType(type);
    }

    @Override
    public List<AnimalEntity> findAnimalsInvolvedInProduct(Long id) {
        Optional<ProductEntity> byId = productRepository.findById(id);
        return byId.get().getInvolvedAnimals();
    }

    /*@Override
    public Collection<slaughterHouse.shared.model.AnimalEntity> findAnimalsInvolvedInProduct(Long id) {


    }*/

   /* @Override
    public Collection<slaughterHouse.shared.model.AnimalEntity> findAnimalsInvolvedInProduct(Long id) {
        ProductEntity productById = findProductById(id);
        return productById.getInvolvedAnimals();
    }*/


    @Override
    public boolean deleteProduct(Long id) {
        try {
            productRepository.delete(findProductById(id));
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
