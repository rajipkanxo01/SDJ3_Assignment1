package slaughterHouse.grpc.service;

import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterHouse.grpc.protobuf.*;
import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.restAPI.service.AnimalService;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase {

    @Autowired
    private AnimalService animalService;


    @Override
    public void findAnimalById(id request, StreamObserver<AnimalProto> responseObserver) {
        Long registrationNumber = Long.valueOf(request.getRegistrationNumber());
        AnimalEntity animalById = animalService.getAnimalById(registrationNumber);

        if (animalById == null) {
            Metadata metadata = new Metadata();
            responseObserver.onError(Status.UNAVAILABLE.withDescription("Animal Not Found!").asRuntimeException(metadata));
        } else {
            AnimalProto animalProto = AnimalMapper.toProto(animalById);
            responseObserver.onNext(animalProto);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void findAllAnimals(empty request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> allAnimals = animalService.getAllAnimals();
        addAnimalsToBuilder(responseObserver, allAnimals);
    }

    @Override
    public void findAnimalsByOrigin(origin request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> allAnimalsByOrigin = animalService.getAnimalByOrigin(request.getOrigin());
        addAnimalsToBuilder(responseObserver, allAnimalsByOrigin);
    }

    @Override
    public void findAnimalsByType(type request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> allAnimalsByType = animalService.getAnimalByType(request.getType());
        addAnimalsToBuilder(responseObserver, allAnimalsByType);
    }

    @Override
    public void findAnimalsByDate(date request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> animalByDate = animalService.getAnimalByDate(LocalDate.parse(request.getDate()));
        addAnimalsToBuilder(responseObserver, animalByDate);
    }

    private static void addAnimalsToBuilder(StreamObserver<AnimalListProto> responseObserver, List<AnimalEntity> animalEntities) {
        AnimalListProto.Builder animalListBuilder = AnimalListProto.newBuilder();

        for (AnimalEntity animal : animalEntities) {
            AnimalProto animalProto = AnimalMapper.toProto(animal);
            animalListBuilder.addAllAllAnimals(Collections.singleton(animalProto));
        }

        responseObserver.onNext(animalListBuilder.build());
        responseObserver.onCompleted();
    }
}
