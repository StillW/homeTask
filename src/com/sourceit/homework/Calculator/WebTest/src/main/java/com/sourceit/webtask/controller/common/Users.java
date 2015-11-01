package com.sourceit.webtask.controller.common;

/**
 * Created by Still on 26.06.2015.
 */
public class Users {

    public String getADMIN() {
        return ADMIN;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    private final String ADMIN = "admin";
    private final String AdminPassword = "admin";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String login;
    private String password;

    public Users (String login, String password){
        this.login = login;
        this.password = password;
    }

    public Users (){}

    @Override
    public String toString() {
        return getClass().getSimpleName() + login + " " + password;
    }
}
