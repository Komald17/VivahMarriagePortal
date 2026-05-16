<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="com.portal.entity.User" %>
<%@ page import="com.portal.entity.Education" %>
<%@ page import="com.portal.entity.Career" %>
<%@ page import="com.portal.entity.Family" %>

<%
User u = (User) request.getAttribute("user");
%>

<%
Education edu =(Education) request.getAttribute("education");

%>
<%
Career career =(Career) request.getAttribute("career");
%>

<%
Family family =(Family) request.getAttribute("family");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>

<style>

body{
    background:#ffe6eb;
    font-family:Arial;
}

.card{

    width:400px;
    background:white;
    margin:40px auto;
    padding:30px;
    border-radius:15px;
    box-shadow:0px 0px 10px gray;
    text-align:center;
}

.card img{

    width:150px;
    height:150px;
    border-radius:50%;
    border:4px solid #000000;
}

.card h2{
    color:#ff4d6d;
    margin-top:15px;
}

.card h1{
    color:#000000;
    margin-top:15px;
}

.info{
    margin-top:20px;
    text-align:left;
}

.info p{
    margin:10px 0;
    font-size:17px;
}

</style>

</head>
<body>

<div class="card">

<img src="image?email=<%=u.getEmail()%>">

<h1>
<%=u.getFirst_name()%>
<%=u.getLast_name()%>
</h1>

<div class="info">

<h2>User Information</h2>


<table border="1" cellpadding="10">


<tr>
<th>Email :</th>
<td> <%=u.getEmail()%> </td>
</tr>

<tr>
<th>Phone :</th>
<td><%=u.getPhone_number()%></td>
</tr>

<tr>
<th>Date Of Birth :</th>
<td><%=u.getDate_of_birth()%></td>
</tr>

<tr>
<th>Gender :</th>
<td><%=u.getGender()%></td>
</tr>

<tr>
<th>Caste :</th>
<td><%=u.getCaste()%></td>
</tr>

<tr>
<th>Sub Caste :</th>
<td> <%=u.getSub_caste()%></td>
</tr>

</table>
<br><br>
<a href="EditProfileServlet?id=<%=u.getUser_id()%>">

<button>Edit Profile</button>

</a>
</div>
</div>



<div class="card">
<div class="info">

<% if(edu != null){ %>

<h2>Education Information</h2>

<table border="1" cellpadding="10">

<tr>
<th> About Education :</th>
<td><%= edu.getAboutEducation() %></td>
</tr>

<tr>
<th>Post Graduation :</th>
<td><%= edu.getPostGraduation() %></td>
</tr>

<tr>
<th>Under Graduation :</th>
<td><%= edu.getUnderGraduation() %></td>
</tr>

<% } else { %>

<p>No Education Found</p>

<% } %>

</table>
</div>
</div>

<div class="card">
<div class="info">

<h2>Career Details</h2>

<table border="1" cellpadding="10">

<tr>
    <th>About Job</th>
    <td><%= career.getAboutJob() %></td>
</tr>

<tr>
    <th>Employed In</th>
    <td><%= career.getEmployedIn() %></td>
</tr>

<tr>
    <th>Occupation</th>
    <td><%= career.getOccupation() %></td>
</tr>

<tr>
    <th>Earnings</th>
    <td><%= career.getEarnings() %></td>
</tr>

<tr>
    <th>Job Location</th>
    <td><%= career.getJobLocatin() %></td>
    
</tr>
</table>
</div>
</div>

<div class="card">
<div class="info">
<h2>Family Details</h2>

<table border="1" cellpadding="10">

<tr>
    <th>Family Background</th>
    <td><%= family.getFamilyBackground() %></td>
</tr>

<tr>
    <th>Father Occupation</th>
    <td><%= family.getFathersOccupation() %></td>
</tr>

<tr>
    <th>Mother Occupation</th>
    <td><%= family.getMothersOccupation() %></td>
</tr>

<tr>
    <th>No Of Brothers</th>
    <td><%= family.getNoOfBrothers() %></td>
</tr>

<tr>
    <th>No Of Sisters</th>
    <td><%= family.getNoOfSisters() %></td>
</tr>

<tr>
    <th>Family Base</th>
    <td><%= family.getFamilyBase() %></td>
</tr>

</table>
</div>
</div>

</body>
</html>