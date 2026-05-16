package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.portal.entity.Education;

import DBConnection.DBConnection;

public class EducationDAO {

    public static boolean addEducation(Education e) {

        boolean status = false;

        try {

            Connection con =
                    DBConnection.getConnection();

            String query =
            "insert into education(user_id,"
            + "aboutEducation,"
            + "postGraduation,"
            + "underGraduation)"
            + " values(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setLong(1,
                    e.getUser_id().getUser_id());

            ps.setString(2,
                    e.getAboutEducation());

            ps.setString(3,
                    e.getPostGraduation());

            ps.setString(4,
                    e.getUnderGraduation());

            int i = ps.executeUpdate();

            if(i > 0) {

                status = true;
            }

        } catch(Exception ex) {

            ex.printStackTrace();
        }

        return status;
    }
    
    public static Education getEducationByUserId(Long user_id){

        Education e = null;

        try {

            Connection con =
            DBConnection.getConnection();

            String query =
            "select * from Education where user_id=?";

            PreparedStatement ps =
            con.prepareStatement(query);

            ps.setLong(1, user_id);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()){

                e = new Education();

                e.setAboutEducation(
                rs.getString("aboutEducation"));

                e.setPostGraduation(
                rs.getString("postGraduation"));

                e.setUnderGraduation(
                rs.getString("underGraduation"));

                System.out.println(
                "Education Found");
            }
            else{

                System.out.println(
                "Education NOT Found");
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return e;
    }
}