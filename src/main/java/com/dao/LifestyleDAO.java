package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBConnection.DBConnection;

import com.portal.entity.Horoscope;
import com.portal.entity.Lifestyle;

public class LifestyleDAO {

    public static boolean addLifestyle(
            Lifestyle l) {

        boolean status = false;

        try {

            Connection con =
            DBConnection.getConnection();

            String sql =
            "insert into lifestyle(user_id,eatingHabit,isDrink,isSmoke) values(?,?,?,?)";

            PreparedStatement ps =
            con.prepareStatement(sql);

            ps.setLong(1,
            l.getUser_id().getUser_id());

            ps.setString(2,
            l.getEatingHabit());

            ps.setString(3,
            l.getIsDrink());

            ps.setString(4,
            l.getIsSmoke());

            int i = ps.executeUpdate();

            if(i > 0){

                status = true;
            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return status;
    }
    
    public static Lifestyle getLifestyleByUserId(Long userId) {

    	Lifestyle l = null;

        try {

            Connection con = DBConnection.getConnection();

            String sql =
            "select * from lifestyle where user_id=?";

            PreparedStatement ps =
            con.prepareStatement(sql);

            ps.setLong(1, userId);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                l = new Lifestyle();

                l.setEatingHabit(rs.getString("eatingHabit"));

                l.setIsDrink(rs.getString("isDrink"));

                l.setIsSmoke(rs.getString("isSmoke"));

            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return l;
    }
    
}
