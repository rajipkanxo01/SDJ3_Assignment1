// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: animal.proto

package slaughterHouse.grpc.protobuf.animals;

public interface AnimalProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnimalProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 registrationNumber = 1;</code>
   */
  long getRegistrationNumber();

  /**
   * <code>optional int32 weight = 2;</code>
   */
  int getWeight();

  /**
   * <code>optional string arrivalDate = 3;</code>
   */
  java.lang.String getArrivalDate();
  /**
   * <code>optional string arrivalDate = 3;</code>
   */
  com.google.protobuf.ByteString
      getArrivalDateBytes();

  /**
   * <code>optional string origin = 4;</code>
   */
  java.lang.String getOrigin();
  /**
   * <code>optional string origin = 4;</code>
   */
  com.google.protobuf.ByteString
      getOriginBytes();

  /**
   * <code>optional string type = 5;</code>
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 5;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}