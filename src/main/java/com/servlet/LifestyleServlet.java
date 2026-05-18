package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.LifestyleDAO;
import com.portal.entity.Lifestyle;
import com.portal.entity.User;

@WebServlet("/LifestyleServlet")
public class LifestyleServlet
extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session =
        request.getSession();

        User user =
        (User) session.getAttribute("user");

        if(user == null){

            response.getWriter().println(
            "User Session Expired");

            return;
        }

        Lifestyle l = new Lifestyle();

        l.setUser_id(user);

        l.setEatingHabit(
        request.getParameter(
        "eatingHabit"));

        l.setIsDrink(
        request.getParameter(
        "isDrink"));

        l.setIsSmoke(
        request.getParameter(
        "isSmoke"));

        boolean status =
        LifestyleDAO.addLifestyle(l);

        if(status){

        	response.sendRedirect(
        		    "ProfileServlet?id=" 
        		    + user.getUser_id());

        }else{

            response.getWriter().println(
            "Lifestyle Not Saved");
        }
    }
}