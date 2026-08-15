package com.example.snowman;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GEHandler {
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String errorReto(MethodArgumentNotValidException ex){
        String errormsg = ex.getBindingResult().getFieldError().getDefaultMessage(); 
        return "Uh oh! Your Snowman data is invalid. Please check the name and height. " + errormsg;
    }
    
}
