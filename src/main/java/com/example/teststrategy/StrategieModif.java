package com.example.teststrategy;

import org.springframework.stereotype.Component;

@Component
public class StrategieModif extends MaStrategie {

    public StrategieModif(MonDao monDao) {
        this.monDao = monDao;
    }

    @Override
    public void process() {
        System.out.println("PROCESS MODIF");
        this.methodeCommune();
    }
}
