package slaughterHouse.shared.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
public class AnimalEntity {
    @Id
    @GeneratedValue
    private Long registrationNumber;

    private int weight;

    private LocalDate arrivalDate;

    private String origin;

    private String type;
//    private List<ProductEntity> involvedInProducts;


    public AnimalEntity() {
    }

    public AnimalEntity(int weight, LocalDate arrivalDate, String origin, String type) {
        this.weight = weight;
        this.arrivalDate = arrivalDate;
        this.origin = origin;
        this.type = type;
//        involvedInProducts = new ArrayList<>();
    }

    public void setRegistrationNumber(Long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getRegistrationNumber() {
        return registrationNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String animalOrigin) {
        this.origin = animalOrigin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public List<ProductEntity> getInvolvedInProducts() {
//        return involvedInProducts;
//    }

//    public void setInvolvedInProducts(List<ProductEntity> involvedInProducts) {
//        this.involvedInProducts = involvedInProducts;
//    }

    @Override
    public String toString() {
        return "AnimalEntity{" +
                "registrationNumber=" + registrationNumber +
                ", weight=" + weight +
                ", arrivalDate=" + arrivalDate +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
//                ", involvedInProducts=" + involvedInProducts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntity animal = (AnimalEntity) o;
        return weight == animal.weight && Objects.equals(registrationNumber, animal.registrationNumber) && Objects.equals(arrivalDate, animal.arrivalDate) && Objects.equals(origin, animal.origin) && Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, weight, arrivalDate, origin, type);
    }
}
