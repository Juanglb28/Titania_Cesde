package com.example.coctelesherbario.service;


import com.example.coctelesherbario.mapper.CocktailMapper;
import com.example.coctelesherbario.models.dto.CocktailDTO;
import com.example.coctelesherbario.models.entity.CocktailEntity;
import com.example.coctelesherbario.repository.CocktailRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CocktailServiceImpl implements CocktailService {

    @Autowired
    CocktailRepository repository;

    public CocktailDTO cocktailDTO(int id) {
        Optional<CocktailEntity> cocktailEntity = repository.findById(id);
        return cocktailEntity
                .map(CocktailMapper::cocktailConvertToDTO)
                .orElseThrow(() -> new EntityNotFoundException("Cocktail not found with id: " + id));
    }

}