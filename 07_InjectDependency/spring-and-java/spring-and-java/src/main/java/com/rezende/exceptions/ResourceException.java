package com.rezende.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceException extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public ResourceException(String ex) {
        super(ex);
    }
}
