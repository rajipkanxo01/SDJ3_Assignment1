package slaughterHouse.grpc.service;

import slaughterHouse.grpc.protobuf.AnimalProto;
import slaughterHouse.shared.model.AnimalEntity;

import java.time.LocalDate;

public class AnimalMapper {

    // toProto() method creates and returns a Protocol Buffers Animal message based on the properties of the
    // current Animal object
    public static AnimalProto toProto(AnimalEntity animalEntity) {
        AnimalProto.Builder animalProtoBuilder = AnimalProto.newBuilder()
                .setRegistrationNumber(animalEntity.getRegistrationNumber())
                .setWeight(animalEntity.getWeight())
                .setArrivalDate(String.valueOf(animalEntity.getArrivalDate()))
                .setOrigin(animalEntity.getOrigin())
                .setType(animalEntity.getType());
        return animalProtoBuilder.build();
    }

    // fromProto() method takes a Protocol Buffers Animal message as input and returns an Animal object.
    public static AnimalEntity fromProto(AnimalProto animalProto) {
        AnimalEntity animalEntity = new AnimalEntity();
        animalEntity.setRegistrationNumber(animalProto.getRegistrationNumber());
        animalEntity.setWeight(animalProto.getWeight());
        animalEntity.setArrivalDate(LocalDate.parse(animalProto.getArrivalDate()));
        animalEntity.setOrigin(animalProto.getOrigin());
        animalEntity.setType(animalProto.getType());
        return animalEntity;
    }
}
