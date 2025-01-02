package com.course.exception;

public class ResourceNotFoundException extends RuntimeException {

    // Constructor
    public ResourceNotFoundException(String message) {
        super(message);
    }

    // Constructor for wrapping another exception
    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}