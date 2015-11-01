package com.sourceit.webtask.controller.common.connectionDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Still on 07.07.2015.
 */
public class AvtorizationDB {

    public boolean avtorize = false;

    public boolean avtorization(String name, String password) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        //public static void main (String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        ConnectionDB con = new ConnectionDB();

        String query = "select login,  password from account"; //WHERE login = ? AND password = ?";
        Statement statement = con.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String name1 = resultSet.getString("login");
            String password1 = resultSet.getString("password");

            if ((name1.equals(name)) && (password1.equals(password))) {
                avtorize = true;
            }
        }

        return avtorize;
    }

    /*public static void main (String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        AvtorizationDB adb = new AvtorizationDB();
        adb.avtorization("StillW", "123");
        System.out.println(adb.avtorize);
    }*/
}






