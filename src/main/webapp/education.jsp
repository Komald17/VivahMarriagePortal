<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Education Details</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#f5f5f5;
}

.container{
    width:900px;
    height:550px;
    background:white;
    margin:40px auto;
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
    width:110%;
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

.form-box{
    width:320px;
}

.form-box h2{
    text-align:center;
    color:#ff4d6d;
    margin-bottom:20px;
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
    font-size:14px;
}

textarea{
    resize:none;
    height:80px;
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


.back-btn{
    padding:10px 20px;
    background:#ff4d6d;
    color:white;
    border:none;
    border-radius:5px;
    cursor:pointer;
    font-size:16px;
}

.back-btn:hover{
    background:#e63956;
}

</style>

</head>
<body>

<div class="container">

    <!-- LEFT IMAGE -->

    <div class="left">

        <img src="edu.png"
             alt="Education Image">

    </div>

    <!-- RIGHT FORM -->

    <div class="right">

        <div class="form-box">

            <h2>Education Details</h2>

            <form action="EducationServlet"
                  method="post">

                <!-- REMOVE USER ID -->

                <div class="input-box">

                    <textarea name="aboutEducation"
                    placeholder="About Education"></textarea>

                </div>

                <div class="input-box">

                    <input type="text"
                           name="postGraduation"
                           placeholder="Post Graduation">

                </div>

                <div class="input-box">

                    <input type="text"
                           name="underGraduation"
                           placeholder="Under Graduation">

                </div>

                <button type="submit"
                        class="btn">

                    Save Education

                </button>
                <br><br>
                
                <a href="UserRegister.jsp">
    <button class="back-btn">
        Back
    </button>
    </a>

            </form>

        </div>

    </div>

</div>

</body>
</html>