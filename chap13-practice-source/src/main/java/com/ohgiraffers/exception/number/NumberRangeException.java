package com.ohgiraffers.exception.number;

public class NumberRangeException extends RuntimeException{

    public NumberRangeException() {
    }

    public NumberRangeException(String message) {
        super(message);
    }

    public NumberRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberRangeException(Throwable cause) {
        super(cause);
    }

    public NumberRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
