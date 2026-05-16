package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.dao.UserDAO;
import com.portal.entity.User;

@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        User u = new User();

        u.setUser_id(
        Long.parseLong(
        request.getParameter("user_id")));

        u.setFirst_name(
        request.getParameter("first_name"));

        u.setLast_name(
        request.getParameter("last_name"));

        u.setEmail(
        request.getParameter("email"));

        u.setPhone_number(
        request.getParameter("phone"));

        u.setGender(
        request.getParameter("gender"));

        u.setCaste(
        request.getParameter("caste"));

        u.setSub_caste(
        request.getParameter("sub_caste"));

        boolean status =
        UserDAO.updateUser(u);

        if(status){

            response.sendRedirect(
            "ProfileServlet?email="
            + u.getEmail());

        }else{

            response.getWriter()
            .println("Update Failed");
        }
    }
}