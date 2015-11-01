package com.sourceit.webtask.controller.common.utils;

import com.sourceit.webtask.controller.common.connectionDataBase.ConnectionDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Still on 05.07.2015.
 */
public class test {

   public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {



        ConnectionDB conDB = new ConnectionDB();
       String query = "select * from account";
       Statement statement = conDB.getConnection().createStatement();
       ResultSet resultSet = statement.executeQuery(query);

       while (resultSet.next()){
           int id = resultSet.getInt(1);
           String login = resultSet.getString(2);

           System.out.println(id +" "+login);
       }


   }
}
