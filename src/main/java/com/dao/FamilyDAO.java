package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBConnection.DBConnection;

import com.portal.entity.Family;

public class FamilyDAO {

    public static boolean addFamily(Family f){

        boolean status = false;

        try{

            Connection con =
            DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(

            "insert into Family(user_id,"
            + "familyBackground,"
            + "fathersOccupation,"
            + "mothersOccupation,"
            + "noOfBrothers,"
            + "noOfSisters,"
            + "familyBase)"
            + " values(?,?,?,?,?,?,?)");

            ps.setLong(1,
            f.getUser_id().getUser_id());

            ps.setString(2,
            f.getFamilyBackground());

            ps.setString(3,
            f.getFathersOccupation());

            ps.setString(4,
            f.getMothersOccupation());

            ps.setString(5,
            f.getNoOfBrothers());

            ps.setString(6,
            f.getNoOfSisters());

            ps.setString(7,
            f.getFamilyBase());

            int row = ps.executeUpdate();

            if(row > 0){

                status = true;
            }

        }catch(Exception e){

            e.printStackTrace();
        }

        return status;
    }
    
    public static Family getFamilyByUserId(Long userId){

        Family f = null;

        try{

            Connection con =
            DBConnection.getConnection();

            PreparedStatement ps =
            con.prepareStatement(
            "select * from Family where user_id=?");

            ps.setLong(1, userId);

            ResultSet rs =
            ps.executeQuery();

            if(rs.next()){

                f = new Family();

                f.setFamily_id(
                rs.getInt("family_id"));

                f.setFamilyBackground(
                rs.getString("familyBackground"));

                f.setFathersOccupation(
                rs.getString("fathersOccupation"));

                f.setMothersOccupation(
                rs.getString("mothersOccupation"));

                f.setNoOfBrothers(
                rs.getString("noOfBrothers"));

                f.setNoOfSisters(
                rs.getString("noOfSisters"));

                f.setFamilyBase(
                rs.getString("familyBase"));
            }

        }catch(Exception e){

            e.printStackTrace();
        }

        return f;
    }
}
