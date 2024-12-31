package com.example.prueba_grpc;

import com.google.protobuf.Empty;
import com.probando.services.grpc.customer.model.HolaGrpc;
import com.probando.services.grpc.customer.model.ejemplo;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class probando extends HolaGrpc.HolaImplBase {
//    @GrpcClient

    @Override
    public void saludo(Empty request, StreamObserver<ejemplo.Mensaje> responseObserver) {
        ejemplo.Mensaje.Builder mensaje = ejemplo.Mensaje.newBuilder();
        ejemplo.Mensaje message = ejemplo.Mensaje.newBuilder().setTexto("Hola gRPC").build();
        responseObserver.onNext(message);
        responseObserver.onCompleted();
//        ejemplo.Mensaje mensaje = new ejemplo.Mensaje("hola");
//        responseObserver.onNext(mensaje..build());
//        responseObserver.onCompleted();
//        super.saludo(request, responseObserver);
    }

    @Override
    public void adios(Empty request, StreamObserver<ejemplo.Mensaje> responseObserver) {
        responseObserver.onNext(ejemplo.Mensaje.newBuilder().setTexto("adios gRPC").build());
        responseObserver.onCompleted();
//        super.adios(request, responseObserver);
    }
}

