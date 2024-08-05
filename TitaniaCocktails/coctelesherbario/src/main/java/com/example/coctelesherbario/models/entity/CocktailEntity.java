package com.example.coctelesherbario.models.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "cocktail")
public class CocktailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;
    private String flavor;
    private String aroma;
    private String color;
    private String presentation;
    private String texture;
    @Column(name = "origin_country")
    private String originCountry;
    private String style;
    private String type;
    private String juice;
    @Column(name = "due_date")
    private byte dueDate;
}