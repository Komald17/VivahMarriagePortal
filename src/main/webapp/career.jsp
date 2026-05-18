<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Career Page</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#ffe6eb;
}

.container{
    width:900px;
    height:650px;
    background:white;
    margin:30px auto;
    display:flex;
    border-radius:15px;
    overflow:hidden;
    box-shadow:0px 0px 10px gray;
}

/* LEFT IMAGE */

.left{
    width:50%;
}

.left img{
    width:100%;
    height:100%;
    object-fit:cover;
}

/* RIGHT FORM */

.right{
    width:50%;
    display:flex;
    justify-content:center;
    align-items:center;
}

.career-box{
    width:320px;
}

.career-box h2{
    text-align:center;
    margin-bottom:20px;
    color:#ff4d6d;
}

.input-box{
    margin-bottom:15px;
}

.input-box input,
.input-box textarea{
    width:100%;
    padding:12px;
    border:1px solid #ccc;
    border-radius:5px;
}

textarea{
    height:70px;
    resize:none;
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

    <!-- LEFT SIDE IMAGE -->

    <div class="left">

        <img src="carrer.jpg" alt="Career Image">

    </div>

    <!-- RIGHT SIDE FORM -->

    <div class="right">

        <div class="career-box">

            <h2>Career Information</h2>

            <form action="CareerServlet"
                  method="post">
                  

                <div class="input-box">

                    <textarea name="aboutJob"
                    placeholder="About Job"></textarea>

                </div>

                <div class="input-box">

                    <input type="text"
                    name="employedIn"
                    placeholder="Employed In">

                </div>

                <div class="input-box">

                    <input type="text"
                    name="occupation"
                    placeholder="Occupation">

                </div>

                <div class="input-box">

                    <input type="text"
                    name="earnings"
                    placeholder="Earnings">

                </div>

                <div class="input-box">

                    <input type="text"
                    name="jobLocatin"
                    placeholder="Job Location">

                </div>


                <button type="submit" class="btn">

                    Save Career

                </button>

            </form>

        </div>

    </div>

</div>

</body>
</html>