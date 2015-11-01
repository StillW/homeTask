package com.sourceit.webtask.controller.common.admin;

import com.sourceit.webtask.controller.common.connectionDataBase.UserSaves;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Still on 06.10.2015.
 */
public class UserSaveText extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("subject");
        String text = req.getParameter("text");

        UserSaves us = new UserSaves();
        try {
            us.saveText(type, text);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("WEB-INF/jsp/admin/home.jsp").forward(req, resp);

    }
}
