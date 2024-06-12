package com.skyrim.alchimie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skyrim.alchimie.model.extension.Extension;

@Repository
public interface ExtensionRepository extends JpaRepository<Extension,Long> {
    
    Extension findByName(String name);
    
}
