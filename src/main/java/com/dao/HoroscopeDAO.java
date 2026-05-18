package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBConnection.DBConnection;

import com.portal.entity.Horoscope;

public class HoroscopeDAO {

    public static boolean addHoroscope(
            Horoscope h){

        boolean status = false;

        try{

            Connection con =
            DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(

            "insert into Horoscope("
            + "user_id,"
            + "birthPlace,"
            + "dateAndTimeOfBirth,"
            + "rashi)"
            + " values(?,?,?,?)");

            ps.setLong(1,
            h.getUser_id().getUser_id());

            ps.setString(2,
            h.getBirthPlace());

            ps.setString(3,
            h.getDateAndTimeOfBirth());

            ps.setString(4,
            h.getRashi());

            int row =
            ps.executeUpdate();

            if(row > 0){

                status = true;
            }

        }catch(Exception e){

            e.printStackTrace();
        }

        return status;
    }
    
    
    public static Horoscope getHoroscopeByUserId(Long userId) {

        Horoscope h = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
            "select * from Horoscope where user_id=?";

            PreparedStatement ps =
            con.prepareStatement(sql);

            ps.setLong(1, userId);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                h = new Horoscope();

                h.setHoroscope_id(
                rs.getLong("horoscope_id"));

                h.setBirthPlace(
                rs.getString("birthPlace"));

                h.setDateAndTimeOfBirth(
                rs.getString("dateAndTimeOfBirth"));

                h.setRashi(
                rs.getString("rashi"));
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return h;
    }
}