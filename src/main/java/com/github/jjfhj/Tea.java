package com.github.jjfhj;

public class Tea {

    String teaSetName; // Название чайного набора
    int countOfTeaBags; // Количество чайных пакетиков
    int countOfTeaFlavors; // Количество вкусов чая
    int countOfBlackTeaBags; // Количество пакетиков черного чая
    int countOfGreenTeaBags; // Количество пакетиков зеленого чая
    int countOfHerbalTeaBags; // Количество пакетиков травяного чая
    int countOfOolongTeaBags; // Количество пакетиков чая улун
    int teaSetPrice; // Цена чайного набора
    int discountCoupon = 100; // Скидочный купон на 100 рублей

    public Tea(String teaSetName, int countOfTeaBags, int countOfTeaFlavors, int countOfBlackTeaBags,
               int countOfGreenTeaBags, int countOfHerbalTeaBags, int countOfOolongTeaBags, int teaSetPrice) {
        this.teaSetName = teaSetName; // Название чайного набора
        this.countOfTeaBags = countOfTeaBags; // Количество чайных пакетиков
        this.countOfTeaFlavors = countOfTeaFlavors; // Количество вкусов чая
        this.countOfBlackTeaBags = countOfBlackTeaBags; // Количество пакетиков черного чая
        this.countOfGreenTeaBags = countOfGreenTeaBags; // Количество пакетиков зеленого чая
        this.countOfHerbalTeaBags = countOfHerbalTeaBags; // Количество пакетиков травяного чая
        this.countOfOolongTeaBags = countOfOolongTeaBags; // Количество пакетиков чая улун
        this.teaSetPrice = teaSetPrice; // Цена чайного набора
    }

    public void sayNameAndCompositionOfTeaSet() {
        System.out.println("Чайный набор " + teaSetName);
        System.out.println("Количество чайных пакетиков: " + countOfTeaBags);
        System.out.println("Количество вкусов чая: " + countOfTeaFlavors);
        System.out.println("Количество пакетиков черного чая: " + countOfBlackTeaBags);
        System.out.println("Количество пакетиков зеленого чая: " + countOfGreenTeaBags);
        System.out.println("Количество пакетиков травяного чая: " + countOfHerbalTeaBags);
        System.out.println("Количество пакетиков чая улун: " + countOfOolongTeaBags);
    }

    public void calculatePriceOfTeaSetWithDiscount() {
        int totalPriceOfTeaSet = teaSetPrice - discountCoupon;
        System.out.println("Итоговая цена чайного набора " + teaSetName + " со скидкой составляет "
                + totalPriceOfTeaSet + " руб.");
    }
}
