package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.FamilyDAO;
import com.portal.entity.Family;
import com.portal.entity.User;

@WebServlet("/FamilyServlet")
public class FamilyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // GET SESSION
        HttpSession session =
        request.getSession();

        // GET USER
        User user =
        (User) session.getAttribute("user");

        // CHECK USER
        if(user == null){

            response.sendRedirect(
            "Login.jsp");

            return;
        }

        // CREATE OBJECT
        Family f = new Family();

        // SET USER
        f.setUser_id(user);

        // SET FORM DATA
        f.setFamilyBackground(
        request.getParameter(
        "familyBackground"));

        f.setFathersOccupation(
        request.getParameter(
        "fathersOccupation"));

        f.setMothersOccupation(
        request.getParameter(
        "mothersOccupation"));

        f.setNoOfBrothers(
        request.getParameter(
        "noOfBrothers"));

        f.setNoOfSisters(
        request.getParameter(
        "noOfSisters"));

        f.setFamilyBase(
        request.getParameter(
        "familyBase"));

        // SAVE DATA
        boolean status =
        FamilyDAO.addFamily(f);

        if(status){

            response.sendRedirect(
            "ProfileServlet?id="
            + user.getUser_id());

        }else{

            response.getWriter().println(
            "<h2>Family Not Saved</h2>");
        }
    }
}