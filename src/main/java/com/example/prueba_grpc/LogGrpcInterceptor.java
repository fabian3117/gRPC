package com.example.prueba_grpc;

import io.grpc.*;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@GrpcGlobalClientInterceptor

public class LogGrpcInterceptor implements ClientInterceptor {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        logger.info(methodDescriptor.getFullMethodName());
        logger.info("ACA");
        return channel.newCall(methodDescriptor, callOptions);
    }
}
