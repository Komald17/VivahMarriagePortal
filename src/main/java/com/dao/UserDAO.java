package com.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.portal.entity.User;

import DBConnection.DBConnection;

public class UserDAO {

	public static boolean addUser(User u) {

	    boolean status = false;

	    try {

	        Connection con =
	                DBConnection.getConnection();

	        String sql =
	        "INSERT INTO users(first_name,last_name,email,password_hash,phone_number,gender,date_of_birth,caste,sub_caste,profile_picture,wallet_balance) VALUES(?,?,?,?,?,?,?,?,?,?,?)";

	        PreparedStatement ps =
	                con.prepareStatement(sql);

	        ps.setString(1,
	                u.getFirst_name());

	        ps.setString(2,
	                u.getLast_name());

	        ps.setString(3,
	                u.getEmail());

	        ps.setString(4,
	                u.getPassword_hash());

	        ps.setString(5,
	                u.getPhone_number());

	        ps.setString(6,
	                u.getGender());

	        ps.setDate(7,
	        java.sql.Date.valueOf(
	                u.getDate_of_birth()));

	        ps.setString(8,
	                u.getCaste());

	        ps.setString(9,
	                u.getSub_caste());

	        // IMAGE SAVE

	        ps.setBytes(10,
	                u.getProfile_picture());

	        ps.setDouble(11,
	                u.getWallet_balance());

	        int i =
	                ps.executeUpdate();

	        if(i > 0) {

	            status = true;
	        }

	    } catch(Exception e) {

	        e.printStackTrace();
	    }

	    return status;
	}
    
	public static User getUserById(Long id) {

	    User u = null;

	    try {

	        Connection con =
	        DBConnection.getConnection();

	        PreparedStatement ps =
	        con.prepareStatement(
	        "select * from users where user_id=?");

	        ps.setLong(1, id);

	        ResultSet rs = ps.executeQuery();

	        if(rs.next()) {

	            u = new User();

	            u.setUser_id(
	            rs.getLong("user_id"));

	            u.setFirst_name(
	            rs.getString("first_name"));

	            u.setLast_name(
	            rs.getString("last_name"));

	            u.setEmail(
	            rs.getString("email"));
	        

	            u.setPhone_number(
	            rs.getString("phone_number"));
	          
	         
	            u.setDate_of_birth(
	            		rs.getDate("date_of_birth")
	            		.toLocalDate());
	            
	            u.setGender(
	            rs.getString("gender"));

	            u.setCaste(
	            rs.getString("caste"));

	            u.setSub_caste(
	            rs.getString("sub_caste"));
	        }

	    } catch(Exception e) {

	        e.printStackTrace();
	    }

	    return u;
	
    }
	
	public static boolean updateUser(User u) {

	    boolean status = false;

	    try {

	        Connection con =
	        DBConnection.getConnection();

	        PreparedStatement ps =
	        con.prepareStatement(

	        "update users set first_name=?,"
	      + "last_name=?,"
	      + "email=?,"
	      + "phone_number=?,"
	      
	      + "gender=?,"
	      + "caste=?,"
	      + "sub_caste=? "
	      + "where user_id=?"

	        );

	        ps.setString(1,
	        u.getFirst_name());

	        ps.setString(2,
	        u.getLast_name());

	        ps.setString(3,
	        u.getEmail());

	        ps.setString(4,
	        u.getPhone_number());

	        ps.setString(5,
	        u.getGender());

	        ps.setString(6,
	        u.getCaste());

	        ps.setString(7,
	        u.getSub_caste());

	        ps.setLong(8,
	        u.getUser_id());

	        int i = ps.executeUpdate();

	        if(i > 0){

	            status = true;
	        }

	    } catch(Exception e){

	        e.printStackTrace();
	    }

	    return status;
	}
}