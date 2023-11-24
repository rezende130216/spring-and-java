package com.rezende.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class UnsupportedMath extends RuntimeException{
    private static final long serialVersionUID = 1l;

    public UnsupportedMath(String ex) {
        super(ex);
    }
}
