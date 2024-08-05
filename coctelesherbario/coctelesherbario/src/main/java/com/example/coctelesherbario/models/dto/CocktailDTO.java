package com.example.coctelesherbario.models.dto;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
public class CocktailDTO {

    private String name;
    private float price;
    private String flavor;
    private String aroma;
    private String color;
    private String presentation;
    private String texture;
    private String originCountry;
    private String style;
    private String type;
    private String juice;
    private byte dueDate;
}