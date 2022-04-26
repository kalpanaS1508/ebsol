package com.EBsol.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> resourceNotFound(ResourceNotFoundException ex) {
        Map<String,Object> errorInfo = new HashMap<>();
       ExceptionResponse response= new ExceptionResponse();
        response.setHttpCode(String.valueOf(HttpStatus.NOT_FOUND.value()));
        response.setMessage(ex.getMessage());
        response.setSuccess(false);
        errorInfo.put("status",response);
        errorInfo.put("data",null);
        return new ResponseEntity<Map<String,Object>>(errorInfo, HttpStatus.NOT_FOUND);
    }

}
