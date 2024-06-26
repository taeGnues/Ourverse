package org.portfolio.ourverse.common.exceptions;


import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final ExceptionCode exceptionCode;

    public BaseException(ExceptionCode exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public BaseException(String message, ExceptionCode exceptionCode) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public BaseException(String message, Throwable cause, ExceptionCode exceptionCode) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
    }

    public BaseException(Throwable cause, ExceptionCode exceptionCode) {
        super(cause);
        this.exceptionCode = exceptionCode;
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionCode exceptionCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.exceptionCode = exceptionCode;
    }
}
