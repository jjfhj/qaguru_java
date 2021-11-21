package com.github.jjfhj;

public class Tea {

    public static String commonName = "Чайный набор";
    private String teaSetName; // Название чайного набора
    private int countOfTeaBags; // Количество чайных пакетиков
    private int countOfTeaFlavors; // Количество вкусов чая
    private int countOfBlackTeaBags; // Количество пакетиков черного чая
    private int countOfGreenTeaBags; // Количество пакетиков зеленого чая
    private int countOfHerbalTeaBags; // Количество пакетиков травяного чая
    private int countOfOolongTeaBags; // Количество пакетиков чая улун
    private int teaSetPrice; // Цена чайного набора
    private int discountCoupon; // Скидочный купон
    Manufacturer manufacturer;

    public Tea(String teaSetName, int countOfTeaBags, int countOfTeaFlavors, int countOfBlackTeaBags, int countOfGreenTeaBags,
               int countOfHerbalTeaBags, int countOfOolongTeaBags, int teaSetPrice, int discountCoupon) {
        this.teaSetName = teaSetName;
        this.countOfTeaBags = countOfTeaBags;
        this.countOfTeaFlavors = countOfTeaFlavors;
        this.countOfBlackTeaBags = countOfBlackTeaBags;
        this.countOfGreenTeaBags = countOfGreenTeaBags;
        this.countOfHerbalTeaBags = countOfHerbalTeaBags;
        this.countOfOolongTeaBags = countOfOolongTeaBags;
        this.teaSetPrice = teaSetPrice;
        this.discountCoupon = discountCoupon;
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

    static class Manufacturer {
        String country;

        public Manufacturer(String country) {
            this.country = country;
        }

        public void sayManufacturerCountry() {
            System.out.println("Производитель: " + country);
        }
    }
}
