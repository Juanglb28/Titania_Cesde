package com.example.coctelesherbario.repository;

import com.example.coctelesherbario.models.entity.CocktailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocktailRepository extends JpaRepository<CocktailEntity, Integer> {
}
