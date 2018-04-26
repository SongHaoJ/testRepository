package com.test.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class THandle {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handle(Exception e){
        if(e instanceof TException)
        return "";
        return "";
    }

}
