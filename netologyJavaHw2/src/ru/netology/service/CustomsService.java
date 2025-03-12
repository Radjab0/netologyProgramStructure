package ru.netology.service;

public class CustomsService {

    public static final int WEIGHT_CLASS = 100;

    public static int calculateCustoms(int price, int weight){
        int priceDuty = price / 100;

        int weightDuty = weight * WEIGHT_CLASS;

        return priceDuty + weightDuty;
    }
}
