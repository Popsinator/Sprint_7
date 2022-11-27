package ru.yandex.praktikum.order;

import java.util.List;

public class OrderGenerator {

    public static Order getOrderWithOneColour() {
        return new Order(
                "AlexBlack",
                "Pops",
                "not dom and not street",
                "not yet",
                "+7 777 777 77 77",
                "7",
                "2022-12-31",
                "Be Happy",
                List.of("Black")
        );
    }

    public static Order getOrderWithTwoColour() {
        return new Order(
                "AlexBlackAndGrey",
                "Pops",
                "not dom and not street",
                "not yet",
                "+7 777 777 77 77",
                "5",
                "2022-12-31",
                "Be Happy",
                List.of("BLACK", "GREY")
        );
    }

    public static Order getOrderWithoutColour() {
        return new Order(
                "AlexWithoutColour",
                "Pops",
                "not dom and not street",
                "not yet",
                "+7 777 777 77 77",
                "6",
                "2022-12-31",
                "Be Happy",
                List.of()
        );
    }
}
