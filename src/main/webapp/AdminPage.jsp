<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>

<style>

*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body{
    background:#ffe6eb;
}

/* Navbar */

.navbar{
    width:100%;
    background:#ff4d6d;
    padding:15px 50px;
    color:white;
    font-size:28px;
    font-weight:bold;
}

/* Form Box */

.container{
    width:450px;
    background:white;
    margin:50px auto;
    padding:30px;
    border-radius:12px;
    box-shadow:0px 0px 10px gray;
}

.container h2{
    text-align:center;
    color:#ff4d6d;
    margin-bottom:20px;
}

input{
    width:100%;
    padding:12px;
    margin-top:12px;
    border:1px solid #ccc;
    border-radius:5px;
    font-size:15px;
}

button{
    width:100%;
    padding:12px;
    margin-top:15px;
    border:none;
    background:#ff4d6d;
    color:white;
    font-size:16px;
    border-radius:5px;
    cursor:pointer;
}

button:hover{
    background:#e63956;
}

/* Table */

table{
    width:100%;
    margin-top:25px;
    border-collapse:collapse;
}

table,th,td{
    border:1px solid #ccc;
}

th{
    background:#ff4d6d;
    color:white;
}

th,td{
    padding:12px;
    text-align:center;
}

.no-data{
    text-align:center;
    color:red;
    margin-top:15px;
}

</style>

</head>
<body>

<div class="navbar">
    Vivah Marriage Portal Admin
</div>

<div class="container">

    <h2>Admin Registration</h2>

    <!-- FORM START -->

    <form action="AdminServlet" method="post">

        <input type="hidden" name="action" value="register">

        <input type="text"
               name="username"
               placeholder="Enter Username"
               required>

        <input type="password"
               name="password"
               placeholder="Enter Password"
               required>

        <button type="submit">
            Save Admin
        </button>

    </form>

    <!-- FORM END -->

    <!-- TABLE START -->

    <table>

        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Created At</th>
        </tr>

        <c:forEach items="${list}" var="a">

            <tr>

                <td>${a.adminId}</td>
                <td>${a.username}</td>
                <td>${a.createdAt}</td>

            </tr>

        </c:forEach>

    </table>

    <!-- IF NO DATA -->

    <c:if test="${empty list}">
        <p class="no-data">No Admin Records Found</p>
    </c:if>

</div>

</body>
</html>