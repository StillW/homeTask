package com.sourceit.webtask.controller.common.connectionDataBase;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Created by Still on 06.10.2015.
 */
public class UserSaves {

    public void saveText (String name, String text) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {

        ConnectionDB cdb = new ConnectionDB();

        String INSERT = "INSERT INTO new_table VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = cdb.getConnection().prepareStatement(INSERT);

            ps.setInt(1, 0);
            ps.setString(2, name);
            ps.setString(3, text);
            ps.setDate(4, new Date(Calendar.getInstance().getTimeInMillis()));

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

