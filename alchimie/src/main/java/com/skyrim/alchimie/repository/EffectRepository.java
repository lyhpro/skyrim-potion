package com.skyrim.alchimie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skyrim.alchimie.model.effect.Effect;

@Repository
public interface EffectRepository extends JpaRepository<Effect,Long> {
    
    Effect findByName(String name);

}
