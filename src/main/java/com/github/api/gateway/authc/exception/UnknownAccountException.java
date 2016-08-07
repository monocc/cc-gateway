package com.github.api.gateway.authc.exception;

/**
 * Created by chdyan on 16/8/3.
 */
public class UnknownAccountException extends AuthenticationRuntimeException {
    public UnknownAccountException() {
    }

    public UnknownAccountException(String message) {
        super(message);
    }

    public UnknownAccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownAccountException(Throwable cause) {
        super(cause);
    }
}