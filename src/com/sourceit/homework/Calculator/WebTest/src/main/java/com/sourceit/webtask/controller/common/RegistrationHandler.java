package com.sourceit.webtask.controller.common;


import com.sourceit.webtask.controller.common.connectionDataBase.RegistrationDB;
import com.sourceit.webtask.controller.common.dto.RegistrationDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class RegistrationHandler extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        if (password.equals(confirmPassword)) {

            RegistrationDB regdb = new RegistrationDB();
            try {
                regdb.regDB(name, email, password, firstName, lastName);

                req.getRequestDispatcher("WEB-INF/jsp/admin/welcome.jsp").forward(req, resp);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } else {
            req.getRequestDispatcher("WEB-INF/jsp/registration.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("regDto", new RegistrationDto());
        req.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(req, resp);
    }
}
