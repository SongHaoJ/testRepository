package com.test.exception;

import lombok.Data;

@Data
public class TException extends RuntimeException {

    private int code;

    private String message;

}
