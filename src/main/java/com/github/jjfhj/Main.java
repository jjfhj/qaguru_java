package com.github.jjfhj;

public class Main {

    public static void main(String[] args) {
        Tea greenfield = new Tea();
        greenfield.teaSetName = "Greenfield";
        greenfield.countOfTeaBags = 60;
        greenfield.countOfTeaFlavors = 12;
        greenfield.countOfBlackTeaBags = 35;
        greenfield.countOfGreenTeaBags = 15;
        greenfield.countOfHerbalTeaBags = 5;
        greenfield.countOfOolongTeaBags = 5;
        greenfield.teaSetPrice = 425;
        greenfield.sayNameAndCompositionOfTeaSet();
        greenfield.calculatePriceOfTeaSetWithDiscount();

        System.out.println();

        Tea ahmadTea = new Tea();
        ahmadTea.teaSetName = "Ahmad Tea";
        ahmadTea.countOfTeaBags = 90;
        ahmadTea.countOfTeaFlavors = 15;
        ahmadTea.countOfBlackTeaBags = 60;
        ahmadTea.countOfGreenTeaBags = 18;
        ahmadTea.countOfHerbalTeaBags = 6;
        ahmadTea.countOfOolongTeaBags = 6;
        ahmadTea.teaSetPrice = 549;
        ahmadTea.sayNameAndCompositionOfTeaSet();
        ahmadTea.calculatePriceOfTeaSetWithDiscount();
    }
}
