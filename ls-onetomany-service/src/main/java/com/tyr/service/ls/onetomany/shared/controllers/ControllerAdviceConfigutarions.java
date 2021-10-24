package com.tyr.service.ls.onetomany.shared.controllers;

import com.tyr.service.ls.onetomany.shared.exception.domain.ErrorMessage;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Priority;

@RestControllerAdvice
@Priority(Ordered.HIGHEST_PRECEDENCE)
public class ControllerAdviceConfigutarions {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handleException(RuntimeException runtimeException){

    return new ResponseEntity<>(new ErrorMessage(runtimeException.getMessage(),"500","change this") , HttpStatus.INTERNAL_SERVER_ERROR );
    }


}
