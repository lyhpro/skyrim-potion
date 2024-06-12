package com.skyrim.alchimie.model.ingredient;

import com.skyrim.alchimie.model.effect.Effect;
import com.skyrim.alchimie.model.extension.Extension;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ingredients")
public class Ingredient {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "effect1_id", nullable = true)
    private Effect effect1;

    @ManyToOne
    @JoinColumn(name = "effect2_id", nullable = true)
    private Effect effect2;

    @ManyToOne
    @JoinColumn(name = "effect3_id", nullable = true)
    private Effect effect3;

    @ManyToOne
    @JoinColumn(name = "effect4_id", nullable = true)
    private Effect effect4;

    @ManyToOne
    @JoinColumn(name = "extension_id", nullable = true)
    private Extension extension;

    private boolean enable;

}
