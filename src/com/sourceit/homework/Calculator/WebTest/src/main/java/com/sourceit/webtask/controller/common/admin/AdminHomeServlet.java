package com.sourceit.webtask.controller.common.admin;

import com.sourceit.webtask.controller.common.connectionDataBase.AvtorizationDB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Still on 23.05.2015.
 */
public class AdminHomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("WEB-INF/jsp/admin/home.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        String password = req.getParameter("password");
        boolean av = true;

        AvtorizationDB aDB = new AvtorizationDB();

        try {
            aDB.avtorization(name, password);
            if (aDB.avtorize==av) {
                req.getRequestDispatcher("WEB-INF/jsp/admin/home.jsp").forward(req, resp);
            } else req.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(req, resp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
        /*String name = req.getParameter("username");
        String password = req.getParameter("password");

        //Users us = new Users();

        ConnectionDB cd = null;
        try {
            cd = new ConnectionDB();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        PreparedStatement pst = null;
        ResultSet rs;
        RequestDispatcher rd;
        HttpSession session = req.getSession();
        session.setAttribute("username", name);

        String query = "select login,  password from account WHERE login = ? AND password = ?";

        try {

            pst.setString(2, name);
            pst.setString(4, password);

            pst = cd.getConnection().prepareStatement(query);

            rs = pst.executeQuery();


            //ResultSet resultSet = statement.executeQuery(query);

           if (rs.next()){
               rd = req.getRequestDispatcher("welcome.jsp");
               rd.forward(req,resp);
           }else {
               rd = req.getRequestDispatcher("registration.jsp");
           }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*if (name.equals(us.getADMIN()) && password.equals(us.getAdminPassword())) {
            req.getRequestDispatcher("WEB-INF/jsp/admin/welcome.jsp").forward(req, resp);
        } else {

            req.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(req, resp);
        }*/


