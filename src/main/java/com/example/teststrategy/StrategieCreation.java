package com.example.teststrategy;

import org.springframework.stereotype.Component;

@Component
public class StrategieCreation extends MaStrategie {

    public StrategieCreation(MonDao monDao) {
        this.monDao = monDao;
    }

    @Override
    public void process() {
        System.out.println("PROCESS CREATION");
        this.methodeCommune();
    }
}
