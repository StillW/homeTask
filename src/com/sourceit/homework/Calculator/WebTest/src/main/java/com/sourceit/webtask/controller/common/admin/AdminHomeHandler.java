package com.sourceit.webtask.controller.common.admin;

import com.sourceit.webtask.controller.common.connectionDataBase.AvtorizationDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Still on 05.10.2015.
 */
public class AdminHomeHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        String password = req.getParameter("password");
        boolean av = true;

        AvtorizationDB aDB = new AvtorizationDB();
        try {
            if (aDB.avtorization(name,password)== av){
                req.getRequestDispatcher("WEB-INF/jsp/admin/home.jsp").forward(req, resp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();

            req.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(req, resp);
        }
    }
}
