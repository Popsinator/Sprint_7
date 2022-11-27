package ru.yandex.praktikum.courier;

public class CredentialsOnlyLogin {

    private String login;
    private String password;

    public CredentialsOnlyLogin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static CredentialsOnlyLogin fromOnlyLogin(Courier courier) {
        return new CredentialsOnlyLogin(courier.getLogin(), "");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
