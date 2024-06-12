package com.skyrim.alchimie.dataload;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.skyrim.alchimie.model.effect.Effect;
import com.skyrim.alchimie.model.extension.Extension;
import com.skyrim.alchimie.model.ingredient.Ingredient;
import com.skyrim.alchimie.repository.EffectRepository;
import com.skyrim.alchimie.repository.ExtensionRepository;
import com.skyrim.alchimie.repository.IngredientRepository;

@Component
public class Dataload implements CommandLineRunner {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private EffectRepository effectRepository;

    @Autowired
    private ExtensionRepository extensionRepository;

    @Override
    public void run(String... args) throws Exception {
        
        List<Effect> listEffects = effectRepository.findAll();
        if(listEffects.size() == 0) {
            List<Effect> newListEffects = new ArrayList<Effect>();

            Effect effect1 = new Effect(0,"destruction de magie",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect1);

            Effect effect2 = new Effect(0,"destruction de sante",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect2);

            Effect effect3 = new Effect(0,"destruction de vigueur",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect3);

            Effect effect4 = new Effect(0,"frenesie",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect4);

            Effect effect5 = new Effect(0,"invisibilite",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect5);

            Effect effect6 = new Effect(0,"langueur",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect6);

            Effect effect7 = new Effect(0,"paralysie",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect7);

            Effect effect8 = new Effect(0,"penalite de sante",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect8);

            Effect effect9 = new Effect(0,"penalite de sante persistante",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect9);

            Effect effect10 = new Effect(0,"penalite de magie",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect10);

            Effect effect11 = new Effect(0,"penalite de magie persistante",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect11);

            Effect effect12 = new Effect(0,"penalite de recuperation de vigueur",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect12);

            Effect effect13 = new Effect(0,"penalite de regain magique",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect13);

            Effect effect14 = new Effect(0,"penalite de vigueur",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect14);

            Effect effect15 = new Effect(0,"penalite de vigueur persistante",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect15);

            Effect effect16 = new Effect(0,"peur",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect16);

            Effect effect17 = new Effect(0,"potion medicinale",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect17);

            Effect effect18 = new Effect(0,"recuperation de vigueur",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect18);

            Effect effect19 = new Effect(0,"regain magique",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect19);

            Effect effect20 = new Effect(0,"regeneration de sante",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect20);

            Effect effect21 = new Effect(0,"renfort d'alteration",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect21);

            Effect effect22 = new Effect(0,"renfort d'arme a deux mains",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect22);

            Effect effect23 = new Effect(0,"renfort d'arme a une main",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect23);

            Effect effect24 = new Effect(0,"renfort d'armure legere",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect24);

            Effect effect25 = new Effect(0,"renfort d'armure lourde",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect25);

            Effect effect26 = new Effect(0,"renfort d'enchantement",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect26);

            Effect effect27 = new Effect(0,"renfort d'illusion",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect27);

            Effect effect28 = new Effect(0,"renfort de conjuration",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect28);

            Effect effect29 = new Effect(0,"renfort de crochetage",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect29);

            Effect effect30 = new Effect(0,"renfort de destruction",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect30);

            Effect effect31 = new Effect(0,"renfort de forgeage",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect31);

            Effect effect32 = new Effect(0,"renfort de furtivite",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect32);

            Effect effect33 = new Effect(0,"renfort de guerison",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect33);

            Effect effect34 = new Effect(0,"renfort de magie",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect34);

            Effect effect35 = new Effect(0,"renfort de marchandage",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect35);

            Effect effect36 = new Effect(0,"renfort de parade",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect36);

            Effect effect37 = new Effect(0,"renfort de portage",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect37);

            Effect effect38 = new Effect(0,"renfort de precision",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect38);

            Effect effect39 = new Effect(0,"renfort de sante",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect39);

            Effect effect40 = new Effect(0,"renfort de vigueur",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect40);

            Effect effect41 = new Effect(0,"renfort de vol a la tire",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect41);

            Effect effect42 = new Effect(0,"resistance a la foudre",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect42);

            Effect effect43 = new Effect(0,"resistance a la glace",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect43);

            Effect effect44 = new Effect(0,"resistance a la magie",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect44);

            Effect effect45 = new Effect(0,"resistance au feu",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect45);

            Effect effect46 = new Effect(0,"resistance au poison",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect46);

            Effect effect47 = new Effect(0,"respiration aquatique",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect47);

            Effect effect48 = new Effect(0,"restauration de magie",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect48);

            Effect effect49 = new Effect(0,"restauration de sante",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect49);

            Effect effect50 = new Effect(0,"restauration de vigueur",true,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect50);

            Effect effect51 = new Effect(0,"vulnerabilite a la glace",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect51);

            Effect effect52 = new Effect(0,"vulnerabilite a la magie",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect52);

            Effect effect53 = new Effect(0,"vulnerabilite au feu",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect53);

            Effect effect54 = new Effect(0,"vulnerabilte a la foudre",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect54);

            Effect effect55 = new Effect(0,"vulnerabilite au poison",false,true,new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>(),new ArrayList<Ingredient>());
            newListEffects.add(effect55);

            effectRepository.saveAll(newListEffects);

        }

        List<Extension> listExtensions = extensionRepository.findAll();
        if(listExtensions.size() == 0) {
            List<Extension> newListExtensions = new ArrayList<Extension>();

            Extension extension1 = new Extension(0, "skyrim", true, new ArrayList<Ingredient>());
            newListExtensions.add(extension1);

            Extension extension2 = new Extension(0, "dawnguard", true, new ArrayList<Ingredient>());
            newListExtensions.add(extension2);

            Extension extension3 = new Extension(0, "hearthfire", true, new ArrayList<Ingredient>());
            newListExtensions.add(extension3);

            Extension extension4 = new Extension(0, "dragonborn", true, new ArrayList<Ingredient>());
            newListExtensions.add(extension4);

            extensionRepository.saveAll(newListExtensions);

        }

        List<Ingredient> listIngredients = ingredientRepository.findAll();
        if(listIngredients.size() == 0) {
            List<Ingredient> newListIngredients = new ArrayList<Ingredient>();

            Ingredient ingredient1 = new Ingredient(0, "abeceen a longue nageoire", effectRepository.findByName("vulnerabilite a la glace"), effectRepository.findByName("renfort de furtivite"), effectRepository.findByName("vulnerabilite au poison"), effectRepository.findByName("renfort de guerison"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient1);

            Ingredient ingredient2 = new Ingredient(0, "abeille", effectRepository.findByName("restauration de vigueur"), effectRepository.findByName("destruction de vigueur"), effectRepository.findByName("recuperation de vigueur"), effectRepository.findByName("vulnerabilite a la foudre"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient2);

            Ingredient ingredient3 = new Ingredient(0, "ail", effectRepository.findByName("resistance au poison"), effectRepository.findByName("renfort de vigueur"), effectRepository.findByName("regain magique"), effectRepository.findByName("regeneration de sante"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient3);

            Ingredient ingredient4 = new Ingredient(0, "aile de flechette bleue", effectRepository.findByName("resistance a la foudre"), effectRepository.findByName("renfort de vol a la tire"), effectRepository.findByName("restauration de sante"), effectRepository.findByName("peur"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient4);

            Ingredient ingredient5 = new Ingredient(0, "aile de flechette orange", effectRepository.findByName("restauration de vigueur"), effectRepository.findByName("destruction de magie"), effectRepository.findByName("renfort de vol a la tire"), effectRepository.findByName("penalite de sante persistante"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient5);

            Ingredient ingredient6 = new Ingredient(0, "aile de noctuelle", effectRepository.findByName("penalite de magie"), effectRepository.findByName("renfort d'armure legere"), effectRepository.findByName("regeneration de sante"), effectRepository.findByName("invisibilte"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient6);

            Ingredient ingredient7 = new Ingredient(0, "aile de papillon", effectRepository.findByName("restauration de sante"), effectRepository.findByName("renfort de marchandage"), effectRepository.findByName("penalite de vigueur persistante"), effectRepository.findByName("penalite de magie"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient7);

            Ingredient ingredient8 = new Ingredient(0, "aile de papillon bleue", effectRepository.findByName("penalite de vigueur"), effectRepository.findByName("renfort de conjuration"), effectRepository.findByName("penalite de regain magique"), effectRepository.findByName("renfort d'enchantement'"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient8);

            Ingredient ingredient9 = new Ingredient(0, "amanite tue-mouches", effectRepository.findByName("resistance au feu"), effectRepository.findByName("renfort d'arme a deux mains"), effectRepository.findByName("frenesie"), effectRepository.findByName("recuperation de vigueur"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient9);

            Ingredient ingredient10 = new Ingredient(0, "bec de faucon", effectRepository.findByName("restauration de vigueur"), effectRepository.findByName("resistance a la glace"), effectRepository.findByName("renfort de portage"), effectRepository.findByName("resistance a la foudre"), extensionRepository.findByName("skyrim"), true);
            newListIngredients.add(ingredient10);

            ingredientRepository.saveAll(newListIngredients);

        }


    }

    
}
