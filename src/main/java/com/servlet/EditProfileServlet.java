package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.UserDAO;
import com.portal.entity.User;

@WebServlet("/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        Long id =
        Long.parseLong(request.getParameter("id"));

        User user =
        UserDAO.getUserById(id);

        request.setAttribute("user", user);

        request.getRequestDispatcher("editProfile.jsp")
               .forward(request, response);
    }
}