package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.CareerDAO;
import com.portal.entity.Career;
import com.portal.entity.User;

@WebServlet("/CareerServlet")
public class CareerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // GET SESSION
        HttpSession session = request.getSession();

        // GET USER FROM SESSION
        User user =
        (User) session.getAttribute("user");

        System.out.println(
        "Session User = " + user);

        // CHECK USER
        if(user == null){

            System.out.println(
            "User is NULL");

            response.sendRedirect(
            "family.jsp");

            return;
        }


        // CREATE CAREER OBJECT
        Career c = new Career();

        // SET USER
        c.setUser_id(user);

        // SET FORM DATA
        c.setAboutJob(
        request.getParameter("aboutJob"));

        c.setEmployedIn(
        request.getParameter("employedIn"));

        c.setOccupation(
        request.getParameter("occupation"));

        c.setEarnings(
        request.getParameter("earnings"));

        c.setJobLocatin(
        request.getParameter("jobLocatin"));

        System.out.println(
        "Set all details");

        // SAVE DATA
        boolean status =
        CareerDAO.addCareer(c);

        System.out.println(
        "Insert all value");

        // CHECK STATUS
        if (status) {

            System.out.println("Education Added");

            response.sendRedirect("family.jsp");

        } else {

            response.getWriter().println(
            "<h2>Career Not Saved</h2>");
        }
    }
}