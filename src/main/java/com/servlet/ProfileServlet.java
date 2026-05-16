package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.CareerDAO;
import com.dao.EducationDAO;
import com.dao.FamilyDAO;
import com.dao.UserDAO;
import com.portal.entity.Career;
import com.portal.entity.Education;
import com.portal.entity.Family;
import com.portal.entity.User;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        // Get id from URL
        Long id = Long.parseLong(
                request.getParameter("id"));

        // Get User
        User user = UserDAO.getUserById(id);

        // Set user
        request.setAttribute("user", user);

        // Get education
        Education edu =
        EducationDAO.getEducationByUserId(
                user.getUser_id());

        // Set education
        request.setAttribute("education", edu);
        
        

        // GET CAREER
        Career career =
        CareerDAO.getCareerByUserId(id);

        // SET CAREER
        request.setAttribute(
        "career", career);
        
     // GET FAMILY
        Family family =
        FamilyDAO.getFamilyByUserId(id);

        // SET FAMILY
        request.setAttribute(
        "family", family);

        // Forward
        request.getRequestDispatcher("profile.jsp")
               .forward(request, response);
    }
}