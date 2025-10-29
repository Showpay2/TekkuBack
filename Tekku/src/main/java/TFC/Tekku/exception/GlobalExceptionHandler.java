package com.tekku.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

    // añadir más excepciones específicas aquí
}