package ru.yandex.praktikum.courier;

public class CourierGenerator {

    public static Courier getCourier() {
        return new Courier("Pops", "test", "Popovich");
    }

    public static Courier getCourierWithPasswordOnly() {
        return new Courier("", "test", "");
    }

    public static Courier getCourierWithLoginOnly() {
        return new Courier("test", "", "");
    }

    public static Courier getCourierWithSimilarLogin() {
        return new Courier("Pops", "test@test", "Popovich");
    }


}
