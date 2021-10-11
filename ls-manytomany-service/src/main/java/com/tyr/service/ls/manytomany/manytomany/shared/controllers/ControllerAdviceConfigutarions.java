package com.tyr.service.ls.manytomany.manytomany.shared.controllers;

import com.tyr.service.ls.manytomany.manytomany.shared.exception.domain.ErrorMessage;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Priority;
import java.time.LocalDateTime;

@RestControllerAdvice
@Priority(Ordered.HIGHEST_PRECEDENCE)
public class ControllerAdviceConfigutarions {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handleException(RuntimeException runtimeException){
        LocalDateTime localDateTime= LocalDateTime.now();

    return new ResponseEntity<>(new ErrorMessage(runtimeException.getMessage(),"500",localDateTime.toString()) , HttpStatus.INTERNAL_SERVER_ERROR );
    }


}
