package com.example.teststrategy;

public abstract class MaStrategie {

    protected MonDao monDao;

    public abstract void process();

    public String methodeCommune() {
        System.out.println("METHODE COMMUNE !");
        return monDao.getData();
    }

}
