<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lifestyle Details</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#ffe6eb;
}

.container{
    width:900px;
    height:500px;
    background:white;
    margin:40px auto;
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

.form-box{
    width:320px;
}

h2{
    text-align:center;
    color:#ff4d6d;
}

input{
    width:100%;
    padding:12px;
    margin-top:15px;
    border:1px solid #ccc;
    border-radius:5px;
}

button{
    width:100%;
    padding:12px;
    margin-top:20px;
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

</style>

</head>

<body>

<div class="container">

    <!-- Left Image -->

    <div class="left">

        <img src="LS.jpg"
             alt="Lifestyle Image">

    </div>

    <!-- Right Form -->

    <div class="right">

        <div class="form-box">

            <h2>Lifestyle Details</h2>

            <form action="LifestyleServlet"
                  method="post">

                <input type="text"
                       name="eatingHabit"
                       placeholder="Eating Habit">

                <input type="text"
                       name="isDrink"
                       placeholder="Do You Drink ?">

                <input type="text"
                       name="isSmoke"
                       placeholder="Do You Smoke ?">

                <button type="submit">

                    Save Lifestyle

                </button>

            </form>

        </div>

    </div>

</div>

</body>
</html>