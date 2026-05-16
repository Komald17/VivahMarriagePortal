package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBConnection.DBConnection;

import com.portal.entity.Career;

public class CareerDAO {

    public static boolean addCareer(Career c) {

        boolean status = false;
        System.out.println("comming to the dao file ");

        try {
            System.out.println("Start connection");

            Connection con =
            DBConnection.getConnection();

            String query=
            "INSERT INTO Career(user_id,"
            		+"aboutJob,"
            		+"employedIn,"
            		+"occupation,"
            		+ "earnings,"
            		+ "jobLocatin)"
            		+ " VALUES(?,?,?,?,?,?)";
                   
            PreparedStatement ps =
                    con.prepareStatement(query);
            
            System.out.println("start insert value ");
            
            ps.setLong(1,
            c.getUser_id().getUser_id());

            ps.setString(2,
            c.getAboutJob());

            ps.setString(3,
            c.getEmployedIn());

            ps.setString(4,
            c.getOccupation());

            ps.setString(5,
            c.getEarnings());

            ps.setString(6,
            c.getJobLocatin());

            int i = ps.executeUpdate();

            if(i > 0) {

                status = true;
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return status;
    }
    
    
    public static Career getCareerByUserId(Long userId) {

        Career c = null;

        try {

            Connection con =
            DBConnection.getConnection();

           String query=
            "select * from Career where user_id=?";
           
           PreparedStatement ps =
                   con.prepareStatement(query);

            ps.setLong(1, userId);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()) {

                c = new Career();

                c.setCareer_id(
                rs.getLong("career_id"));

                c.setAboutJob(
                rs.getString("aboutJob"));

                c.setEmployedIn(
                rs.getString("employedIn"));

                c.setOccupation(
                rs.getString("occupation"));

                c.setEarnings(
                rs.getString("earnings"));

                c.setJobLocatin(
                rs.getString("jobLocatin"));
            }
            else{

                System.out.println(
                "Career NOT Found");
            }

        } catch(Exception e) {

            e.printStackTrace();
        }

        return c;
    }
}