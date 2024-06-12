package com.skyrim.alchimie.model.extension;

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
@Table(name = "extensions")
public class Extension {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private boolean enable;

    @JsonIgnore
    @OneToMany(mappedBy = "extension")
    private List<Ingredient> ingredients; 

}
