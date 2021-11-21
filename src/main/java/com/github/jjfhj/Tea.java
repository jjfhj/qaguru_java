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

    public String getTeaSetName() {
        return teaSetName;
    }

    public void setTeaSetName(String teaSetName) {
        this.teaSetName = teaSetName;
    }

    public int getCountOfTeaBags() {
        return countOfTeaBags;
    }

    public void setCountOfTeaBags(int countOfTeaBags) {
        if (countOfTeaBags >= 0) {
            this.countOfTeaBags = countOfTeaBags;
        } else {
            System.out.println("Количество чайных пакетиков должно быть больше либо равно 0\n");
        }
    }

    public int getCountOfTeaFlavors() {
        return countOfTeaFlavors;
    }

    public void setCountOfTeaFlavors(int countOfTeaFlavors) {
        if (countOfTeaFlavors > 0 && countOfTeaFlavors <= countOfTeaBags) {
            this.countOfTeaFlavors = countOfTeaFlavors;
        } else {
            System.out.println("Количество вкусов чая должно быть больше 0 " +
                    "и меньше или равно количеству чайных пакетиков\n");
        }
    }

    public int getCountOfBlackTeaBags() {
        return countOfBlackTeaBags;
    }

    public void setCountOfBlackTeaBags(int countOfBlackTeaBags) {
        if (countOfBlackTeaBags >= 0 && countOfBlackTeaBags <= countOfTeaBags) {
            this.countOfBlackTeaBags = countOfBlackTeaBags;
        } else {
            System.out.println("Количество пакетиков черного чая должно быть больше либо равно 0 " +
                    "и меньше или равно количеству чайных пакетиков\n");
        }
    }

    public int getCountOfGreenTeaBags() {
        return countOfGreenTeaBags;
    }

    public void setCountOfGreenTeaBags(int countOfGreenTeaBags) {
        if (countOfGreenTeaBags >= 0 && countOfGreenTeaBags <= countOfTeaBags) {
            this.countOfGreenTeaBags = countOfGreenTeaBags;
        } else {
            System.out.println("Количество пакетиков зеленого чая должно быть больше либо равно 0 " +
                    "и меньше или равно количеству чайных пакетиков\n");
        }
    }

    public int getCountOfHerbalTeaBags() {
        return countOfHerbalTeaBags;
    }

    public void setCountOfHerbalTeaBags(int countOfHerbalTeaBags) {
        if (countOfHerbalTeaBags >= 0 && countOfHerbalTeaBags <= countOfTeaBags) {
            this.countOfHerbalTeaBags = countOfHerbalTeaBags;
        } else {
            System.out.println("Количество пакетиков травяного чая должно быть больше либо равно 0 " +
                    "и меньше или равно количеству чайных пакетиков\n");
        }
    }

    public int getCountOfOolongTeaBags() {
        return countOfOolongTeaBags;
    }

    public void setCountOfOolongTeaBags(int countOfOolongTeaBags) {
        if (countOfOolongTeaBags >= 0 && countOfOolongTeaBags <= countOfTeaBags) {
            this.countOfOolongTeaBags = countOfOolongTeaBags;
        } else {
            System.out.println("Количество пакетиков чая улун должно быть больше либо равно 0 " +
                    "и меньше или равно количеству чайных пакетиков\n");
        }
    }

    public int getTeaSetPrice() {
        return teaSetPrice;
    }

    public void setTeaSetPrice(int teaSetPrice) {
        if (teaSetPrice >= 0) {
            this.teaSetPrice = teaSetPrice;
        } else {
            System.out.println("Цена чайного набора должна быть больше либо равна 0\n");
        }
    }

    public int getDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(int discountCoupon) {
        if (discountCoupon >= 0) {
            this.discountCoupon = discountCoupon;
        } else {
            System.out.println("Скидочный купон должен быть больше либо равен 0\n");
        }
    }

    public void sayNameAndCompositionOfTeaSet() {
        System.out.println("Чайный набор " + teaSetName + "\n");
        System.out.println("Количество чайных пакетиков: " + countOfTeaBags);
        System.out.println("Количество вкусов чая: " + countOfTeaFlavors);
        System.out.println("Количество пакетиков черного чая: " + countOfBlackTeaBags);
        System.out.println("Количество пакетиков зеленого чая: " + countOfGreenTeaBags);
        System.out.println("Количество пакетиков травяного чая: " + countOfHerbalTeaBags);
        System.out.println("Количество пакетиков чая улун: " + countOfOolongTeaBags + "\n");
    }

    public void calculatePriceOfTeaSetWithDiscount() {
        int totalPriceOfTeaSet = teaSetPrice - discountCoupon;
        System.out.println("Итоговая цена чайного набора " + teaSetName + " со скидкой составляет "
                + totalPriceOfTeaSet + " руб.\n");
    }

    public static void sayClassName() {
        System.out.println(Tea.class.getName() + "\n");
    }

    static class Manufacturer {
        String country;

        public Manufacturer(String country) {
            this.country = country;
        }

        public void sayManufacturerCountry() {
            System.out.println("Производитель: " + country + "\n");
        }
    }
}
