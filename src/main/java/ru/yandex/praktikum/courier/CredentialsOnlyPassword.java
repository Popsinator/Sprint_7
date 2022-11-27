package ru.yandex.praktikum.courier;

public class CredentialsOnlyPassword {

    private String password;

    public CredentialsOnlyPassword(String password) {
        this.password = password;
    }

    public static CredentialsOnlyPassword fromOnlyPassword(Courier courier) {
        return new CredentialsOnlyPassword(courier.getPassword());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
