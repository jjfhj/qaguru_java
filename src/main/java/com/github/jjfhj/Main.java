package com.github.jjfhj;

public class Main {

    public static void main(String[] args) {
        Tea.sayClassName();
        System.out.println(Tea.commonName + "\n");

        Tea greenfield = new Tea("Greenfield", 60, 12, 35,
                15, 5, 5, 425, 100);
        greenfield.manufacturer = new Tea.Manufacturer("Великобритания");
        greenfield.sayNameAndCompositionOfTeaSet();
        greenfield.manufacturer.sayManufacturerCountry();
        greenfield.calculatePriceOfTeaSetWithDiscount();
        greenfield.setDiscountCoupon(-100);
        greenfield.calculatePriceOfTeaSetWithDiscount();

        System.out.println();

        Tea ahmadTea = new Tea("Ahmad Tea", 90, 15, 60,
                18, 6, 6, 549, 100);
        ahmadTea.manufacturer = new Tea.Manufacturer("Великобритания");
        ahmadTea.sayNameAndCompositionOfTeaSet();
        ahmadTea.setCountOfGreenTeaBags(-18);
        ahmadTea.manufacturer.sayManufacturerCountry();
        ahmadTea.calculatePriceOfTeaSetWithDiscount();
    }
}
