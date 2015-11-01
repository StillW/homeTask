package com.sourceit.webtask.controller.common.admin;

import com.sourceit.webtask.controller.common.connectionDataBase.ConnectionDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Still on 15.10.2015.
 */


public class AdminHomeVoc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ConnectionDB con = null;
        try {
            con = new ConnectionDB();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        String query = "select type, articles from new_table"; //WHERE login = ? AND password = ?";
        Statement statement = null;
        try {
            statement = con.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            while (resultSet.next()) {
                Item it = new Item();
                it.art = resultSet.getString("articles");
                it.type1 = resultSet.getString("type");


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("itemList", new Item());
        req.getRequestDispatcher("HomeVoc.jsp").forward(req, resp);
    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);


    }
}
