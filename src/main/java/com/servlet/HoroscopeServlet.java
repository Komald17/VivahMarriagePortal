package com.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.HoroscopeDAO;
import com.portal.entity.Horoscope;
import com.portal.entity.User;

@WebServlet("/HoroscopeServlet")
public class HoroscopeServlet extends HttpServlet {

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
            "login.jsp");

            return;
        }

        // CREATE OBJECT
        Horoscope h =
        new Horoscope();

        // SET USER
        h.setUser_id(user);

        // SET FORM DATA
        h.setBirthPlace(
        request.getParameter(
        "birthPlace"));

        h.setDateAndTimeOfBirth(
        request.getParameter(
        "dateAndTimeOfBirth"));

        h.setRashi(
        request.getParameter(
        "rashi"));

        // SAVE DATA
        boolean status =
        HoroscopeDAO.addHoroscope(h);
        if(status){

            response.sendRedirect("lifestyle.jsp");


        }else{

            response.getWriter().println(
            "<h2>Horoscope Not Saved</h2>");
        }
    }
}
