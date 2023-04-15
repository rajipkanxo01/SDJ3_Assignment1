package slaughterHouse.shared.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import slaughterHouse.grpc.protobuf.AnimalProto;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import slaughterHouse.grpc.protobuf.Animal;


@Entity
public class AnimalEntity {
    @Id
    @Column(name = "registration_number")
    @GeneratedValue
    private Long registrationNumber;
    @Column(name = "weight")
    private int weight;
    @Column(name = "arrival_date")
    private LocalDate arrivalDate;
    @Column(name = "origin")
    private String origin;
    @Column(name = "type")
    private String type;

    public AnimalEntity() {
    }

    public AnimalEntity(int weight, LocalDate arrivalDate, String origin, String type) {
        this.weight = weight;
        this.arrivalDate = arrivalDate;
        this.origin = origin;
        this.type = type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalEntity animalEntity = (AnimalEntity) o;
        return weight == animalEntity.weight && Objects.equals(registrationNumber, animalEntity.registrationNumber) && Objects.equals(arrivalDate, animalEntity.arrivalDate) && Objects.equals(origin, animalEntity.origin) && Objects.equals(type, animalEntity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, weight, arrivalDate, origin, type);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "registrationNumber=" + registrationNumber +
                ", weight=" + weight +
                ", arrivalDate=" + arrivalDate +
                ", origin='" + origin + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


}
