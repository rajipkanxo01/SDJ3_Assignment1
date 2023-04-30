package slaughterHouse.grpc.service;

import com.google.protobuf.Empty;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterHouse.grpc.protobuf.animals.AnimalListProto;
import slaughterHouse.grpc.protobuf.animals.AnimalProto;
import slaughterHouse.grpc.protobuf.animals.AnimalServiceGrpc;
import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.shared.service.Animal.AnimalService;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase {

    @Autowired
    private AnimalService animalService;

    @Override
    public void findAnimalById(Int64Value request, StreamObserver<AnimalProto> responseObserver) {
        Long registrationNumber = request.getValue();
        AnimalEntity animalById = animalService.getAnimalById(registrationNumber);

        if (animalById == null) {
            Metadata metadata = new Metadata();
            responseObserver.onError(Status.UNAVAILABLE.withDescription("Animal Not Found!").asRuntimeException(metadata));
        } else {
            AnimalProto animalProto = toProto(animalById);
            responseObserver.onNext(animalProto);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void findAllAnimals(Empty request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> allAnimals = animalService.getAllAnimals();
        addAnimalsToBuilder(responseObserver, allAnimals);
    }

    @Override
    public void findAnimalsByOrigin(StringValue request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> allAnimalsByOrigin = animalService.getAnimalByOrigin(request.getValue());
        addAnimalsToBuilder(responseObserver, allAnimalsByOrigin);
    }

    @Override
    public void findAnimalsByType(StringValue request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> allAnimalsByType = animalService.getAnimalByType(request.getValue());
        addAnimalsToBuilder(responseObserver, allAnimalsByType);
    }

    @Override
    public void findAnimalsByDate(StringValue request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> animalByDate = animalService.getAnimalByDate(LocalDate.parse(request.getValue()));
        addAnimalsToBuilder(responseObserver, animalByDate);
    }

    private static void addAnimalsToBuilder(StreamObserver<AnimalListProto> responseObserver, List<AnimalEntity> animalEntities) {
        AnimalListProto.Builder animalListBuilder = AnimalListProto.newBuilder();

        for (AnimalEntity animal : animalEntities) {
            AnimalProto animalProto = toProto(animal);
            animalListBuilder.addAllAllAnimals(Collections.singleton(animalProto));
        }

        responseObserver.onNext(animalListBuilder.build());
        responseObserver.onCompleted();
    }

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
