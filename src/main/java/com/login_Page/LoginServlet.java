package com.login_Page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.entity.User;

import DBConnection.DBConnection;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        System.out.println("Go to the try block");

        String email = request.getParameter("email");
        String password = request.getParameter("password_hash");

        try {
        	System.out.println("Under try block");

            Connection con = DBConnection.getConnection();
            System.out.println("Conection start ");
            PreparedStatement ps = con.prepareStatement(
            "select * from Users where email=? and password_hash=?");
            System.out.println("Query Exicuted...");
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            System.out.println("Resultset Exicuted...");
            
            if(rs.next()){

                System.out.println("Login Success");

                // Create User object
                User user = new User();

                user.setUser_id(rs.getLong("user_id"));
                user.setEmail(rs.getString("email"));

                // Create Session
                HttpSession session = request.getSession();

                // Store user in session
                session.setAttribute("user", user);

                System.out.println("Session Added Successfully");
                System.out.println(session.getAttribute("user"));

                response.sendRedirect("education.jsp");

            } else {

                response.getWriter().println(
                "<h2>Invalid Email or Password</h2>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
