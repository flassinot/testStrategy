package com.example.teststrategy;

import org.springframework.stereotype.Component;

@Component
public class Contexte {

    private MaStrategie strategieCreation;
    private MaStrategie strategieModif;

    public Contexte(MaStrategie strategieCreation, MaStrategie strategieModif) {
        this.strategieCreation = strategieCreation;
        this.strategieModif = strategieModif;
    }

    public MaStrategie getStrategy(String type) {

        if ("creation".equals(type)) {
            return this.strategieCreation;
        } else if ("modif".equals(type)) {
            return this.strategieModif;
        }
        return null;
    }
}
