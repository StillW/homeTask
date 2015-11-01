package com.sourceit.webtask.controller.common.connectionDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Still on 15.10.2015.
 */
public class ReadData {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        ConnectionDB con = new ConnectionDB();

        String query = "select type,  articles from new_table"; //WHERE login = ? AND password = ?";
        Statement statement = con.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String name1 = resultSet.getString("login");
            String password1 = resultSet.getString("password");


        }
    }
}


