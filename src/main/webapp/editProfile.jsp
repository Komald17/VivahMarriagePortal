<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="com.portal.entity.User" %>

<%
User u =
(User) request.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>

<style>

body{
    background:#ffe6eb;
    font-family:Arial;
}

.container{
    width:450px;
    background:white;
    margin:40px auto;
    padding:30px;
    border-radius:15px;
}

input,select{

    width:100%;
    padding:12px;
    margin-top:12px;
}

button{

    width:100%;
    padding:12px;
    margin-top:20px;
    background:#ff4d6d;
    color:white;
    border:none;
}

</style>

</head>
<body>

<div class="container">

<h2>Edit Profile</h2>

<form action="UpdateProfileServlet"
      method="post">

<input type="hidden"
       name="user_id"
       value="<%=u.getUser_id()%>">

<input type="text"
       name="first_name"
       value="<%=u.getFirst_name()%>">

<input type="text"
       name="last_name"
       value="<%=u.getLast_name()%>">

<input type="email"
       name="email"
       value="<%=u.getEmail()%>">

<input type="text"
       name="phone"
       value="<%=u.getPhone_number()%>">

<select name="gender">

<option><%=u.getGender()%></option>

<option>Male</option>

<option>Female</option>

</select>

<input type="text"
       name="caste"
       value="<%=u.getCaste()%>">

<input type="text"
       name="sub_caste"
       value="<%=u.getSub_caste()%>">

<button type="submit">

Update Profile

</button>

</form>

</div>

</body>
</html>