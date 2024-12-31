package com.example.prueba_grpc;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Funciona aca con interceptor global esto     <---
 *
 */
@GrpcGlobalServerInterceptor
public class OtroInterceptor implements ServerInterceptor {
    Logger logger = LoggerFactory.getLogger(getClass());    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        logger.info("Llamada entrante: {}", call.getMethodDescriptor().getFullMethodName());
        return next.startCall(call, headers);
    }
}
