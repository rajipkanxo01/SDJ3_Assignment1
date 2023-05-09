package slaughterHouse.shared.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue
    private Long productId;
    private String productType;
    private int productWeight;

    @OneToMany
    private List<AnimalEntity> involvedAnimals;

    public ProductEntity(String productType, int productWeight, List<AnimalEntity> involvedAnimals) {
        this.productType = productType;
        this.productWeight = productWeight;
        this.involvedAnimals = involvedAnimals;
    }

    public ProductEntity() {

    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public List<AnimalEntity> getInvolvedAnimals() {
        return involvedAnimals;
    }

    public void setInvolvedAnimals(List<AnimalEntity> involvedAnimals) {
        this.involvedAnimals = involvedAnimals;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId=" + productId +
                ", productType='" + productType + '\'' +
                ", productWeight=" + productWeight +
                ", involvedAnimals=" + involvedAnimals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return productWeight == that.productWeight && Objects.equals(productId, that.productId) && Objects.equals(productType, that.productType) && Objects.equals(involvedAnimals, that.involvedAnimals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productType, productWeight, involvedAnimals);
    }
}
