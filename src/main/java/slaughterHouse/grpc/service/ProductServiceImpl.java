package slaughterHouse.grpc.service;

import com.google.protobuf.*;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.checkerframework.common.value.qual.BoolVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import slaughterHouse.grpc.protobuf.animals.AnimalListProto;
import slaughterHouse.grpc.protobuf.animals.AnimalProto;
import slaughterHouse.grpc.protobuf.product.ProductListProto;
import slaughterHouse.grpc.protobuf.product.ProductProto;
import slaughterHouse.grpc.protobuf.product.ProductsServiceGrpc;
import slaughterHouse.shared.model.AnimalEntity;
import slaughterHouse.shared.model.ProductEntity;
import slaughterHouse.shared.service.Animal.AnimalService;
import slaughterHouse.shared.service.Product.IProductService;
import slaughterHouse.shared.service.Product.ProductService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl extends ProductsServiceGrpc.ProductsServiceImplBase {
    @Autowired
    private IProductService productService;

    @Override
    public void createProduct(ProductProto request, StreamObserver<ProductProto> responseObserver) {
        productService.createProduct(fromProto(request));
    }

    @Override
    public void findProductById(Int64Value request, StreamObserver<ProductProto> responseObserver) {
        Long id = request.getValue();
        ProductEntity byId = productService.findProductById(id);

        if (byId == null) {
            Metadata metadata = new Metadata();
            responseObserver.onError(Status.UNAVAILABLE.withDescription("Product Not Found!").asRuntimeException(metadata));
        } else {
            ProductProto productProto = toProto(byId);
            responseObserver.onNext(productProto);
            responseObserver.onCompleted();
        }

    }

    @Override
    public void findAllProducts(Empty request, StreamObserver<ProductListProto> responseObserver) {
        List<ProductEntity> allProducts = productService.findAllProducts();
        addProductsToBuilder(responseObserver, allProducts);

    }


    @Override
    public void findProductsByType(StringValue request, StreamObserver<ProductListProto> responseObserver) {
        List<ProductEntity> productsByType = productService.findProductsByType(request.getValue());
        addProductsToBuilder(responseObserver, productsByType);
    }

    @Override
    public void findAnimalsInvolvedInProduct(Int64Value request, StreamObserver<AnimalListProto> responseObserver) {
        List<AnimalEntity> animalsInvolvedInProduct = productService.findAnimalsInvolvedInProduct(request.getValue());
        AnimalServiceImpl.addAnimalsToBuilder(responseObserver, animalsInvolvedInProduct);
    }

    @Override
    public void deleteProduct(Int64Value request, StreamObserver<BoolValue> responseObserver) {
        boolean deleteProduct = productService.deleteProduct(request.getValue());
        responseObserver.onNext(BoolValue.of(deleteProduct));
    }


    private void addProductsToBuilder(StreamObserver<ProductListProto> responseObserver, List<ProductEntity> allProducts) {
        ProductListProto.Builder productBuilder = ProductListProto.newBuilder();

        for (ProductEntity allProduct : allProducts) {
            ProductProto productProto = toProto(allProduct);
            productBuilder.addAllProducts(productProto);
        }

        responseObserver.onNext(productBuilder.build());
        responseObserver.onCompleted();
    }

    public static ProductProto toProto(ProductEntity productEntity) {
        AnimalListProto.Builder animalBuilder = AnimalListProto.newBuilder();
        ProductProto.Builder productProtoBuilder = ProductProto.newBuilder()
                .setProductId(productEntity.getProductId())
                .setProductType(StringValue.of(productEntity.getProductType()))
                .setProductWeight(productEntity.getProductWeight());

        for (AnimalEntity involvedAnimal : productEntity.getInvolvedAnimals()) {
            animalBuilder.addAllAnimals(AnimalServiceImpl.toProto(involvedAnimal));
        }

        productProtoBuilder.setInvolvedAnimals(animalBuilder);
        return productProtoBuilder.build();
    }

    // fromProto() method takes a Protocol Buffers Animal message as input and returns an Animal object.
    public static ProductEntity fromProto(ProductProto productProto) {
        List<AnimalEntity> animalEntities = new ArrayList<>();
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(productProto.getProductId());
        productEntity.setProductType(String.valueOf(productProto.getProductType()));
        productEntity.setProductWeight(productProto.getProductWeight());

        for (AnimalProto animalProto : productProto.getInvolvedAnimals().getAllAnimalsList()) {
            animalEntities.add(AnimalServiceImpl.fromProto(animalProto));
        }

        productEntity.setInvolvedAnimals(animalEntities);
        return productEntity;
    }
}
