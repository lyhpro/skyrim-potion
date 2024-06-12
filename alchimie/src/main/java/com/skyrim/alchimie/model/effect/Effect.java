package com.skyrim.alchimie.model.effect;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.skyrim.alchimie.model.ingredient.Ingredient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "effects")
public class Effect {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private boolean positiveEffect;

    private boolean enable;
    
    @JsonIgnore
    @OneToMany(mappedBy = "effect1")
    private List<Ingredient> ingredientsEffect1; 

    @JsonIgnore
    @OneToMany(mappedBy = "effect2")
    private List<Ingredient> ingredientsEffect2; 

    @JsonIgnore
    @OneToMany(mappedBy = "effect3")
    private List<Ingredient> ingredientsEffect3; 

    @JsonIgnore
    @OneToMany(mappedBy = "effect4")
    private List<Ingredient> ingredientsEffect4; 

}
