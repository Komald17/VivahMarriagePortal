package com.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.UserDAO;
import com.portal.entity.User;

@WebServlet("/UserServlet")
@MultipartConfig
public class UserServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        User u = new User();

        // TEXT DATA

        u.setFirst_name(
                req.getParameter("first_name"));

        u.setLast_name(
                req.getParameter("last_name"));

        u.setEmail(
                req.getParameter("email"));

        u.setPassword_hash(
                req.getParameter("password_hash"));

        u.setPhone_number(
                req.getParameter("phone"));

        u.setGender(
                req.getParameter("gender"));

        u.setDate_of_birth(
                LocalDate.parse(
                        req.getParameter("date_of_birth")));

        u.setCaste(
                req.getParameter("caste"));

        u.setSub_caste(
                req.getParameter("sub_caste"));

        u.setWallet_balance(0.0);

        // IMAGE

        Part filePart =
                req.getPart("profile_picture");

        InputStream imageStream =
                filePart.getInputStream();

        byte[] imageBytes =
                imageStream.readAllBytes();

        u.setProfile_picture(imageBytes);

        // SAVE USER

        boolean status =
                UserDAO.addUser(u);

        if (status) {

            res.sendRedirect("Login.jsp");

        } else {

            res.sendRedirect("register.jsp");
        }
    }
}