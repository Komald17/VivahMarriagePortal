package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EducationDAO;
import com.portal.entity.Education;
import com.portal.entity.User;

@WebServlet("/EducationServlet")
public class EducationServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        // GET SESSION
        HttpSession session = req.getSession();

        // GET USER FROM SESSION
        User u = (User) session.getAttribute("user");

        // CHECK USER
        if (u == null) {

            System.out.println("User session expired");

            res.sendRedirect("Login.jsp");
            return;
        }

        // CREATE EDUCATION OBJECT
        Education e = new Education();

        // SET USER
        e.setUser_id(u);

        // SET FORM DATA
        e.setAboutEducation(
                req.getParameter("aboutEducation"));

        e.setPostGraduation(
                req.getParameter("postGraduation"));

        e.setUnderGraduation(
                req.getParameter("underGraduation"));

        // SAVE DATA
        boolean status =
                EducationDAO.addEducation(e);

        if (status) {

            System.out.println("Education Added");

            res.sendRedirect("career.jsp");

        } else {

            res.getWriter().println(
                    "<h2>Failed</h2>");
        }
    }
}