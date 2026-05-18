package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.CareerDAO;
import com.dao.EducationDAO;
import com.dao.FamilyDAO;
import com.dao.HoroscopeDAO;
import com.dao.LifestyleDAO;
import com.dao.UserDAO;

import com.portal.entity.Career;
import com.portal.entity.Education;
import com.portal.entity.Family;
import com.portal.entity.Horoscope;
import com.portal.entity.Lifestyle;
import com.portal.entity.User;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Get ID from URL
        String idParam = request.getParameter("id");

        // Check if ID exists
        if(idParam == null || idParam.isEmpty()) {

            response.getWriter().println("ID is missing");
            return;
        }

        // Convert String to Long
        Long id = Long.parseLong(idParam);

        // Get User
        User user = UserDAO.getUserById(id);

        // Check if user exists
        if(user == null) {

            response.getWriter().println("User not found");
            return;
        }

        // Set User
        request.setAttribute("user", user);

        // Get Education
        Education edu = EducationDAO.getEducationByUserId(user.getUser_id());
        request.setAttribute("education", edu);

        // Get Career
        Career career = CareerDAO.getCareerByUserId(user.getUser_id());
        request.setAttribute("career", career);

        // Get Family
        Family family = FamilyDAO.getFamilyByUserId(user.getUser_id());
        request.setAttribute("family", family);

        // Get Horoscope
        Horoscope h = HoroscopeDAO.getHoroscopeByUserId(user.getUser_id());
        request.setAttribute("horoscope", h);

        // Get Lifestyle
        Lifestyle l = LifestyleDAO.getLifestyleByUserId(user.getUser_id());
        request.setAttribute("lifestyle", l);

        // Forward to JSP
        request.getRequestDispatcher("profile.jsp")
               .forward(request, response);
    }
}