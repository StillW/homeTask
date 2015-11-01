package com.sourceit.webtask.controller.common.connectionDataBase;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Created by Still on 07.07.2015.
 */
public class RegistrationDB {

    public void regDB(String name, String email, String password, String firstName, String lastName) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        ConnectionDB cdb = new ConnectionDB();

        String INSERT = "INSERT INTO account VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = cdb.getConnection().prepareStatement(INSERT);

            ps.setInt(1, 0);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setString(5, firstName);
            ps.setString(6, lastName);
            ps.setDate(7, new Date(Calendar.getInstance().getTimeInMillis()));

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
