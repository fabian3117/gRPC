package com.example.prueba_grpc;

import io.grpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
//import io.grpc.InternalServerInterceptors.*
import org.springframework.context.annotation.Configuration;
import io.grpc.ServerInterceptor;
//import io.grpc.ServerRegistry;

//import io.grpc.ServerInterceptorRegistry;

@Configuration
public class Interceptor_gRPC {

    @Bean
    public ServerInterceptor loggingInterceptor() {
        Logger logger = LoggerFactory.getLogger(getClass());

        return new ServerInterceptor() {
            @Override
            public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
                    ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                // Log de la llamada entrante
                logger.info("Llamada entrante: {}", call.getMethodDescriptor().getFullMethodName());
                return next.startCall(call, headers);
            }
//            ServerRegistry
        };
}

    @Bean
    public ServerInterceptor testInterceptor() {
        Logger logger = LoggerFactory.getLogger(getClass());
        return new ServerInterceptor() {
            @Override
            public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
                    ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                // Log de la llamada entrante
                logger.info("prs");
                return next.startCall(call, headers);
            }
//            ServerRegistry
        };
    }

/*
    @Bean
    public ServerInterceptorRegistry serverInterceptorRegistry(
            LoggingInterceptor loggingInterceptor{
        return ServerInterceptorRegistry.builder()
                .add(loggingInterceptor)
                .add(authenticationInterceptor)
                .build();
    }

 */
}
