package com.example.coctelesherbario.controller;

import com.example.coctelesherbario.models.dto.CocktailDTO;
import com.example.coctelesherbario.service.CocktailServiceImpl;
import com.example.coctelesherbario.validation.CocktailValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cocktail")
public class CocktailController {

    @Autowired
    private CocktailServiceImpl cocktailService;

    @GetMapping("/{id}")
    public ResponseEntity<CocktailDTO> getCocktail(@PathVariable int id){
        try {
            CocktailValidation.idValidation(id);
            CocktailDTO cocktailDTO = cocktailService.cocktailDTO(id);
            return new ResponseEntity<>(cocktailDTO, HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
