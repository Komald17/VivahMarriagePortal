package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdminDAO;
import com.portal.entity.Admin;



@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        // REGISTER

        if ("register".equals(action)) {

            String username = req.getParameter("username");
            String password = req.getParameter("password");

            Admin admin = new Admin();

            admin.setUsername(username);
            admin.setPasswordHash(password);

            boolean status = AdminDAO.registerAdmin(admin);

            if (status) {
                res.sendRedirect("Login.jsp");
            } else {
                res.sendRedirect("AdminPage.jsp");
            }
        }

        // LOGIN

        else if ("login".equals(action)) {

            String username = req.getParameter("username");
            String password = req.getParameter("password");

            boolean status =
                    AdminDAO.loginAdmin(username, password);

            if (status) {
                res.sendRedirect("signup.jsp");
            } else {
            	System.out.println("<h2>Registration Failed</h2>");
            }
        }
    }
}