package ru.yandex.praktikum.order;

import io.restassured.response.ValidatableResponse;
import ru.yandex.praktikum.Client;

import static io.restassured.RestAssured.given;

public class OrdersGet extends Client {

    private static final String PATH_GET_ORDERS = "/api/v1/orders";

    public ValidatableResponse getOrder() {
        return given()
                .spec(getSpec())
                .get(PATH_GET_ORDERS)
                .then();
    }
}
