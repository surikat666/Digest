package com.strokova.exception;

/**
 * Created by User on 24.10.2016.
 */
public class HashSumException extends Throwable {
    private String message = "Incorrect hash algorithm";

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
