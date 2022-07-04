package com.example.teststrategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonService {

    @Autowired
    Contexte contexte;

    public void monTest(String type) {
        System.out.println("monTest : " + type);

        MaStrategie strategie = contexte.getStrategy(type);
        strategie.process();
    }
}
