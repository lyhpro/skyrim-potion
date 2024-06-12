package com.skyrim.alchimie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skyrim.alchimie.model.ingredient.Ingredient;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient,Long> {

    Ingredient findByName(String name);
    
}
