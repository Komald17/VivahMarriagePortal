package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.portal.entity.Admin;

import DBConnection.DBConnection;



public class AdminDAO {

    // INSERT ADMIN

    public static boolean registerAdmin(Admin admin) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "INSERT INTO admins(username, password_hash) VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getPasswordHash());

            int row = ps.executeUpdate();

            if (row > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // LOGIN ADMIN

    public static boolean loginAdmin(String username, String password) {

        boolean status = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
                    "SELECT * FROM admins WHERE username=? AND password_hash=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}