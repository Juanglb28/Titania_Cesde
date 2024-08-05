package com.example.coctelesherbario.controller;

import com.example.coctelesherbario.models.dto.CocktailDTO;
import com.example.coctelesherbario.service.CocktailServiceImpl;
import com.example.coctelesherbario.validation.CocktailValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cocktail")
public class CocktailController {

    @Autowired
    private CocktailServiceImpl cocktailService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
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
