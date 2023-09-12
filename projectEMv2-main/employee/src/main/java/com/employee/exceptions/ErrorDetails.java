package com.employee.exceptions;
import java.time.LocalDateTime;

public class ErrorDetails {
    private LocalDateTime timestamp;
    private int errorCode;
    private String message;
    private String description;


    public ErrorDetails(LocalDateTime now, int code, String message, String description) {

    }
}


