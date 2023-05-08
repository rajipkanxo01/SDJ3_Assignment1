package slaughterHouse.shared.service.Product;

import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.shared.model.ProductEntity;

import java.util.List;

public interface IProductService {
    ProductEntity createProduct(ProductEntity productEntity);
    ProductEntity findProductById(Long id);
    List<ProductEntity> findAllProducts();
    List<ProductEntity> findProductsByType(String type);
    List<AnimalEntity> findAnimalsInvolvedInProduct(Long id);
    boolean deleteProduct(Long id);

}
