package com.example.coctelesherbario.exception.custom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CocktailException extends RuntimeException {
    public CocktailException(String message) {
        super(message);
    }
}