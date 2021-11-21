package com.github.jjfhj;

public class Main {

    public static void main(String[] args) {
        System.out.println(Tea.commonName);

        Tea greenfield = new Tea("Greenfield", 60, 12, 35,
                15, 5, 5, 425);
        greenfield.sayNameAndCompositionOfTeaSet();
        greenfield.calculatePriceOfTeaSetWithDiscount();

        System.out.println();

        Tea ahmadTea = new Tea("Ahmad Tea", 90, 15, 60,
                18, 6, 6, 549);
        ahmadTea.sayNameAndCompositionOfTeaSet();
        ahmadTea.calculatePriceOfTeaSetWithDiscount();
    }
}
