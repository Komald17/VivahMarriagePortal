package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConnection.DBConnection;

@WebServlet("/image")
public class ImageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
            throws ServletException, IOException {

        String email =
                req.getParameter("email");

        try {

            Connection con =
                    DBConnection.getConnection();

            String sql =
            "SELECT profile_picture FROM users WHERE email=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, email);

            ResultSet rs =
                    ps.executeQuery();

            if(rs.next()) {

                byte[] img =
                rs.getBytes("profile_picture");

                if(img != null) {

                    res.setContentType("image/jpeg");

                    res.getOutputStream().write(img);

                }
            }

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}