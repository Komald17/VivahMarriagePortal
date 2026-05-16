<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Family Details</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:#f5f5f5;
}

.container{
    width:900px;
    height:600px;
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

</style>

</head>

<body>

<div class="container">

    <!-- LEFT IMAGE -->

    <div class="left">

        <img src="fm.jpg"
             alt="Family Image">

    </div>

    <!-- RIGHT FORM -->

    <div class="right">

        <div class="form-box">

            <h2>Family Details</h2>

            <form action="FamilyServlet"
                  method="post">

                <div class="input-box">

                    <textarea
                    name="familyBackground"
                    placeholder="Family Background"></textarea>

                </div>

                <div class="input-box">

                    <input type="text"
                           name="fathersOccupation"
                           placeholder="Father Occupation">

                </div>

                <div class="input-box">

                    <input type="text"
                           name="mothersOccupation"
                           placeholder="Mother Occupation">

                </div>

                <div class="input-box">

                    <input type="text"
                           name="noOfBrothers"
                           placeholder="No Of Brothers">

                </div>

                <div class="input-box">

                    <input type="text"
                           name="noOfSisters"
                           placeholder="No Of Sisters">

                </div>

                <div class="input-box">

                    <input type="text"
                           name="familyBase"
                           placeholder="Family Base">

                </div>

                <button type="submit"
                        class="btn">

                    Save Family

                </button>

            </form>

        </div>

    </div>

</div>

</body>
</html>