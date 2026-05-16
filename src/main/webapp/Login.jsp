<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#f5f5f5;
}

.container{
    width:900px;
    height:500px;
    background:white;
    margin:50px auto;
    display:flex;
    border-radius:15px;
    overflow:hidden;
    box-shadow:0px 0px 10px gray;
}

.left{
    width:50%;
}

.left img{
    width:100%;
    height:100%;
    object-fit:cover;
}

.right{
    width:50%;
    display:flex;
    justify-content:center;
    align-items:center;
}

.login-box{
    width:300px;
}

.login-box h2{
    text-align:center;
    margin-bottom:20px;
    color:#ff4d6d;
}

.input-box{
    margin-bottom:15px;
}

.input-box input{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:5px;
}

.btn{
    width:100%;
    padding:12px;
    border:none;
    background:#ff4d6d;
    color:white;
    font-size:16px;
    border-radius:5px;
    cursor:pointer;
}

.btn:hover{
    background:#e63956;
}

</style>

</head>
<body>

<div class="container">

    <!-- Left Side Image -->
    <div class="left">
        <img src="login.jpg" alt="Login Image">
    </div>

    <!-- Right Side Login Form -->
    <div class="right">

        <div class="login-box">

            <h2>Vivah Marriage Portal</h2>

            <form action="login" method="post">

                <div class="input-box">
                    <input type="email" name="email" placeholder="Enter Email">
                </div>

                <div class="input-box">
                    <input type="password" name="password_hash" placeholder="Enter Password">
                </div>

                <button type="submit" class="btn">
                    Login
                </button>

            </form>

        </div>

    </div>

</div>

</body>
</html>