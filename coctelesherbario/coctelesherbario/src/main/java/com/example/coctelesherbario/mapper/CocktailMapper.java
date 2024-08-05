package com.example.coctelesherbario.mapper;

import com.example.coctelesherbario.models.dto.CocktailDTO;
import com.example.coctelesherbario.models.entity.CocktailEntity;
import org.springframework.stereotype.Component;

@Component
public class CocktailMapper {
    public static CocktailDTO cocktailConvertToDTO(CocktailEntity cocktailEntity) {
        return new CocktailDTO(cocktailEntity.getName(), cocktailEntity.getPrice(), cocktailEntity.getFlavor(), cocktailEntity.getAroma(), cocktailEntity.getColor(),
                cocktailEntity.getPresentation(), cocktailEntity.getTexture(), cocktailEntity.getOriginCountry(), cocktailEntity.getStyle(), cocktailEntity.getType(),
                cocktailEntity.getJuice(), cocktailEntity.getDueDate());
    }
}
