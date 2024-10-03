package com.scaler.bookmyshow.exception;

public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException (String message) {
        super(message);
    }
}
